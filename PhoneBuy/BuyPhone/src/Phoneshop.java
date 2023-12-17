import java.util.Scanner;

public class Phoneshop {
    private static Account account = new Account();
    private static Phoneshop phoneshop = new Phoneshop();
    Scanner scanner = new Scanner(System.in);

    ////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our store!!!");
        int choice = phoneshop.beginning();
        //initial interface,enable customers to log in to their store account
        while (choice != 0) {
            switch (choice) {
                case 1: {
                    account.register();
                    break;
                }
                case 2: {
                    account.loginin();
                    break;
                }
                default: {
                    System.out.println("Wrong choice!!!!!!!!!!!!!!!!!!!!!");
                    break;
                }

            }
            System.out.println("Press enter key to continue...");
            scanner.nextLine();
            choice = phoneshop.beginning();
        }
        //to end program
        System.out.println("Bye bye.Welcome to visit again!!");
        System.exit(0);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    private int beginning() {
        System.out.println("""
                --------------------please chose-------------------------------------
                        1)Register an account
                        2)Log in to your account
                        0)Leave store
                Attention:You must log in to your account before making a purchase
                        """);
        int choice = scanner.nextInt();
        return choice;
    }
}
