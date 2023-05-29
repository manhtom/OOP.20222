package garbage;

import java.io.IOException;
import java.nio.file.*;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "test.txt"; // test.txt is the name/path to a text file
        byte[] inputBytes= {0};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime= System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char)b);
        }
        endTime=System.currentTimeMillis();
        System.out.println("Processing time for StringBuilder: "+ (endTime-startTime)+"ms");
        }

        catch (IOException e) {
            System.out.println("File not found. Ensure the path is correct.");
        }

    }
}
