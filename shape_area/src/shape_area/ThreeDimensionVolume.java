/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape_area;

import java.util.Scanner;

/**
 * ThreeDimensionVolume calculates the volume of different shapes
 * @author Vivek
 */
public class ThreeDimensionVolume {
    /**
     * CalcVol_Cube is a method used to find the volume of cube
     * @param side is used to accept the side value  
     * @return is used to return the calculated value
     */
    public static double calcVol_Cube(double side)
    {
        double cube_vol=(double)(side*side*side);
        return cube_vol;
    }
    
    /**
     * calcVol_Cuboid is a method used to find the volume of Cuboid
     * @param length is used to accept the length value  
     * @param width is used to accept the width value
     * @param height is used to accept the height value
     * @return is used to return the calculated value
     */
    public static double calcVol_Cuboid(double length, double width, double height)
    {
        double cuboid_vol=(double)(length*width*height);
        return cuboid_vol;
    }
    
    /**
     * CalcVol_Triangular_Prism is a method used to find the volume of Triangular Prism
     * @param base is used to accept the base value 
     * @param height is used to accept the height value
     * @param width is used to accept the width value
     * @return is used to return the calculated value 
     */
    public static double calcVol_Triangular_Prism(double base, double height, double width)
    {
        double basearea=(double)(0.5*base*height);
        double prism_vol=(double)(width*basearea);
        return prism_vol;
    }
    
    /**
     * CalcVol_Cylinder is a method used to find the volume of Cylinder
     * @param radius is used to accept the radius value
     * @param height is used to accept the height value
     * @return is used to return the calculated value 
     */
    public static double calcVol_Cylinder(double radius,double height)
    {
        double cylinder_vol=(double)(3.14159*radius*radius*height);
        return cylinder_vol;
    }
    
    /**
     * CalcVol_Cone is a method used to find the volume of CaCone
     * @param radius is used to accept the radius value
     * @param height is used to accept the height value
     * @return is used to return the calculated value 
     */
    public static double calcVol_Cone(double radius,double height)
    {
        double cone_vol=(double)((1/3)*(3.14159*radius*radius*height));
        return cone_vol;
    }
    
    /**
     * CalcVol_Sphere is a method used to find the volume of Sphere
     * @param radius is used to accept the radius value
     * @return is used to return the calculated value 
     */
    public static double calcVol_Sphere(double radius)
    {
        double sphere_vol=(double)((4/3)*(3.14159*radius*radius));
        return sphere_vol;
    }

    /**
     * Redirect is a method used to redirect the user to main menu or exit the application
     * @param inp is an object of scanner class
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
    
    /**
     * This main method displays a menu with different options given to user to choose 
     * one shape at a time, takes the input from the user and calls all the methods present in class with a switch case
     * @param args 
     */
    public static void main(String args[])
    {
       int ch;
       Scanner inp=new Scanner(System.in);
       do{
       System.out.println("Select the Shape you want to find the Volume of ");
       System.out.println("1. Cube ");
       System.out.println("2. Cuboid ");
       System.out.println("3. Triangular Prism ");
       System.out.println("4. Cylinder");
       System.out.println("5. Cone");
       System.out.println("6. Sphere");
       System.out.println("7. Exit this menu");
       System.out.println(" Enter your Choice :- ");
       ch=inp.nextInt();
       /**
        * switch case is used to select the user choice from the given menu 
        */
       switch(ch)
       {
           case 1:
                double side,cube_vol;
                System.out.println("Enter the side of the Cube :");
                side = inp.nextFloat();
                cube_vol=calcVol_Cube(side);
                System.out.println("The Volume of the cube is : "+cube_vol);
                break;
           case 2:
                double c_length,c_width,c_height,cuboid_vol;
                System.out.println("Enter the Length of the Cuboid");
                c_length=inp.nextFloat();
                System.out.println("Enter the Width of the Cuboid");
                c_width=inp.nextFloat();
                System.out.println("Enter the Height of the Cuboid");
                c_height=inp.nextFloat();
                cuboid_vol = calcVol_Cuboid(c_length,c_width,c_height);
                System.out.println("The Volume of Cuboid is : "+cuboid_vol);
                break;
           case 3:
                double p_base,p_height,p_width,prism_vol;
                System.out.println("Enter the Base of the prism :");
                p_base=inp.nextFloat();
                System.out.println("Enter the Height of the prism :");
                p_height=inp.nextFloat();
                System.out.println("Enter the Width of the prism :");
                p_width=inp.nextFloat();
                prism_vol = calcVol_Triangular_Prism(p_base,p_height,p_width);;
                System.out.println("The Volume of prism is :"+prism_vol);
                break;
           case 4:
                double cy_radius,cy_height,cylinder_vol;
                System.out.println("Enter the Radius of the base of cylinder :");
                cy_radius=inp.nextFloat();
                System.out.println("Enter the Height of the cylinder:");
                cy_height=inp.nextFloat();
                cylinder_vol = calcVol_Cylinder(cy_radius,cy_height);
                System.out.println("The Volume of Cylinder is :"+cylinder_vol);
                break;
           case 5:
                double co_height,co_radius,cone_vol;
                System.out.println("Enter the Radius of the base of the Cone :");
                co_radius=inp.nextFloat();
                System.out.println("Enter the height of the Cone :");
                co_height=inp.nextFloat();
                cone_vol=calcVol_Cone(co_radius,co_height);
                System.out.println("The Volume of Cone is :"+cone_vol);
                break;
           case 6:
                double s_radius,sphere_vol;
                System.out.println("Enter the Radius of the Sphere:");
                s_radius=inp.nextFloat();
                sphere_vol=calcVol_Sphere(s_radius);
                System.out.println("The Volume of the Sphere is :"+sphere_vol);
                break;
           case 7:
                 redirect(inp);
                 break;
           default:
               System.out.println("Invalid Choice! Please Retry");
       }
    
       }while(ch!=7);
       }
}
