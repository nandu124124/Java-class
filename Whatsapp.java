
import java.util.Scanner;

abstract class Softwares { // Abstract class
    int phonenumber;
    int otp;

    void user_input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Phone number:");
        phonenumber = s.nextInt();
        System.out.println("Enter OTP:");
        otp = s.nextInt();
        // s.close(); // Removed to prevent resource leak
    }

    void user_login() {
        System.out.println("WELCOME TO WhatsApp:");
        System.out.println("................");
        System.out.println("Please login here:");
    }

    abstract void app_open();  // Abstract method
}

class WhatsApp extends Softwares { // Child class
    void app_open() {
        while (true) {
            if (phonenumber==1234567890 && otp==234) {
                System.out.println("Successfully Login, App is open");
                break;
            } else {
                System.out.println("Invalid Phone number and OTP. Please retry.");
                user_input();
            }
        }
    }
}

public class Apps1 {
    public static void main(String[] args) {
        WhatsApp a = new WhatsApp();
        a.user_login();
        a.user_input();
        a.app_open();
    }
}