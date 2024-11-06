import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is NOT a leap year.");
        }
        scanner.close();
    }
}