import java.util.Scanner;

public class A_IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double tax;

        // Calculate tax based on income slabs
        if(income < 400000){
            tax = 0;
            System.out.println("No tax");
        } 
        else if(income >= 400000 && income < 800000){
            tax = income * 0.05;
        } 
        else if(income >= 800000 && income < 1200000){
            tax = income * 0.1;
        } 
        else if(income >= 1200000 && income < 1600000){
            tax = income * 0.15;
        } 
        else if(income >= 1600000 && income < 2000000){
            tax = income * 0.2;
        } 
        else if(income >= 2000000 && income <2400000){
            tax = income * 0.25;
        } 
        else{
            tax = income * 0.3;
        }
        System.out.println("Tax to be paid: " + tax);
    }
}
