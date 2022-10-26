import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        Random random = new Random();

        for(int i = 0; i< arr.length; i++){
            int tempToSwap = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[tempToSwap];
            arr[tempToSwap] = temp;
        }
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //Test comment
    }
}
