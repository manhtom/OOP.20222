package garbage;

import java.util.Random;

public class ConcatenationInLoops {
public static void main(String[] args) {
        // testing + operator
        Random r = new Random(123);
        String s = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            s+=r.nextInt(2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Processing time for string concatenation using '+' operator: "+ (endTime-startTime)+"ms");

        // testing StringBuilder
        r = new Random(123);
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Processing time for string concatenation using StringBuilder: "+ (endTime-startTime)+"ms");

        // testing StringBuffer
        r = new Random(123);
        StringBuffer sb2 = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            sb2.append(r.nextInt(2));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Processing time for string concatenation using StringBuffer: "+ (endTime-startTime)+"ms");
    }
}
