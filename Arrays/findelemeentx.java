import java.util.*;

public class findelemeentx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Elements in Array:");
        int n = sc.nextInt();
       
       System.out.println("Enter the Elemnts in the array:");
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Number 'X' to be Finding in the Array:");
        int x = sc.nextInt();

        for(int i=0; i<n;i++){
            if(arr[i] == x){
                System.out.println("Number found at index arr["+i+"]" );
            }else{
                System.out.println("Not Found");
            }
        }
        sc.close();
    }
}
