package classintro;

public class Note extends ReadableObject implements Readable {

    public Note() {}

    @Override
    public void read() {
        System.out.println("läser lappen");
    }
}
