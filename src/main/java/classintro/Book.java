package classintro;

import java.time.LocalDate;
import java.util.Objects;
//klassen Book ärver från ReadableObject och implementerar interfacet Readable
public class Book extends ReadableObject implements Readable {

    private int nrOfPages;
    private String name;

    //konstruktor - används för att skapa objekt av klassen
    public Book(int nrOfPages, String name, LocalDate publishedDate){
        super(publishedDate);
        this.nrOfPages = nrOfPages;
        this.name = name;

    }
    //behöver explicit skapa en no-arg konstruktor eftersom vi har en annan konstruktor i klassen.
    //skapar vi inte någon konstruktor alls får vi no-arg konstruktorn automatiskt.
    public Book() {}


    public int getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public void read() {
        System.out.println("Läser boken");
    }

    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        if(other instanceof Book newBook) {
            if(Objects.equals(newBook.getName(), this.getName())) {
                return true;
            }
        }
        return false;
    }

//    @Override
//    public int hashCode(){
//        //implementera denna om man har overridat equals
//    }

    @Override
    public String toString(){
        return "This the book: " + this.getName();
    }


}
