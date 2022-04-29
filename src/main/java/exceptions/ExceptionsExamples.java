package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsExamples {

    private final static Logger log = LogManager.getLogger(ExceptionsExamples.class);

    public static FileInputStream getFileThrowsException(String path) throws FileNotFoundException {
        File file = new File(path);
        FileInputStream stream = new FileInputStream(file);
        return stream;
    }

    public static FileInputStream getFileHandlesFileExceptionButThrowsCustom(String path) throws CustomException {
        File file = new File(path);
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            log.error("FEL", e.getMessage());
            //vi kastar ett checked exception som måste hanteras av anroparen av vår metod
            throw new CustomException("Någonting gick fel");
        }
        return stream;
    }

}
