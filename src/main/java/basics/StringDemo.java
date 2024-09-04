package basics;

import java.util.Objects;

public class StringDemo {


    public static void main(String[] args) {
        //String är inte en primitiv datatyp men har inbyggt stöd i språket. Strängar är objekt.
        String firstName = "Martin";
        //längden av en sträng får man genom att anropa length() på strängen
        System.out.println(firstName.length());

        //slå ihop strängar med + operatorn
        String lastName = "Efternamn";

        String fullName = firstName + lastName;

        System.out.println(fullName);

        //Från och med Java 15 finns stöd för Textblocks

        String longText = "om jag tidigare ville ha en sträng som var på två rader" +
                "var jag tvungen att slå ihop två strängar med plusoperatorn som gör här";
        String textBlock = """
                Men från Java15 och framåt finns stöd för 
                text blocks
                så jag kan skriva hur många rader
                jag vill
                """;
        //formatterade strängar kan skapas med String.format
        String catName = "Sotis";
        int age = 6;
        String formattedString = String.format("Min katt heter %s, han är %d år gammal",catName, age);
        "Min %S".formatted("katt");
        System.out.println(formattedString);

        //såhär kan man konvertera mellan strängar och datatyper för tal.

        //Sträng till int. Kastar ett NumberFormatException om den inte kan konvertera strängen till en int
        //ok - intValueFromString får värdet 7
        int intValueFromString = Integer.parseInt("7");
        //inte ok - kastar NumberFormatException
        //int noneIntValueFromString = Integer.parseInt("not an integer");

        //int till sträng
        int a = 1;

        //metod 1
        String aAsString1 = a + "";

        //metod 2
        String aAsString2= Integer.toString(a);

        //metod 3
        String aAsString3 = String.valueOf(a);

        //"bra-att-ha"-metoder för strängar
        //substring ger precis som metoden säger en substring av en sträng.
        String longString = "abcdefghjklmnoa";
        // startindex 0 inklusive, slutindex 4 exklusive
        String shorterString = longString.substring(0,4);
        System.out.println(shorterString);

        //hämta en char på en specifik plats i en sträng
        char aChar = longString.charAt(0);

        //split, splittar upp en sträng i flera strängar och lägger dem i en array
        String toBeSplit = "a,b,c,d";
        String[] splittedStrings = toBeSplit.split(",");
        for(var s: splittedStrings){
            System.out.println("split blev: "+ s);
        }

        //toLowerCase, toUpperCase. Gör om en sträng till stora eller små bokstäver
        System.out.println(longString.toUpperCase());

        //trim, ta bort whitespace
        String stringWithWhitespace = "     hej    ";
        System.out.println("a"+stringWithWhitespace+ "b");
        System.out.println("a"+stringWithWhitespace.trim()+ "b");

        //ändra alla förekomster av en substring till något annat
        String changedString = longString.replace("a", "MARTIN");
        System.out.println(changedString);

        //kolla om en sträng börjar eller slutar med en given substring
        System.out.println("Börjar denna strängen med a?: " + longString.startsWith("a"));
        System.out.println("Slutar denna strängen med K?: " + longString.endsWith("k"));

        //Jämför strängar med equals och inte ==
        String stringOne = "23";
        String stringTwo = "23";
        //inte garanterat att det kommer returnera true, kommer troligtvis göra det i detta fallet då JVM:en gör optimeringar internt
        System.out.println(stringOne == stringTwo);
        //använd istället equals
        System.out.println(stringOne.equals(stringTwo));
        //risk för NullPointerException dock om stringOne är null
        stringOne=null;
        //System.out.println(stringOne.equals(stringTwo)); //kastar NullPointerException
        //använd istället Objects.equals eller använd en konstant sträng och anropa equals på den om vi vet vad vi vill jämföra mot
        System.out.println("23".equals(stringOne));
        System.out.println(Objects.equals(stringOne, stringTwo));






    }


}
