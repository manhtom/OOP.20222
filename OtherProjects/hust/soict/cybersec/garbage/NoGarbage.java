// test text file contains nearly 100k words. No problem for StringBuffer...

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
            StringBuffer outputStringBuilder = new StringBuffer();
            for (byte b : inputBytes) {
                outputStringBuilder.append((char)b);
            }
            endTime=System.currentTimeMillis();
            System.out.println("Processing time for StringBuffer: "+ (endTime-startTime)+"ms");
        }

        catch (IOException e) {
            System.out.println("File not found. Ensure the path is correct.");
        }

    }
}
