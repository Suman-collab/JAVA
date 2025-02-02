import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        int[][] arr;
        int n, m;
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        m = sc.nextInt();
        arr = new int[n][m];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] arr2;
        int n2, m2;
        System.out.print("Enter the number of rows: ");
        n2 = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        m2 = sc.nextInt();
        arr2 = new int[n2][m2];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if (m != n2) {
            System.out.println("Multiplication not possible");
        } else {
            int[][] res = new int[n][m2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m; k++) {
                        res[i][j] += arr[i][k] * arr2[k][j];
                    }
                }
            }
            System.out.println("The resultant matrix is: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
