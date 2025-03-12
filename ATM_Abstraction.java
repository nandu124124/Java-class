import java.util.Scanner;

abstract class ATM{
    double balance;
    ATM(double balance){
        this.balance=balance;
    }
    
    abstract void withdraw(double amount);
    abstract void deposite(double amount);
    abstract void checkbal();
}
class CBI extends ATM{
    CBI(double balance){
        super(balance);
    }
    
    // withdraw method
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("withdraw succussful ");
            System.out.println("Available balance "+balance);
        }
        else{
            System.out.println("no balance");
        }
    }
    
    // deposite method
    void deposite(double amount){
        if (amount > 0){
            balance+=amount;
            System.out.println("Deposite succussful ");
            System.out.println("Available balance "+balance);
        }
        else{
            System.out.println("Invalid amount ");
        }
    }
    
    //checkbal method
    void checkbal(){
        System.out.println("Available balance "+balance);
    }
}

public class ATM_Abstraction{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        CBI c = new CBI(1000);  //intial amt
        
        while(true){
            System.out.println("----- ATM Menu ----");
            System.out.println("1. withdraw money");
            System.out.println("2. Deposite money");
            System.out.println("3. check balance");
            System.out.println("4. Exit");
            System.out.println("Enter ur choice...");
            int choice=s.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter amount");
                    double wamt=s.nextDouble();
                    c.withdraw(wamt);
                    break;
                case 2:
                    System.out.println("Enter amount");
                    double amt=s.nextDouble();
                    c.deposite(amt);
                    break;
                case 3:
                    c.checkbal();
                    break;
                case 4:
                    System.out.println("Visit again");
                    s.close();
                    break;
                default:
                System.out.println("badmass");
            }
        }
    }
}