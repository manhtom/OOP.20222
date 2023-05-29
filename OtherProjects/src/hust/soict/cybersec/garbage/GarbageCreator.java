// test text file contains nearly 100k words. May take a while...especially when "+" operator is used...

package hust.soict.cybersec.garbage;

import java.io.IOException;
import java.nio.file.*;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.txt"; // test.txt is the name/path to a text file
        byte[] inputBytes= {0};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime= System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char)b;
            }
            endTime=System.currentTimeMillis();
            System.out.println("Processing time for '+' operator: "+ (endTime-startTime)+"ms");
        }

        catch (IOException e) {
            System.out.println("File not found. Ensure the path is correct.");
        }
    }
}