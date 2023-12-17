import java.util.Scanner;

public class Phone {
    Demand demand= new Demand();
    ////////////////////////////////////////////////////////////////////////////////////////////
    //display types of phones in our store
    public int phonetype(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
        We have four kinds of phones to sell
                1)HUAWEI Mate 60 pro $999
                2)iPhone 15 pro max $1099
                3)Benjamin Full marks $99999
                4)Dylan High macks $88888
        ---------------------------------------------------
                5)Add the phone you need
        ---------------------------------------------------
        Please enter serial number of your ideal phone to purchase it
        If you do not want to buy anything
        Please enter "0"         
                """);
        int option =scanner.nextInt();
        return option;
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    public void tobuy(){
        Scanner scanner=new Scanner(System.in);
        int option =phonetype();
        int money=0;
        //enter the serial number to purchase the phone and record the accumulated consumption
        while (option !=0) {
            switch (option) {
                case 1: {
                    System.out.println("Thank you for your purchase,your account has been deducted $999");
                    money = money + 999;
                    System.out.println("You have spent " + money + "$");
                    break;
                }
                case 2: {
                    System.out.println("Thank you for your purchase,your account has been deducted $1099");
                    money = money + 1099;
                    System.out.println("You have spent " + money + "$");
                    break;
                }
                case 3: {
                    System.out.println("Thank you for your purchase,your account has been deducted $99999");
                    money = money + 99999;
                    System.out.println("You have spent " + money + "$");
                    break;
                }
                case 4: {
                    System.out.println("Thank you for your purchase,your account has been deducted $88888");
                    money = money + 88888;
                    System.out.println("You have spent " + money + "$");
                    break;
                }
                case 5: {
                    demand.Setup();
                    break;
                }
                default: {
                    System.out.println("Wrong choice!!!!!!!!");
                    break;
                }
            }
            System.out.println("Press enter key to continue...");
            scanner.nextLine();
            //convenient for customers to purchase multiple phones
            option=phonetype();
        }
        //if they do not want to buy ,they will return to the initial interfaced
        System.out.println("Returning.........");
    }

}
