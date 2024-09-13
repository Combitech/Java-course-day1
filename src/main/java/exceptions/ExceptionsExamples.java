package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ExceptionsExamples {

    public static void main(String[] args)  {
        try {
            List<Integer> numbers = getNumbersFromFile("src/main/resources/numbers.txt");
            int number = numbers.get(6);
        } catch (IOException e) {
            System.out.println("File does not exist");
        }
    }

    private static final  Logger log = LogManager.getLogger(ExceptionsExamples.class);

    public static List<Integer> getNumbersFromFile(String path) throws IOException {
        try (var reader = Files.newBufferedReader(Paths.get(path))) {
            return Arrays.stream(reader.readLine().split(",")).map(Integer::parseInt).toList();
        }
    }

    public static FileInputStream getFileHandlesFileExceptionButThrowsCustom(String path) throws CustomException {
        File file = new File(path);
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            log.error("FEL", e);
            //vi kastar ett checked exception som måste hanteras av anroparen av vår metod
            throw new CustomException("Någonting gick fel");
        }
        return stream;
    }

}
