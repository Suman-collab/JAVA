import java.util.Scanner;
public class largest_3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int lar=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Largest number is: "+lar);
    }
}
