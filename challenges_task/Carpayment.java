import java.util.Scanner;
public class Carpayment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the car price");
        double carprice=scanner.nextDouble();
        double  downpayment=50000;

        if (carprice<500000){
            System.out.println("Make full payment:"+ carprice);
        }
        else{
            double balance= carprice-downpayment;
            double installment= balance/12;
            System.out.println("Make a downpaymet of:"+ downpayment);
            System.out.println("Pay the rest in installment of: "+ installment+ "per month");
        }
        scanner.close();
    }
    
}
