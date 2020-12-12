import java.util.Scanner;
public class montage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amount = sc.nextInt();
        System.out.println("Enter the rate:");
        double rate = sc.nextInt();
        System.out.println("Enter the time in years:");
        int time = sc.nextInt();
        
        rate=(rate/100)/12;
        
        time = time * 12;
        
              	double p= (amount * rate) / (1 - Math.pow(1 + rate, -time));

        System.out.println("payment:" + p);
        
        
  }
}
