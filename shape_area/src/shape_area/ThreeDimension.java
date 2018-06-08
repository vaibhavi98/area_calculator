/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape_area;
import java.util.Scanner;


/**
 * The class contains various methods to calculate surface area of different solid figures such as cube, cuboid, sphere, cone, triangular prism, cylinder.
 * @author Roopali
 */
public class ThreeDimension 
{
     /**
     * The method calculates surface area of a cube taking the side as input.
     * @param inp is a Scanner object used to take the input for the side of a cube. 
     */
    
    public static void Calc_SArea_Cube(Scanner inp)
    {
        float side,cube_sarea;
        System.out.println("Enter the side of the Cube :");
        side = inp.nextFloat();
        cube_sarea=(float)(6*side*side);
        System.out.println("The Surface Area of the cube is : "+cube_sarea);
    }
    
     /**
     * The method calculates surface area of a cuboid taking length, width and height as input.
     * @param inp is a Scanner object used to take the input for length, width and height of a cuboid. 
     */
    
    public static void Calc_SArea_Cuboid(Scanner inp)
    {
        float length,width,height,cuboid_sarea;
        System.out.println("Enter the Length of the Cuboid");
        length=inp.nextFloat();
        System.out.println("Enter the Width of the Cuboid");
        width=inp.nextFloat();
        System.out.println("Enter the Height of the Cuboid");
        height=inp.nextFloat();
        cuboid_sarea=(float)((2*length*height)+(2*length*width)+(2*width*height));
        System.out.println("The Surface Area of Cuboid is : "+cuboid_sarea);
    }
    
    /**
     * The method calculates surface area of a triangular prism taking the height, width and base as input.
     * @param inp is a Scanner object used to take the input for height, width and base of a triangular prism. 
     */
    
      public static void Calc_SArea_Triangular_Prism(Scanner inp)
    {
        float base,height,width,hypotaneous,larea,basearea,perimeter,prism_sarea;
        System.out.println("Enter the Base of the prism :");
        base=inp.nextFloat();
        System.out.println("Enter the Height of the prism :");
        height=inp.nextFloat();
        System.out.println("Enter the Width of the prism :");
        width=inp.nextFloat();
        hypotaneous=(float)(Math.sqrt((base*base)+(height*height)));
        perimeter=(float)(height+base+hypotaneous);
        larea=(float)(perimeter*width);
        basearea=(float)(0.5*base*height);
        prism_sarea=(float)(larea+(2*basearea));
        System.out.println("The Surface Area of prism is :"+prism_sarea);
    }
    
        /**
     * The method calculates surface area of a cylinder taking the height and radius of base as input.
     * @param inp is a Scanner object used to take the input for height and radius of base of a cylinder. 
     */
    
    public static void Calc_SArea_Cylinder(Scanner inp)
    {
        float radius,height,cylinder_sarea;
        System.out.println("Enter the Radius of the base of cylinder :");
        radius=inp.nextFloat();
        System.out.println("Enter the Height of the cylinder:");
        height=inp.nextFloat();
        cylinder_sarea=(float)((2*3.14159*radius*height)+(2*3.14159*radius*radius));
        System.out.println("The Surface Area of Cylinder is :"+cylinder_sarea);
    }
    
    /**
     * The method calculates surface area of a cone taking height and radius of the base as input.
     * @param inp is a Scanner object used to take the input for height and radius of the base of a cone. 
     */
    
    public static void Calc_SArea_Cone(Scanner inp)
    {
        float height,slant_edge,radius,cone_sarea;
        System.out.println("Enter the Radius of the base of the Cone :");
        radius=inp.nextFloat();
        System.out.println("Enter the height of the Cone :");
        height=inp.nextFloat();
        slant_edge=(float)(Math.sqrt((radius*radius)+(height*height)));
        cone_sarea=(float)((3.14159*radius*radius)+(3.14159*radius*slant_edge));
        System.out.println("The Surface Area of Cone is :"+cone_sarea);
    }
    
    /**
     * The method calculates surface area of a sphere taking the radius as input.
     * @param inp is a Scanner object used to take the input for the radius of a sphere. 
     */
    
    public static void Calc_SArea_Sphere(Scanner inp)
    {
        float radius,sphere_sarea;
        System.out.println("Enter the Radius of the Sphere:");
        radius=inp.nextFloat();
        sphere_sarea=(float)(4*3.14159*radius*radius);
        System.out.println("The Surface Area of the Sphere is :"+sphere_sarea);
    }
    
    /**
     * The method contains menu driven code to either continue calculation of area, surface area, volume or exit.
     * @param inp is a Scanner object used to take the input for the side of a cube. 
     */
    
     public static void Redirect(Scanner inp)
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
                 Redirect(inp);
                 
        }  
    }
     
     /**
      * This main method displays a menu used for selection of calculation of surface area of desired solid figure.
      * @param args 
      */
     
    public static void main(String args[])
    {
       int ch;
       Scanner inp=new Scanner(System.in);
       do
       {
       System.out.println("Select the Shape you want to find the surface area of ");
       System.out.println("1. Cube ");
       System.out.println("2. Cuboid ");
       System.out.println("3. Triangular Prism ");
       System.out.println("4. Cylinder");
       System.out.println("5. Cone");
       System.out.println("6. Sphere");
       System.out.println("7. Exit this menu");
       System.out.println(" Enter your Choice :- ");
       ch=inp.nextInt();
       switch(ch)
       {
           case 1:
               Calc_SArea_Cube(inp);
               break;
           case 2:
               Calc_SArea_Cuboid(inp);
               break;
           case 3:
               Calc_SArea_Triangular_Prism(inp);
               break;
           case 4:
               Calc_SArea_Cylinder(inp);
               break;
           case 5:
               Calc_SArea_Cone(inp);
               break;
           case 6:
               Calc_SArea_Sphere(inp);
               break;
           case 7:
               Redirect(inp);
               break;
           default:
               System.out.println("Wrong Value Entered! Please Try Again.");
        }
       }while(ch!=7);

  }
}
