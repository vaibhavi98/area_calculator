/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape_area;

import java.util.Scanner;

 /**
 * The class contains various methods to calculate area of different shapes such as triangle,square,
 * rectangle,circle,parallelogram and rhombus.
 * @author Vaibhavi
 */
public class TwoDimensionalArea {
       
     /**
      * Calculates the area of triangle when the base and height are passed to the method.
      * @param base accepts the base value of triangle from user.
      * @param height accepts the height value of triangle from user
      * @return this method returns the area of triangle.
      */
    public static double calcArea_Triangle(double base,double height)
    {
        double t_area=(float)(0.5*base*height);
        return t_area;
       
    }
     /**
      * Calculates the area of square when its side is passed to the method.
      * @param side accepts the side value of square from user
      * @return this method returns the area of square.
      */
    public static double calcArea_Square(double side)
    {
          double sq_area=(double)(side*side);
          return sq_area;
    }
    /**
     * Calculates the area of square when its diagonal is passed to the method.
     * @param diagonal accepts the diagonal value of square from user
     * @return this method returns the area of square.
     */
    public static double calcArea_SquareDiagonal(double diagonal)
    {
         double sq_area=(double)(0.5*(diagonal*diagonal));
          return sq_area;
                
    }
     
    /**
     * Calculates the area of rectangle when its length and width are passed to the method.
     * @param length accepts the length value of rectangle from user.
     * @param width accepts the width value of rectangle from user.
     * @return this method returns the area of rectangle.
     */
    public static double calcArea_Rectangle(double length,double width)
    {
       double rect_area=(double)(length*width);
       return rect_area;
    }
    /**
     * Calculates the area of rhombus when its side and altitude are passed to the method.
     * @param side accepts the side value of Rhombus from user.
     * @param altitude accepts the altitude value of rhombus from user.
     * @return this method returns the area of rhombus.
     */    
    
    public static double calcArea_Rhombus(double side,double altitude)
    {
         double rhom_area=(float)(altitude*side);
         return rhom_area;
     }
    
    /**
     * Calculates the area of parallelogram when its side and altitude are passed to the method.
     * @param altitude accepts the side value of parallelogram from user.
     * @param side accepts the altitude value of parallelogram from user.
     * @return this method returns the area of parallelogram.
     */
    public static double calcArea_Parallelogram(double altitude,double side)
    {
        double para_area=(double)(altitude * side);
        return para_area;
     }
     /**
      * Calculates the area of circle when its radius is passed to the method.
      * @param radius accepts the radius value of circle from user.
      * @return this method returns the area of circle.
      */
    public static double calcArea_Circle(double radius)
    {
        double circle_area=(double)(3.14159*radius*radius);
        return circle_area;      
    }
    
    /**
     * This method lets user to continue with the calculation or exit from the application.
     * @param inp is an object of scanner class which takes the user input.
     */
    static void redirect(Scanner inp)
    {
        int ch;
        System.out.println("What you want to do :");
        System.out.println("1.Go to Main Menu ");
        System.out.println("2.Exit Application");
        ch=inp.nextInt();
        switch(ch)
        {
            case 1:
                Shape_area Shape_area= new Shape_area();
                Shape_area.main(null);
            case 2:
                 System.exit(0);
            default:
                 System.out.println("Invalid Entry");
                 redirect(inp);     
        }    
    }
    
    /* This main method displays a menu with different options given to user to choose 
     * one shape at a time and calls all the methods present in class with a switch case. 
     * @param args the command line arguements
     */
    public static void main(String args[]){
       int ch;
       Scanner inp=new Scanner(System.in);
       do{
       System.out.println("Select the Shape you want to find the area of ");
       System.out.println("1. Triangle");
       System.out.println("2. Square(using side)");
       System.out.println("3. Square(using diagonal)");
       System.out.println("4. Rectangle");
       System.out.println("5. Rhombus");
       System.out.println("6. Parallelogram");
       System.out.println("7. Circle");
       System.out.println("8. Exit this menu");
       System.out.println(" Enter your Choice :- ");
       ch=inp.nextInt();
       switch(ch)
       {
           case 1:
               double base,height,t_area;
               System.out.println("Enter the Base of the triangle :");
               base=inp.nextFloat();
               System.out.println("Enter the height of the triangle: ");
               height=inp.nextFloat();
               t_area=calcArea_Triangle(base,height);
               System.out.println("The Area of the Triangle is :"+t_area);
               break;
           case 2:
                double sq_area,side;
                System.out.println("Enter the Value of the side of the square : ");
                side=inp.nextFloat();
                sq_area=calcArea_Square(side);
                System.out.println("The Area of the Square is : "+sq_area);
               break;
           case 3: 
                double diagonal;
                System.out.println("Enter the Value of the diagonal of the square : ");
                diagonal=inp.nextDouble();
                sq_area=calcArea_SquareDiagonal(diagonal);
                System.out.println("The Area of the Square is : "+sq_area);
                break;
               
           case 4:
                double length,width,rect_area;
                System.out.println("Enter the length of the Rectangle");
                length=inp.nextDouble();
                System.out.println("Enter the width of the Rectangle");
                width=inp.nextDouble();
                rect_area=calcArea_Rectangle(length,width);
                System.out.println(" The Area of the Rectangle is :"+rect_area);
                break;
           case 5:
                double altitude,rhom_area;
                System.out.println("Enter the Side of the Rhombus : ");
                side=inp.nextFloat();
                System.out.println("Enter the Altitude of the Rhombus: ");
                altitude=inp.nextFloat();
                rhom_area=calcArea_Rhombus(side,altitude);
                System.out.println("The Area of the Rhombus is :"+rhom_area);
                break;
           case 6:
               double para_area;
               System.out.println("Enter the altitude :");
               altitude=inp.nextDouble();
               System.out.println("Enter the Side : ");
               side=inp.nextDouble();
               para_area=calcArea_Parallelogram(altitude,side);
                System.out.println(" The Area of the Parellelogram is :"+para_area);        
               break;
           case 7:
               double radius,circle_area;
               System.out.println("Enter the Radius of the Circle :");
               radius=inp.nextDouble();
               circle_area=calcArea_Circle(radius);
               System.out.println(" The Area of the Circle is : "+circle_area);
               break;
               
           case 8:
               redirect(inp);
               break;
           default:
               System.out.println("Invalid Choice ! Please Try Again");
               
               
       }
       }while(ch!=7);
       
    }
    
}




