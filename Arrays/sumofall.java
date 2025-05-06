import java.util.*;

public class sumofall {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arr [] = new int[5];
            arr[0] = 54;
            arr[1] = 45;
            arr[2] = 57;
            arr[3] = 62;
            arr[4] = 98;

            int sum = 0;
            for(int i=0;i<arr.length;i++){
                sum += arr[i];
                
            }
            System.out.println(sum);
            sc.close();
    }
    
}
