/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape_area;

import java.util.Scanner;

/**
 *
 * @author Vaibhavi
 */
public class TwoDimensionalArea {
       
    static void calcArea_Triangle(Scanner inp)
    {
        float base,height;
        System.out.println("Enter the Base of the triangle :");
        base=inp.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        height=inp.nextFloat();
        float t_area=(float)(0.5*base*height);
        System.out.println("The Area of the Triangle is :"+t_area);
      
        
    }
    
    static void calcArea_Square(Scanner inp)
    {
        float side,diagonal,sq_area;
        int ch;
        System.out.println("How would you like to calculate the area :");
        System.out.println("1.Using Diagonal ");
        System.out.println("2.Using Side ");
        ch=inp.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter the value of the diagonal");
                diagonal=inp.nextFloat();
                sq_area=(float)(0.5*(diagonal*diagonal));
                System.out.println("The Area of the Square is : "+sq_area);
                break;
            case 2:
                System.out.println("Enter the Value of the side of the square : ");
                side=inp.nextFloat();
                sq_area=(float)(side*side);
                System.out.println("The Area of the Square is : "+sq_area);
                break;  
            default:
                System.out.println("Wrong Value Entered! Please Try Again.");
        }
        
    }
    
    static void calcArea_Rectangle(Scanner inp)
    {
        float diagonal,length,width,rect_area;
        int ch;
        System.out.println("How would You like to calculate the Area : ");
        System.out.println("1. Using Length and Diagonal");
        System.out.println("2. Using Length and Width");
        ch=inp.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the Length of the Rectangle :");
                length=inp.nextFloat();
                System.out.println("Enter the Diagonal of the Rectangle :");
                diagonal=inp.nextFloat();
                rect_area=(float)( length*(Math.sqrt((diagonal*diagonal)-(length*length))));
                System.out.println(" The Area of the Rectangle is :"+rect_area);
                break;
            case 2:
                System.out.println("Enter the length of the Rectangle");
                length=inp.nextFloat();
                System.out.println("Enter the width of the Rectangle");
                width=inp.nextFloat();
                rect_area=(float)(length*width);
                System.out.println(" The Area of the Rectangle is :"+rect_area);
                break;
            default:
                System.out.println("Wrong Value Entered! Please Try Again.");      
        }
        
    }
    
    static void calcArea_Rhombus(Scanner inp)
    {
        float altitude,diagonal1,diagonal2,side,rhom_area;
        int ch;
        System.out.println("How Would you like to Calculate the area :");
        System.out.println("1. Using Side and Altitude ");
        System.out.println("2. Using Diagonals ");
        ch=inp.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the Side of the Rhombus : ");
                side=inp.nextFloat();
                System.out.println("Enter the Altitude of the Rhombus: ");
                altitude=inp.nextFloat();
                rhom_area=(float)(altitude*side);
                System.out.println("The Area of the Rhombus is :"+rhom_area);
                break;
            case 2:
                System.out.println("Enter the 1st Diagonal of the Rhombus :");
                diagonal1=inp.nextFloat();
                System.out.println("Enter the 2nd Diagonal of the Rhombus :");
                diagonal2=inp.nextFloat();
                rhom_area=(float)(0.5*(diagonal1*diagonal2));
                System.out.println(" The Area of the Rhombus is : "+rhom_area);
                break;
            default:
                System.out.println("Invalid Value Entered. Please Try Again");
        }
    }
    
    static void calcArea_Parallelogram(Scanner inp)
    {
        float altitude,side,para_area;
        System.out.println("Enter the altitude :");
        altitude=inp.nextFloat();
        System.out.println("Enter the Side : ");
        side=inp.nextFloat();
        para_area=(float)(altitude * side);
        System.out.println(" The Area of the Parellelogram is :"+para_area);
        
    }
    
    static void calcArea_Circle(Scanner inp)
    {
        float radius,circle_area;
        System.out.println("Enter the Radius of the Circle :");
        radius=inp.nextFloat();
        circle_area=(float)(3.14159*radius*radius);
        System.out.println(" The Area of the Circle is : "+circle_area);      
    }
    
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
    
    public static void main(String args[]){
       int ch;
       Scanner inp=new Scanner(System.in);
       do{
       System.out.println("Select the Shape you want to find the area of ");
       System.out.println("1. Triangle");
       System.out.println("2. Square");
       System.out.println("3. Rectangle");
       System.out.println("4. Rhombus");
       System.out.println("5. Parallelogram");
       System.out.println("6. Circle");
       System.out.println("7. Exit this menu");
       System.out.println(" Enter your Choice :- ");
       ch=inp.nextInt();
       switch(ch)
       {
           case 1:
               calcArea_Triangle(inp);
               break;
           case 2:
               calcArea_Square(inp);
               break;
           case 3:
               calcArea_Rectangle(inp);
               break;
           case 4:
               calcArea_Rhombus(inp);
               break;
           case 5:
               calcArea_Parallelogram(inp);
               break;
           case 6:
               calcArea_Circle(inp);
               break;
               
           case 7:
               redirect(inp);
               break;
           default:
               System.out.println("Invalid Choice ! Please Try Again");
               
               
       }
       }while(ch!=7);
       
    }
    
}




