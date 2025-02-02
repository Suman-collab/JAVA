import java.util.Scanner;
public class swap {
    static void swap_(int[] arr){
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + " b = " + b);
        int[] arr = {a, b};
        swap_(arr);
        System.out.println("After swapping: a = " + arr[0] + " b = " + arr[1]);
    }
}
