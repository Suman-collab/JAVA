import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev=0;
            
        while(n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Single digit of the reversed number is: " + rev);
    }
}
