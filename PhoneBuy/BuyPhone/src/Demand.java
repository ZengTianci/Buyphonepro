import java.util.Scanner;

public class Demand {
    String name,memory;
    int number =0;
    private Infor[] infor=new Infor[21];

    Scanner scanner = new Scanner(System.in);
    ////////////////////////////////////////////////////////////////////////
//input their ideal phone

    public int setup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
        ---------------------------------------------------------
                1)Add requirements
                2)View my requirements(UP TO 20)
                3)Accurately search for my requirements
                4)Delete my requirement
                0)Go back
        ---------------------------------------------------------
        Enter corresponding serial number         
                """);
        int select = scanner.nextInt();
        return select;
    }
    ////////////////////////////////////////////////////////////////////////////////
    public void Setup(){
        int select = setup();
        while (select!=0) {
            switch (select) {
                case 1: {
                    Add();
                    break;
                }
                case 2: {
                    System.out.println(view());
                    break;
                }
                case 3: {
                    search();
                    break;
                }
                case 4: {
                    Delete();
                    break;
                }
                default:{
                    System.out.println("Wrong choice");
                    break;
                }

            }
            System.out.println("Press enter key to continue...");
            scanner.nextLine();
            select = setup();
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
//three methods to achieve the fuction of adding
    public void Add(){
        if(number>=20){
            System.out.println("The number has reached the limit");
        }else {
            ADD1();
            System.out.println("Add successfully!!!!!");
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////
    public void ADD1(){
        System.out.println("What type of phone do you want?");
        String name =scanner.nextLine();
        System.out.println("What is the size of phone memory(32G/64G/128G/256G/512G/1TB)");
        String memory = scanner.nextLine();
        System.out.println("4G OR 5G ?");
        String tech =scanner.nextLine();
        Infor factor=new Infor(name,memory,tech);
        ADD2(factor);
    }
    //////////////////////////////////////////////////////////////////////////////
    public void ADD2(Infor factor){
        number++;
        infor[number]=factor;
    }
    ////////////////////////////////////////////////////////////////////////
//search whether there is the phone they had added
    public String view(){
        if(number==0){
            return "You haven't added requirements";
        }
        else{
            String Output ="";
            for (int i=0;i <number;i++){
                Output+= (i+1)+":" + infor[i+1]+"\n";
            }
            return Output;
        }
    }
    ///////////////////////////////////////////////////////////////
    public void search(){
        System.out.println("Enter the phone name");
        String name =scanner.nextLine();
        Infor search =search2(name);
        if(search !=null){
            System.out.println("You have already entered "+ search);
        }else {
            System.out.println("NO "+name+"!!!");
        }
    }
    ////////////////////////////////////////////////////////////////
    public Infor search2(String name){
        Infor name2 =null;
        if(number!=0){
            for (int i = 0; i < number; i++)
                if (infor[i+1].getName().equals(name))
                    name2 = infor[i+1];
        }
        else {
            return null;
        }
        return name2;

    }
    ///////////////////////////////////////////////////////////////////////////
//search and delete one requirement
    public void Delete(){
        System.out.println("Enter the phone name");
        String name =scanner.nextLine();
        Infor delete =delete2(name);
        if(delete !=null){
            System.out.println("You have already deleted "+ delete);
        }else {
            System.out.println("NO "+name+"!!!");
        }
    }
/*move the previous requirements forward in the array,
overwrite the original array,
and make the last data null to achieve deletion
*/

    public Infor delete2(String name){
        Infor name2 =null;
        if(number!=0){
            for (int i = 0; i < number; i++)
                if (infor[i+1].getName().equals(name)) {
                    name2 = infor[i+1];
                    for (int n=i;n<number-1;n++){
                        infor[n+1]=infor[n+2];
                    }
                    infor[number]=null;
                    number--;

                }

        }
        else {
            return null;
        }
        return name2;

    }
}
