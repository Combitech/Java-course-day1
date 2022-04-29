package collections;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalExamples {

    private static Predicate<String> stringPredicate = name -> name.startsWith("M");

    public static List<String> listToUpperCase(List<String> stringList){
        //två olika sätt att göra samma sak. inne i map gör samma sak både på rad 8 och 9
       //return stringList.stream().map(s -> s.toUpperCase()).toList();
       return stringList.stream().map(String::toUpperCase).toList();
    }

    public static List<String> filterList(List<String> stringlist){
        return stringlist.stream().filter(stringPredicate).toList();
    }

    public static long numberOfStrings(List<String> stringlist){
        return stringlist.stream().filter(stringPredicate).count();
    }

}
