import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password, balance to create an account");

        //create bank account.
        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name, balance, password);
        user.setPassword(password);

        System.out.println(user.getAccountNo());

        //add money.
        String  message = user.addMoney(100000);
        System.out.println(message);

        //withDraw money.
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter Your Password");
        String pass = sc.next();
        System.out.println(user.withDrawMoney(money, pass));

        //rate of interest
        System.out.println(user.calculateInterest(10));
    }
}