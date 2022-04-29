package collections;


//T och K är generiska värden
public class Pair<T,K> {

    private T first;
    private K second;

    public void setValues(T first, K second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public K getSecond(){
        return this.second;
    }
}
