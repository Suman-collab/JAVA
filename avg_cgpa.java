import java.util.Scanner;
public class avg_cgpa {
    public static void main(String[] args) {
        int n = 5;
        double[] cgpa = new double[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Enter the CGPA of student "+(i+1)+": ");
            cgpa[i] = sc.nextDouble();
        }
        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += cgpa[i];
        }
        double avg = sum / n;
        System.out.println("Average Mark is: " + avg);
    }
}
