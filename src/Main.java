import java.util.Scanner;

public class Main {
    public static double tax_calculator(double salary){
        double tax = 0;
        if(salary >= 1 && salary <= 237100){
            tax = 0.18*salary;
        }
        else if (salary >= 237101 && salary <= 370500) {
            tax = 42678 + 0.26*salary;
        }
        else if(salary >= 370501 && salary <= 512800){
            tax = 77362 + 0.31*salary;
        }
        else if(salary >= 512801 && salary <= 673000){
            tax = 121475 + 0.36*salary;
        }
        else if(salary >= 673001 && salary <= 857900){
            tax = 179147 + 0.39*salary;
        }
        else if(salary >= 857901 && salary <= 1817000){
            tax = 251258 + 0.41*salary;
        }
        else if(salary >= 1817001){
            tax = 644489 + 0.45*salary;
        }

        return tax;
    }
    public static void main(String[] args) {

        System.out.println("input salary per annum in rands : ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Tax = R" + tax_calculator(salary));
    }
}