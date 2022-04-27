package classintro;

import java.time.LocalDate;

public abstract class ReadableObject {

    protected LocalDate publishedDate;

    ReadableObject(LocalDate publishedDate){
        this.publishedDate = publishedDate;
    }

    public ReadableObject(){}

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
}
