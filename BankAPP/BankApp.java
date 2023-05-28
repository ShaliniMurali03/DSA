package BankAPP;

import java.util.Scanner;

class Account{
    int balance = 5000;
    int lastTransaction;
    String customerName;
    String customerID;

    //Class constructor
    Account(String cname, String cid) {
        this.customerName = cname;
        this.customerID = cid;
    }

    public void mainMenu(){
        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi "+ customerName +" !");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("------------------------------------");
        System.out.println("1. Balance Enquiry");
        System.out.println("2. Money Deposit");
        System.out.println("3. Money Withdrawal");
        System.out.println("4. View previous Transaction Details");
        System.out.println("5. Calculate interest");
        System.out.println("6. Apply for Personal Loan");
        System.out.println("7. Transfer Money");
        System.out.println("8. Exit");
        System.out.println("--------------------------------------");

        do{
            System.out.println("Enter the Option: ");
            option = scan.nextInt();

            switch (option)
            {
                case 1 ->
                {
                    System.out.println("==============");
                    System.out.println("Your Account Balance(in Rupees): " + balance);
                    System.out.println("===============");
                }
                case 2 ->
                {
                    System.out.println("Enter the Amount to be Deposited: ");
                    int depositAmount = scan.nextInt();
                    System.out.println("===============");
                    deposit(customerID,depositAmount);
                    System.out.println("===============");
                }
                case 3 ->
                {
                    System.out.println("Enter the Amount to Withdraw: ");
                    int withdrawAmount = scan.nextInt();
                    System.out.println("===============");
                    withdraw(customerID,withdrawAmount);
                    System.out.println("===============");
                }
                case 4 ->
                {
                    System.out.println("Your Previous Transaction Details");
                    System.out.println("===============");
                    getLastTransactionDetails();
                    System.out.println("===============");
                }
                case 5 ->
                {
                    System.out.println("Enter Number of years, Interest to be calculated: ");
                    int years = scan.nextInt();
                    System.out.println("Your Interest Details for " + years + " years");
                    System.out.println("===============");
                    calculateInterest(years);
                    System.out.println("===============");
                }
                case 6 ->
                {
                    System.out.println("Loan Detail");
                    Loan loan1 = new Loan();
                    loan1.getLoan();
                    System.out.println("Confirm Loan Application(Y/N): ");
                    char loanConfirm = scan.next().charAt(0);
                    if (loanConfirm == 'Y')
                    {
                        System.out.println("Successfully Applied for Loan!");
                        System.out.println("Your Current Loan status: Applied and Waiting for Bank Approval");
                        System.out.println("Once your loan application is approved,you will get confirmation sms & then Loan will be processed soon.");
                    } else if (loanConfirm == 'N')
                    {
                        System.out.println("Loan Application Withdrew by Applicant!");
                    }
                }
                case 7 ->{
                    System.out.println("Enter Receiver Account Number to Send Money: ");
                    String toAccountNumber = scan.next();
                    System.out.println("Enter the Amount to be sent: ");
                    int sendAmount = scan.nextInt();
                    transferMoney(toAccountNumber,customerID,sendAmount);
                }
                case 8 -> System.exit(0);
                default ->
                        System.out.println("Error: invalid option. Please enter correct option for accessing services.");
            }
        }
        while(true);
    }
    void transferMoney(String toAccountNumber,String fromAccountNumber,int amount ){
        int ReceiverBalance = 0;
        ReceiverBalance = ReceiverBalance+amount; //Dummy
        System.out.println("Amount " + amount + " has been Deposited in "+toAccountNumber+" Account");
        balance -= amount;
        lastTransaction = -amount;
        System.out.println("Amount "+amount+" has been Withdraw in "+fromAccountNumber+" Account");
        System.out.println("Your Current Balance is "+balance);
    }
    void deposit(String customer,int amount)
    {
        if (amount != 0)
        {
            balance += amount;
            lastTransaction = amount;
            System.out.println("Amount " + amount + " has been Deposited in "+customer+" Account");
            System.out.println("Your Current Balance is "+balance);
        }
    }
    void withdraw(String customer, int amount){
        if(amount !=0){
            balance  -= amount;
            lastTransaction = -amount;
            System.out.println("Amount "+amount+" has been Withdraw in "+customer+" Account");
            System.out.println("Your Current Balance is "+balance);
        }
    }
    void getLastTransactionDetails(){
        if(lastTransaction>0)
            System.out.println("Amount Credited: "+lastTransaction);
        else if(lastTransaction<0)
            System.out.println("Amount Debited: "+lastTransaction);
        else
            System.out.println("No transaction");
    }
    void calculateInterest(int years){
        float interestRate = 0.5f;
        float newBalance = (balance * interestRate * years)+balance;
        System.out.println("Current Interest Rate is "+(100* interestRate)+"%");
        System.out.println("Your Current Account Balance: "+balance);
        System.out.println("After "+years+" years, your balance will be: "+newBalance);
    }
}

public class BankApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("******* YOU BANK APP ********");
        System.out.println();
        System.out.println("Enter your Account Name: ");
        String custName = scan.nextLine();//Arjith Varma
        System.out.println("Enter your Account Number: ");
        String custAccNo = scan.next();//YB01120004527
        Account cust = new Account(custName, custAccNo);
        cust.mainMenu();
    }
}
