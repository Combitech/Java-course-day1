package collections;

import classintro.Book;

import java.time.LocalDate;
import java.util.*;

public class CollectionsExample {

    public void listExamples(){

        String[] array = new String[1];

        //ger ett runtime-fel, alla klasser i Java ärver från Object
        Object[] objectArray = new Integer[1];
        objectArray[0] = "maritn";


        //IDE varnar oss och vi kan inte kompilera
        //List<Object> ol = new ArrayList<Integer>();

        array[0] = "Martin";



        List<String> list = new ArrayList();

        List<Integer> lista = new ArrayList<>();

        Integer int2= 3;


        list.add("Martin");
        System.out.println( list.size());
        Book book1 = new Book(100, "bok1", LocalDate.of(2022,01,01));
        Book book2 = new Book(56, "bok2", LocalDate.of(2022,02,01));
        List<Book> bookList = List.of(book1, book2);
        Comparator<Book> comparator = Comparator.comparing(Book::getNrOfPages).thenComparing(Book::getName);
        Collections.sort(bookList,comparator);

        for (Book b: bookList) {
            System.out.println(b.getPublishedDate());
        }
        for(int i=0;i<bookList.size();i++){
            System.out.println(bookList.get(i));
        }
        list.forEach(System.out::println);

        //remove from list using an iterator
        Iterator<Book> iterator = bookList.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
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
