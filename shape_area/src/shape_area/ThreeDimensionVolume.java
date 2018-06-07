/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape_area;

import java.util.Scanner;

/**
 *
 * @author Vivek
 */
public class ThreeDimensionVolume {
    
    static void CalcVol_Cube(Scanner inp)
    {
        float side,cube_vol;
        System.out.println("Enter the side of the Cube :");
        side = inp.nextFloat();
        cube_vol=(float)(side*side*side);
        System.out.println("The Volume of the cube is : "+cube_vol);
    }
    
    
    static void CalcVol_Cuboid(Scanner inp)
    {
        float length,width,height,cuboid_vol;
        System.out.println("Enter the Length of the Cuboid");
        length=inp.nextFloat();
        System.out.println("Enter the Width of the Cuboid");
        width=inp.nextFloat();
        System.out.println("Enter the Height of the Cuboid");
        height=inp.nextFloat();
        cuboid_vol=(float)(length*width*height);
        System.out.println("The Volume of Cuboid is : "+cuboid_vol);
    }
    
    static void CalcVol_Triangular_Prism(Scanner inp)
    {
         float base,height,width,basearea,prism_vol;
        System.out.println("Enter the Base of the prism :");
        base=inp.nextFloat();
        System.out.println("Enter the Height of the prism :");
        height=inp.nextFloat();
        System.out.println("Enter the Width of the prism :");
        width=inp.nextFloat();
        basearea=(float)(0.5*base*height);
        prism_vol=(float)(width*basearea);
        System.out.println("The Volume of prism is :"+prism_vol);
    }
    
    static void CalcVol_Cylinder(Scanner inp)
    {
        float radius,height,cylinder_vol;
        System.out.println("Enter the Radius of the base of cylinder :");
        radius=inp.nextFloat();
        System.out.println("Enter the Height of the cylinder:");
        height=inp.nextFloat();
        cylinder_vol=(float)(3.14159*radius*radius*height);
        System.out.println("The Volume of Cylinder is :"+cylinder_vol);
    }
    
    static void CalcVol_Cone(Scanner inp)
    {
        float height,radius,cone_vol;
        System.out.println("Enter the Radius of the base of the Cone :");
        radius=inp.nextFloat();
        System.out.println("Enter the height of the Cone :");
        height=inp.nextFloat();
        cone_vol=(float)((1/3)*(3.14159*radius*radius*height));
        System.out.println("The Volume of Cone is :"+cone_vol);
    }
    
     static void CalcVol_Sphere(Scanner inp)
    {
        float radius,sphere_vol;
        System.out.println("Enter the Radius of the Sphere:");
        radius=inp.nextFloat();
        sphere_vol=(float)((4/3)*(3.14159*radius*radius));
        System.out.println("The Volume of the Sphere is :"+sphere_vol);
    }

    
     static void Redirect(Scanner inp)
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
       switch(ch)
       {
           case 1:
               CalcVol_Cube(inp);
               break;
           case 2:
               CalcVol_Cuboid(inp);
               break;
           case 3:
               CalcVol_Triangular_Prism(inp);
               break;
           case 4:
               CalcVol_Cylinder(inp);
               break;
           case 5:
               CalcVol_Cone(inp);
               break;
           case 6:
               CalcVol_Sphere(inp);
               break;
           case 7:
                 Redirect(inp);
                 break;
           default:
               System.out.println("Invalid Choice! Please Retry");
       }
    
       }while(ch!=7);
       }
}
