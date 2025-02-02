import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        int[][]arr;
        int n, m;
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        m=sc.nextInt();
        arr = new int[n][m];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original matrix is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transposed matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
