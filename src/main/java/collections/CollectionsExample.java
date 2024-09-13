package collections;

import classintro.Book;

import java.time.LocalDate;
import java.util.*;

public class CollectionsExample {

    public void listExamples(){


        //IDE varnar oss och vi kan inte kompilera nedan
        //List<Object> ol = new ArrayList<Integer>();

        //använd list där det går istället för arrays
        List<String> list = new ArrayList();

        List<Integer> lista = new ArrayList<>();
        list.add("Martin");
        System.out.println( list.size());

        Book book1 = new Book(100, "bok1", LocalDate.of(2022,01,01));
        Book book2 = new Book(56, "bok2", LocalDate.of(2022,02,01));

        List<Book> bookList = List.of(book1, book2);
        //skapar en Comparator för att avgöra hur vi ska jämföra två böcker.
        Comparator<Book> comparator = Comparator.comparing(Book::getNrOfPages).thenComparing(Book::getName);
        Collections.sort(bookList,comparator);

        //"enhanced" for-loop
        for (Book b: bookList) {
            System.out.println(b.getPublishedDate());
        }

        //"vanlig" for-loop
        for(int i=0;i<bookList.size();i++){
            System.out.println(bookList.get(i));
        }
        //forEach-metod på list-objektet som använder en method reference till System.out.println
        list.forEach(System.out::println);

        //tar bort från en list genom att använda en iterator
        Iterator<Book> iterator = bookList.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        List<String> strings = List.of("METAR", "TAF", "SIGMET", "AIREP", "SNOWTAM");


        List<String> newStrings = new ArrayList<>();
        for(int i = 0; i < strings.size(); i++) {
            String temp = strings.get(i);
            if(temp.length() >= 4) {
                newStrings.add(temp.substring(3,4));
            }

        }
        System.out.println(newStrings);


        List<String> newStringsEnhanced = new ArrayList<>();
        for(String temp: strings) {
            if(temp.length() >= 4) {
                newStringsEnhanced.add(temp.substring(3,4));
            }
        }
        System.out.println(newStringsEnhanced);

        List<String> newStringsFunctional = strings.stream().filter(s -> s.length() >= 4).map(s -> s.substring(3,4)).toList();
        System.out.println(newStringsFunctional);
    }

    public void mapExamples(){
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("key1", 3);
        stringIntegerMap.put("key2", 6);
        int one = stringIntegerMap.get("key1");
        int two = stringIntegerMap.get("key2");
        int three = stringIntegerMap.getOrDefault("key0",0);

        stringIntegerMap.keySet().forEach(System.out::println);
        stringIntegerMap.values().forEach(System.out::println);
    }


}
