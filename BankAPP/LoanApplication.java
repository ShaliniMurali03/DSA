package BankAPP;

import java.util.Scanner;
import java.util.regex.*;

class Loan{
    String applicantName;
    String applicantAccNumber;
    String applicantAdhaarNo;
    String applicantPhNo;
    private float principalAmount;
    private int installment;
    private static float interestRate;

    Scanner scan = new Scanner(System.in);

    static
    {//Annual Interest Rate
        interestRate=2.5f;
    }

    //Function to get applicant info details
    public Loan(){
        System.out.println("Enter the Loan Applicant Name: ");
        applicantName = scan.nextLine();
        System.out.println("Enter the Loan Applicant Bank Account Number: ");
        applicantAccNumber = scan.nextLine();

        System.out.println("Enter the AdhaarNumber: ");
        while (true)
        {
            applicantAdhaarNo = scan.nextLine();

            if (isValidAadhaarNumber(applicantAdhaarNo))
            {
                System.out.println("AdhaarNumber is Valid");
                break;
            } else
            {
                System.out.println("AdhaarNumber is not Valid");
                System.out.println("Please Enter Valid AdhaarNumber");
            }
        }


        System.out.println("Enter the PhoneNumber: ");
        while (true){
            applicantPhNo = scan.nextLine();

            if(isValidMobileNo(applicantPhNo))
            {
                System.out.println("PhoneNumber is Valid");
                break;
            }
            else
            {
                System.out.println("PhoneNumber is not Valid");
                System.out.println("Please Enter Valid PhoneNumber");
            }
        }
    }
    public static boolean isValidMobileNo(String str)
    {//Begins with 0, +91 or 0091,followed by 7-9
        Pattern regex_pattern = Pattern.compile("^(?:0091|\\+91|0)[7-9][0-9]{9}$");
        Matcher match = regex_pattern.matcher(str);
        return (match.find() && match.group().equals(str));
    }
    // Function to validate Aadhaar number.
    public static boolean isValidAadhaarNumber(String str)
    {
        /*Regex to check valid Aadhaar number.
        [2-9],first digit from 2-9
        next 11 digits from 0-9*/
        String regex_pattern =  "^[2-9]{1}[0-9]{11}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex_pattern);

        //If the string is empty , return false
        if (str == null)
        {
            return false;
        }

        Matcher m = p.matcher(str);
        return m.matches();
    }
    //Function to get loan details
    public void getLoan(){
        System.out.println("Enter the Loan Amount Required: ");
        principalAmount = scan.nextFloat();

        System.out.println("Enter the Tenure of the Loan Amount(in years)");
        installment = scan.nextInt();

        printSimpleInterest(principalAmount,interestRate, installment);
    }

    //print loan repayment details
    public static void printSimpleInterest(float principal, float annualInterestRate, int numYears)
    {
        float monthlyInterestRate, monthlyPayment;

        // Output monthly payment and total payment
        monthlyInterestRate = annualInterestRate / 12;
        monthlyPayment      =(float) monthlyPayment(principal, monthlyInterestRate, numYears);
        System.out.format("Monthly Payment: %8.2f%n", monthlyPayment);
        System.out.format("Total Payment:   %8.2f%n", monthlyPayment * numYears * 12);
        System.out.format("Annual Interest Rate: %8.2f%n",annualInterestRate);

    }
    //Function to calculate SI for monthly
    static double monthlyPayment(float loanAmount, float monthlyInterestRate, int numberOfYears)
    {
        monthlyInterestRate /= 100;  // e.g. 5% => 0.05
        return loanAmount * monthlyInterestRate / ( 1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12) );
    }
}

//main function
public class LoanApplication
{
    public static void main(String[] args)
    {
        //object creation or call to constructor(non-param)
        Loan loan1 = new Loan();
        loan1.getLoan();
    }
}
