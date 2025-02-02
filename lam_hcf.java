import java.util.Scanner;
public class lam_hcf {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int hcf=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF of "+a+" and "+b+" is: "+hcf);
        System.out.println("LCM of "+a+" and "+b+" is: "+(a*b)/hcf);
    }
}
