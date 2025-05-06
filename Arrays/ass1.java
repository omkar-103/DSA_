
import java.util.*;
public class ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[5];
        arr[0]=45;
        arr[1] = 20;
        arr[2] = 55;
        arr[3] = 32;
        arr[4]= 51;

        for (int i=0; i<arr.length;i++){
            if(arr[i] < 35){
                System.out.println(i);
            }
            // System.out.println(arr[i]);
        }

        sc.close();
    }
}
