import java.util.*;

public class maxvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        arr[0] = 54;
        arr[1] = 45;
        arr[2] = 69;
        arr[3] = 86;
        
        int max = 0;
        for(int i=0; i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];               
            }
            
        }
        System.out.println(max);

        sc.close();
    }
}
