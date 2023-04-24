import java.util.Arrays;

public class ArrayManipulation {
    int[] arr;
    public ArrayManipulation(int[] input){ 
        arr = input;
    }
    public String displayArray(){
        return Arrays.toString(arr);
    }
    public int[] BubbleSort(){
        int temp=0;
        while (true){
            int swapped=0;
            for (int i=0;i<arr.length-1;i++){
                if (this.arr[i]>this.arr[i+1]){
                    temp=this.arr[i];
                    this.arr[i]=this.arr[i+1];
                    this.arr[i+1]=temp;
                    swapped=1;
                }
            }
            if (swapped==0){break;}
        }
        return arr;
    }
    public int calcSum(){
        int result=0;
        for (int i=0;i<arr.length;i++){
            result=result+this.arr[i];
        }
        return result;
    }

    public float calcAverage(){
        return this.calcSum()/this.arr.length;
    }
}
