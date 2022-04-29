import classintro.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;

import classintro.Readable;
import collections.FunctionalExamples;
import collections.Pair;
import exceptions.CustomException;
import exceptions.ExceptionsExamples;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    //skapar upp en logger som vi kan använda för att logga. Den är konfigurerad i src/main/resource/log4j2.xml
    private static final Logger log = LogManager.getLogger(Main.class);


    public static void main(String[] args) {
        //skapar ett nytt objekt book1 av typen Book
        Book book1 = new Book();
        //sätter värden på instansvariablerna
        book1.setNrOfPages(200);
        book1.setName("Ars Magna - sive de regulis algebraicis");
        book1.setPublishedDate(LocalDate.of(1545, 01,01));

        Book book2 = new Book(130, "De revolutionbus orbium coelestium", LocalDate.of(1550,01,01));
        Note note1 = new Note();

        //var keyword för att definera variabel
        var a = "a";
        var b = 3;

        //skapar objekt med interface eller superklassen som statisk typ.
        Readable note2 = new Note();
        Readable book3 = new Book();

        ReadableObject note3 = new Note();


        //olika typer av loggning. I filen src/main/resources/log4j2.xml ställer vi in log-level för projektet men kan även ställa in för enskilda klasser eller packages.
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");

        //skapar upp ett nytt objekt av Pair som då tar String och Book som typer.
        Pair<String, Book> pair = new Pair<>();
        pair.setValues("första boken", book1);

        System.out.println(book1);

        //Javas 8 primitive data types

        //a truth value; either true or false
        boolean boolPrimitive;

        //8 bits, -128-127
        byte bytePrimitive;

        //16 bits, -32768-32767
        short shortPrimitive;

        //32 bits , -2^31 - 2^31-1
        int integerPrimitive;

        //-2^63-2^63-1
        long longPrimitive;

        //floating point number 32 bits
        float floatPrimitve;

        //floating point number 64 bits
        double doublePrimitive;

        //16 bit value representing a single char
        char charPrimitive;

        Boolean boxedBooleam;

        Byte boxedByte;
        Short boxedShort;
        Integer boxedInteger;
        Long boxedLong;

        Float boxedFloat;
        Double boxedDouble;

        Character boxedChar;

        System.out.println(book1.getNrOfPages());
        System.out.println(book1.getName());
        System.out.println(book1.getPublishedDate());
        System.out.println(book2.getNrOfPages());
        System.out.println(book2.getName());
        System.out.println(book2.getPublishedDate());


        //Java är pass-by-value
        System.out.println(book1);
        changeReference(book1);
        System.out.println(book1);
        // book1 refererar till ett objekt som "heter" book1
        // a refererar också till book1
        //skapar ett nytt objekt b
        //sätter namnet på b
        //sätter att a nu refererar till b
        //vi har alltså inte ändrat på book1
        System.out.println(book1.getName());
        modifyReference(book1);
        // book1 refererar till ett objekt som "heter" book1
        // c refererar också till book1
        //sätter namnet på c
        //eftersom c refererar till book1 så ändras namnet även på book1
        System.out.println(book1.getName());

        List<String> stringList = List.of("martin","frisk");
        stringList = FunctionalExamples.listToUpperCase(stringList);
        stringList = FunctionalExamples.filterList(stringList);
        stringList.forEach(System.out::println);
        System.out.println(FunctionalExamples.numberOfStrings(stringList));


        try {
            FileInputStream fs = ExceptionsExamples.getFileThrowsException("somepath");
        } catch (FileNotFoundException e) {
            //hantera felet
        }

        try {
            FileInputStream fs2 = ExceptionsExamples.getFileHandlesFileExceptionButThrowsCustom("somepath");
        } catch (CustomException e) {
            //hantera felet
        }

        //java 15, text blocks
        String textblock = """
                {
                    "name" : "Martin",
                    "accounts" : [1234,5698]
                }
                """;

        System.out.println(textblock);

        //   java16 Records
        Point2DRecord point = new Point2DRecord(2,2);
        point.x();
        point.y();

        //helpful nullpointerexceptions

        Book nullPointerBook = new Book();
        nullPointerBook.getName().toUpperCase();


    }
    public static void changeReference(Book a) {
        Book b = new Book();
        b.setName("book b");
        a = b;
    }

    public static void modifyReference(Book c) {
        c.setName("c");
    }
    //använder för att skriva några små korta unit-tests
    public boolean isEven(int a){
        return a % 2 == 0;
    }
}
