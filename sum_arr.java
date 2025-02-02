import java.util.Scanner;
public class sum_arr {
    public static void main(String[] args) {
        int[] arr;
        int n;
        System.out.print("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the array is: " + sum);
    }
}
