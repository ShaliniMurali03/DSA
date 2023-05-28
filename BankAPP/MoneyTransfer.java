package BankAPP;

import java.util.Scanner;

class SendMoney{
    SendMoney(String SenderAccountNumber,String ReceiverAccountNumber,int sendAmount) {
        String from = SenderAccountNumber;
        String to = ReceiverAccountNumber;
        int amt = sendAmount;
    }
//    public void transfer (String SenderAccountNumber,String ReceiverAccountNumber,int Amount)
//    {
//        SenderAccountNumber.withdraw(Amount);
//        ReceiverAccountNumber.deposit(Amount);
//    }
//    public void main(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Reconfirm your Account Number to Send Money: ");
//        String fromAccountNumber = scan.nextLine();
//        System.out.println("Enter Receiver Account Number: ");
//        String toAccountNumber = scan.nextLine();
//        System.out.println("Enter the Amount to be sent: ");
//        int sendAmount = scan.nextInt();
//
//        transfer(fromAccountNumber,toAccountNumber,sendAmount);
//    }
//
}

public class MoneyTransfer {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Reconfirm your Account Number to Send Money: ");
        String fromAccountNumber = scan.nextLine();
        System.out.println("Enter Receiver Account Number: ");
        String toAccountNumber = scan.nextLine();
        System.out.println("Enter the Amount to be sent: ");
        int sendAmount = scan.nextInt();


        SendMoney sm = new SendMoney(fromAccountNumber,toAccountNumber,sendAmount);
//        sm.transfer(fromAccountNumber,toAccountNumber,sendAmount);
            // Tranfer
//            a.withdraw(100, 5);
//            System.out.println(a.getBalance());
//            b.deposit(100);
//            System.out.println(b.getBalance());
    }
}