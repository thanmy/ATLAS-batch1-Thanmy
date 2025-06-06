import java.util.Scanner;

public class Task11 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String username ="Thanmy";
        String pwd = "12345";
        String newuser ="";
        String newpwd= "";
        int count =0;
        
        System.out.println("enter the process 1 for only while loop and 2 for do while:");
        int process = sc.nextInt();
        sc.nextLine();

        switch (process) {
            case 1:
                while (username.equals("Thanmy")&& pwd.equals("12345")) {
                    System.out.println("You have logged in for " +count++ +" times");
                    System.out.println("Enter your Login user name to check:");
                    newuser=sc.nextLine();
                    System.out.println("Enter your Login password name to check:");
                    newpwd=sc.nextLine();
                    if (newuser.equals(username) && newpwd.equals(pwd)) {
                    } else {
                        System.out.println(username);
                        System.out.println(pwd);
                        System.out.println("in correct login details");
                        break;
                        
                    }
                }
                break;
            case 2:
                do{
                    System.out.println("You have logged in for " +count++ +" times");
                    System.out.println("Enter your Login user name to check:");
                    newuser=sc.nextLine();
                    System.out.println("Enter your Login password name to check:");
                    newpwd=sc.nextLine();
                }while (newuser.equals(username) && newpwd.equals(pwd));
                System.out.println("IN CORRECT LOGIN'S");
                
                break;
        
            default:
                break;
        }
        

            
        
        sc.close();
    }


    
}
