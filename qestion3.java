package ClassQuestions;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;
import java.util.Scanner;

class account{
    double account_no;
    String name;
    String Type;
    double balance;
    double rate=3.14;
    account(int account_no, String name, String Type, Double balance){
//        System.out.println("this is a banking management system");
//        System.out.println("you may create your account and take benefits!");
         this.account_no=account_no;
         this.name=name;
         this.Type=Type;
         this.balance=balance;
    }
    void readDet(){
        System.out.println("this is a banking management system");
        System.out.println("you may create your account and take benefits!");
        System.out.println("Thankyou for choosing option 1, you can see your account details");
        this.account_no=account_no;
        this.name=name;
        this.Type=Type;
        this.balance=balance;
    }
    void printDet(){
        System.out.println("Thankyou for choosing option 2, you can see your account details");
        System.out.print("account no:");
        System.out.println(account_no);
        System.out.print("name:");
        System.out.println(name);
        System.out.print("type of account:");
        System.out.println(Type);
        System.out.print("balance:");
        System.out.println(balance);
        System.out.print("rate:");
        System.out.println(rate);
    }
    double check_balance(){
        System.out.println("Thankyou for choosing option 3, you can see your balance details");
        if (Type.equals("saving")) {
            balance = balance + (balance * rate);
            System.out.println("balance:" + balance);
        }
         else if(Type.equals("current")){
            balance=balance+(balance*(rate/2));
            System.out.println("balance:"+balance);
            }
         else{
            System.out.println("Invalid Account Type");
        }
        return balance;
    }
    double withdraw(){
        System.out.println("Thankyou for choosing option 4, you can proceed with withdrawal of money!");
        System.out.print("amount to withdraw:");
        Scanner sc =new Scanner(System.in);
        double n=sc.nextDouble();
        if(n<=balance){
            System.out.println("we are  proceeding with  you withdrawal request");
            balance=balance-n;
            System.out.println("new balance:"+balance);
        }
         else if(n>balance){
            System.out.println("sorry, you have insufficient balance");
            System.out.print("new balance:"+balance);}
        return  balance;
    }
    double deposit(){
        System.out.println("Thankyou for choosing option 5, you can  deposit money in your account");
        System.out.println("amount to deposit:");
        Scanner sc =new Scanner(System.in);
        double amount=sc.nextInt();
        balance=balance+amount;
        System.out.println("your updated balance is");
        System.out.println("new balance:"+balance);
        return  balance;
    }
        }


public class qestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("option opted by user:");
        account obj1 = new account(1, "a", "saving", 10000.0);
        account obj2 = new account(2, "b", "saving", 9000.0);
        account obj3 = new account(3, "c", "saving", 8000.0);
        account obj4 = new account(4, "d", "current", 5000.0);
        account obj5 = new account(5, "e", "current", 6000.0);
        account obj6 = new account(6, "f", "saving", 2000.0);
        account obj7 = new account(7, "g", "current", 11000.0);
        account obj8 = new account(8, "h", "saving", 7000.0);
        account obj9 = new account(9, "i", "current", 13000.0);
        account obj10 = new account(10, "j", "saving", 140000.0);
        System.out.print("WHICH USER IS ACCESSING BANKING MANAGEMENT SYSTEM,plz enter user number:");
        int user = sc.nextInt();
        if (user == 1) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj1.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj1.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj1.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj1.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj1.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }
        } else if (user == 2) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj2.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj2.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj2.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj2.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj2.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }

        }
        else if (user == 3) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj3.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj3.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj3.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj3.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj3.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }
        }
        else if (user == 4) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj4.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj5.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj5.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj5.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj5.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }
        }
        else if (user == 5) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj5.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj5.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj5.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj5.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj5.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }
        }
        else if (user == 6) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj6.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj6.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj6.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj6.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj6.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }
        }
        else if (user == 7) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj7.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj7.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj7.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj7.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj7.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }
        }
        else if (user == 8) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj8.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj8.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj8.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj8.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj8.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }
        }
        else if (user == 9) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj9.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj9.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj9.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj9.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj9.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }
        }
        else if (user == 10) {
            while (true) {
                System.out.println("select the option you want to opt.");
                System.out.println("1)readDet");
                System.out.println("2)printDet");
                System.out.println("3)check balance");
                System.out.println("4)withdraw");
                System.out.println("5)deposit");
                System.out.println("6)exit");
                int option = sc.nextInt();
                if (option != 6) {
                    switch (option) {
                        case 1:
                            System.out.println("readDet");
                            obj10.readDet();
                            break;
                        case 2:
                            System.out.println("printDet");
                            obj10.printDet();
                            break;
                        case 3:
                            System.out.println("check balance");
                            obj10.check_balance();
                            break;
                        case 4:
                            System.out.println("withdraw");
                            obj10.withdraw();
                            break;
                        case 5:
                            System.out.println("deposit");
                            obj10.deposit();
                            break;
                        case 6:
                            System.out.println("exit");
                            break;
                    }
                } else {
                    System.out.println("exit");
                    break;

                }
            }
        }
        else{
            System.out.println("sorry!,INVALID USER NUMBER");
            System.out.println("you are getting automatically logged out of system");
        }

    }
}
