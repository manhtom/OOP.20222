import java.util.*;

public class Triangle {
    public static void main(String[]  args){
        System.out.print("Please enter n: ");
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println("");
        System.out.printf("The triangle with the height of %d stars:%n",n);
        for (int k=0; k < n; k++) {
            String d="%"+(2*(k+1)-1+n-1-k)+"s"+"%n"; 
            String star="";
            for (int j=1; j <= 2*(k+1)-1; j++){ 
                star=star+"*";
            }
            System.out.printf(d,star);

        }
    }
}
