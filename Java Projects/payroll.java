///////////////////////////////////////////////////////////////
// Solution to Homework 4 Question 1                         //
// Name: Daniel Rocehfort                                    //
// Lab time: Thursday 9:00am-10:40am                         //
// Program description: Prints out a sample payroll for      //
//                      an employee, with their name, hours, //
//                      pay, gross pay, taxes deducted, and  //
//                      net pay.                             //
///////////////////////////////////////////////////////////////

public class payroll
{
  public static void main(String args[])
  {
      String empName = "Daniel";
      int hoursWorked = 8;
      double hourlyRate = 10.25;
      double grossPay = (hoursWorked*hourlyRate);
      double fedTaxRate = 0.06;
      double taxesDeducted = ((grossPay*fedTaxRate));
      double netPay = (grossPay-taxesDeducted);

      System.out.println("Employee name:\t" + empName);
      System.out.println("Hours worked:\t" + hoursWorked);
      System.out.println("Hourly rate:\t" + hourlyRate);
      System.out.println("Gross pay:\t" + grossPay);
      System.out.println("Tax deducted:\t" + taxesDeducted);
      System.out.println("Net pay:\t" + netPay);
  }
}