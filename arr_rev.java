import java.util.Scanner;
public class arr_rev {
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
        System.out.print("The reversed array is: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
