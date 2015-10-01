package interviewPrograms;
/*


Calculate Circle Area using Java Example
This Calculate Circle Area using Java Example shows how to calculate
area of circle using it's radius.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCircleAreaExample {

public static void main(String[] args) {
       
        int radius = 19;
        System.out.println("Please enter radius of a circle");
       
        try
        {
                //get the radius from console
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                radius = Integer.parseInt(br.readLine());
        }
        //if invalid value was entered
        catch(NumberFormatException ne)
        {
                System.out.println("Invalid radius value" + ne);
                System.exit(0);
        }
        catch(IOException ioe)
        {
                System.out.println("IO Error :" + ioe);
                System.exit(0);
        }
       
        
         * Area of a circle is
         * pi * r * r
         * where r is a radius of a circle.
         
       
        //NOTE : use Math.PI constant to get value of pi
        double area = Math.PI * radius * radius;
       
        System.out.println("Area of a circle is " + area);
}
}
*/


// Easy Way 
public class CalculateCircleAreaExample
{
    public static void main(String args[]) {
        int r; // radius of the circle r
        r = 5;
        float pi = 3.14f;// pi=3.14 is math constant
        System.out.println(pi * r * r);// calculate the area of circle
    }
}