package basics;

public class ControlFlowDemo {

    public static void main(String[] args) {
        //vanlig if-statement
        boolean test = true;
        if(test) {
            System.out.println(test);
        }
        //kan utesluta "måsvingar" om enbart ett statement inuti if
        //Jag personligen tycker inte om nedan, lätt att missa om man ska lägga till mer logik
        if(test)
            System.out.println(test);

        //if-else
        if(test) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //if else-if else
        if(test) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
