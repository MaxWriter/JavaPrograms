package interviewPrograms;

//Adding two numbers in Java
import java.util.Scanner;

public class AddNumbers {
 
 public static void main(String[] args) {
     System.out.print("Enter two numbers separated by a space:  ");
     Scanner scanner = new Scanner(System.in);
     int first = scanner.nextInt();
     int second = scanner.nextInt();
     
     int sum = first + second;
     
     System.out.println("Sum of "+first+" and "+second +" is "+sum);
 }
}