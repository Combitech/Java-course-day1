package basics;

public class VariablesDemo {

    //Instansvariabler (icke-statiska variabler). Dessa lagrar state för en instans av en klass, dvs har unika värden för varje objekt. De är deklarerade utan `static` keyword.
    //Variabelnamn börjar alltid (se undantaget nedan) med små bokstäver. Om enbart ett ord använd enbart små bokstäver.
    private int quantity;

    //instansvariabel
    //om variabelnamnet består av flera ord börja varje efterföljande ord med stor bokstav (camelCase).
    private String firstName;

    //Klassvariabel. En klassvariabel är deklarerad med `static` keyword; detta betyder att det endast finns en kopia av denna variabeln som delas mellan alla objekt av klassen. Exempelvis
    //en klass som representerar en hund skulle kunna ha en variabel som är `static` för antal ben. Då alla hundar har fyra ben och således skulle variabeln defineras som `static int numLegs = 4;`
    private static double someStaticValue;

    //En konstant, vi har lagt till keywordet final som för en variabel betyder att vi inte kan ändra dess värde. Konstanter brukar deklareras med stora bokstäver och understreck mellan ord.
    private static final int NUM_LEGS = 4;

    private static void methodWithLocalVariable(){
        //Lokala variabler. Dessa är variabler som är deklarerade inne i metoder. På samma sätt som ett objekt sparar sitt state i en instansvariabel så använder metoder lokala variabler för att
        //spara temporärt state. Det finns ingen speciell syntax för att deklarera en lokal variabel utan att den är lokal avgörs från var den är deklarerad.
        int number = 8;
        System.out.println(number);
        number = 7;
        System.out.println(number);
    }



    public static void main(String[] args) {
        methodWithLocalVariable();
        //number = 9; kompilerar inte. number är lokal variabel inne i metoden methodWithLocalVariable och vi kommer inte åt den utanför metoden.

    }




}
