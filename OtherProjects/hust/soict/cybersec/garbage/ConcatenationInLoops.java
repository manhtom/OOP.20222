// WARNING:
// More than 1 million (2^20) random integer strings are used in this string concatenation test.
// For "+" operator method, The runtime is extremely long (app. 45s on my test machine - your mileage may vary).
// You may see that the terminal appears to be hanging during '+' operator test phase but this is perfectly normal (due to the performance of this method).
// As expected, StringBuilder and StringBuffer produce much better execution time, with StringBuilder slightly faster.

package garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        // '+' operator test
        Random r = new Random(123);
        String s = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1048576; i++) {
            s+=r.nextInt(2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Processing time for string concatenation using '+' operator: "+ (endTime-startTime)+"ms");

        // StringBuilder test
        r = new Random(123);
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1048576; i++) {
            sb.append(r.nextInt(2));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Processing time for string concatenation using StringBuilder: "+ (endTime-startTime)+"ms");

        // StringBuffer test
        r = new Random(123);
        StringBuffer sb2 = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1048576; i++) {
            sb2.append(r.nextInt(2));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Processing time for string concatenation using StringBuffer: "+ (endTime-startTime)+"ms");
    }
}