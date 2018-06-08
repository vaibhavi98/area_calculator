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
     * @param side is used as the length of a side of cube 
     * @return This returns the surface area of cube with the given side  
     */
    
    public static double Calc_SArea_Cube(double side)
    {
        return (double)(6*side*side);
  
    }
    
     /**
     * The method calculates surface area of a cuboid taking length, width and height as input.
     * @param length used as length of the cuboid.
     * @param width used as width of the cuboid.
     * @param height used as height of the cuboid. 
     * @return the calculated surface area of the cuboid. 
     */
    
    public static double Calc_SArea_Cuboid(double length, double width, double height)
    {
      
        return (double)((2*length*height)+(2*height*width)+(2*width*length));
    }
    
    /**
     * The method calculates surface area of a triangular prism taking the height, width and base as input.
     * @param base is the base of the triangular prism .
     * @param height is the height of the triangular prism.
     * @param width is the width of the prism.
     * @return the surface area of the prism 
     */
    
      public static double Calc_SArea_Triangular_Prism(double base, double height, double width)
    {
        
        double hypotaneous, perimeter,larea, basearea;
        hypotaneous=(double)(Math.sqrt((base*base)+(height*height)));
        perimeter=(double)(height+base+hypotaneous);
        larea=(double)(perimeter*width);
        basearea=(double)(0.5*base*height);
        return (double)(larea+(2*basearea));
    }
    
        /**
     * The method calculates surface area of a cylinder taking the height and radius of base as input.
     * @param r is used as the radius of the cylinder.
     * @param h is used as the height of the cylinder.
     * @return  the surface area of the cylinder.
     */
    
    public static double Calc_SArea_Cylinder(double r, double h)
    {
        return (double)((2*3.14159*r*h)+(2*3.14159*r*r));
    }
    
    /**
     * The method calculates surface area of a cone taking height and radius of the base as input.
     * @param radius used as the radius of the cone.
     * @param height used as the height of the cone.
     * @return the surface area of the cone calculated given the radius and height. 
     */
    
    public static double Calc_SArea_Cone(double radius, double height)
    {
        double slant_edge;
        slant_edge=(double)(Math.sqrt((radius*radius)+(height*height)));
        return (double)((3.14159*radius*radius)+(3.14159*radius*slant_edge));
    }
    
    /**
     * The method calculates surface area of a sphere taking the radius as input.
     * @param radius is the radius of the sphere.
     * @return the surface area of the sphere given the radius..
     */
    
    public static double Calc_SArea_Sphere(double radius)
    {
        return (double)(4*3.14159*radius*radius);
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
           case 1:  double side, cube_sarea;
                    System.out.println("Enter the side of the Cube :");
                    side = inp.nextFloat();
                    cube_sarea= Calc_SArea_Cube(side);
                    System.out.println("The Surface Area of the cube is : "+cube_sarea);
                    break;
           case 2:  double length,width,height,cuboid_sarea;
                    System.out.println("Enter the Length of the Cuboid");
                    length=inp.nextFloat();
                    System.out.println("Enter the Width of the Cuboid");
                    width=inp.nextFloat();
                    System.out.println("Enter the Height of the Cuboid");
                    height=inp.nextFloat();
                    cuboid_sarea= Calc_SArea_Cuboid(length, width, height);
                    System.out.println("The Surface Area of Cuboid is : "+cuboid_sarea);
                    break;
           case 3:  double b,h,w,prism_sarea;
                    System.out.println("Enter the Base of the prism :");
                    b=inp.nextFloat();
                    System.out.println("Enter the Height of the prism :");
                    h=inp.nextFloat();
                    System.out.println("Enter the Width of the prism :");
                    w=inp.nextFloat();
                    prism_sarea= Calc_SArea_Triangular_Prism(b, h, w);
                    System.out.println("The Surface Area of prism is :"+prism_sarea);
                    break;
           case 4:  double radius1,height1,cylinder_sarea;
                    System.out.println("Enter the Radius of the base of cylinder :");
                    radius1=inp.nextFloat();
                    System.out.println("Enter the Height of the cylinder:");
                    height1=inp.nextFloat();
                    cylinder_sarea= Calc_SArea_Cylinder(radius1, height1);
                    System.out.println("The Surface Area of Cylinder is :"+cylinder_sarea);
                    break;
           case 5:  double height2,radius2,cone_sarea;
                    System.out.println("Enter the Radius of the base of the Cone :");
                    radius2=inp.nextFloat();
                    System.out.println("Enter the height of the Cone :");
                    height2=inp.nextFloat();
                    cone_sarea= Calc_SArea_Cone(radius2, height2);
                    System.out.println("The Surface Area of Cone is :"+cone_sarea);
                    break;
           case 6:  double radius3,sphere_sarea;
                    System.out.println("Enter the Radius of the Sphere:");
                    radius3=inp.nextFloat();
                    sphere_sarea= Calc_SArea_Sphere(radius3);
                    System.out.println("The Surface Area of the Sphere is :"+sphere_sarea);
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
