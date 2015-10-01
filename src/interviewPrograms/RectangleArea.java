package interviewPrograms;

//Java program to find area of a rectangle
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {
 
 public static void main(String[] args) throws IOException{
     
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Please enter length of the rectangle : ");
     double length = Double.parseDouble(reader.readLine());
     
     System.out.print("Please enter width of the rectangle : ");
     double width = Double.parseDouble(reader.readLine());
     
     System.out.println("Area of the rectangle : "+length*width);
     
 }
 
}