# Take-Home-Pay-Calculator-

import java.util.Scanner;


public class Project1A {
static Scanner console = new Scanner(System.in);
public static void main(String[] args) {
double annualSalary;
double biweeklyGrossIncome;
double afterSS;
double afterRetirement;
double afterFederaltax;
double biweeklyNET;

System.out.println("This is Take-Home-Pay Calculator");
System.out.println("Author: Aaron Verner");
System.out.println("Date: 3/04/16");

System.out.println("Enter your annual salary amount as a decimal number: ");

annualSalary = console.nextDouble();

biweeklyGrossIncome = (annualSalary / 26.0);

afterSS = (biweeklyGrossIncome - (.062 * biweeklyGrossIncome));

afterRetirement = (afterSS - (.10 * afterSS));

afterFederaltax = (afterRetirement - (.20 * afterRetirement));

biweeklyNET = (afterFederaltax - 195.0);

System.out.printf("\nYour annual gross income is: $%.2f", + annualSalary);

System.out.printf("\nYour biweekly gross income is: $%.2f", + biweeklyGrossIncome);

System.out.printf("\nYour biweekly income after SS deduction is: $%.2f", + afterSS);

System.out.printf("\nYour biweekly income after retirement deduction is: $%.2f", + afterRetirement);

System.out.printf("\nYour biweekly income after federal tax deduction is: $%.2f", + afterFederaltax);

System.out.printf("\nYour biweekly NET income is: $%.2f", + biweeklyNET);

}

}
