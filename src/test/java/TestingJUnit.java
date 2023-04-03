import org.junit.jupiter.api.*;

public class TestingJUnit {

    @BeforeAll
    public static void initialize(){
        System.out.println("Körs först av allt innan alla test-metoder körs");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("Körs sist av allt efter att tester körts");
    }

    @AfterEach
    public void runAfterEachTest(){
        System.out.println("Körs efter varje enskilt test");
    }

    @BeforeEach
    public void setup(){
        System.out.println("Körs före varje enskild test metod körs");
    }

    @Test
    public void numberIsEven(){
        Main m = new Main();
        boolean isEven = m.isEven(2);
        System.out.println("numberIsEven");

    }

    @Test
    public void numberIsNotEven(){
        Main m = new Main();
        boolean isEven = m.isEven(3);
        Assertions.assertFalse(isEven);
        System.out.println("numberIsNotEven");
    }
    @Test
    public void shouldThrowException(){
        String s = null;
        Assertions.assertThrows(NullPointerException.class, () -> s.equals("s"));
        System.out.println("shouldThrowException");

    }

    @Test
    public void shouldNotThrowException(){
        String s = "null";
        Assertions.assertDoesNotThrow(() -> s.equals("null"));
        System.out.println("shouldNotThrowException");

    }



}
