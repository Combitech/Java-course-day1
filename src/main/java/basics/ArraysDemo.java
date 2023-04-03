package basics;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        //deklarerar en array som innehåller heltal
        int[] intArray;

        //allokerar storleken på arrayen (5 heltal)
        intArray = new int[5];

        //initialiserar det första elementet
        intArray[0] = 2;
        //initialiserar det andra elementet
        intArray[1]=3;
        //osv
        intArray[2]=5;
        intArray[3]=7;
        intArray[4]=11;

        System.out.println("Värdet på index 0 i arrayen: " + intArray[0]);
        System.out.println("Värdet på index 1 i arrayen: " + intArray[1]);
        System.out.println("Värdet på index 2 i arrayen: " + intArray[2]);
        System.out.println("Värdet på index 3 i arrayen: " + intArray[3]);


        //kan även deklarera en array såhär:
        String[] stringArray = {"två", "tre", "fem", "sju", "elva"};

        //array av arrays, dvs en flerdimensionell array. Varje element i arrayen är i sin tur en array.
        int[][] multiDimArray = {{1,2,3}, {1,2,3}};
        System.out.println(multiDimArray[0][0]);
        System.out.println(multiDimArray[1][1]);


        //längden av en array kan man få genom att använda den inbyggda propertyn length
        System.out.println("Längden på intArray är: " + intArray.length);

        //java.utils.Arrays är en hjälpklass som innehåller "bra-att-ha"-metoder för arrayer
        //t.ex finns en sorteringsmetod; sort som kan användas för att sortera arrayen.
        Arrays.sort(intArray);

    }

}
