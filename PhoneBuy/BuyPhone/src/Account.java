import java.util.HashMap;
import java.util.Scanner;

public class Account {
    private  static Phone phone=new Phone();
    private HashMap<String,String> passerwords;
    public Account(){
        passerwords = new HashMap<String,String>();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    //store customer account information
    public void register(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please set up an account");
        String accountname = scanner.nextLine();
        System.out.println("Please set up your own password");
        String password = scanner.nextLine();
        passerwords.put(accountname,password);
        System.out.println("REGISTRATION SUCCESSFUL!!");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    //only accounts in the database can be successfully logged in
    public void loginin(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input your account");
        String accountname = scanner.nextLine();
        System.out.println("Please input your password");
        String password = scanner.nextLine();
        //response after user input is correct or not
        if(passerwords.containsKey(accountname) && passerwords.get(accountname).equals(password)) {
            System.out.println("LOGIN SUCCESSFUL");
            System.out.println("Press enter key to continue...");
            scanner.nextLine();
            phone.tobuy();
        }else {
            System.out.println("Account or password error!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        }
    }


}
