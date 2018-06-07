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
public class Shape_area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ch;
         Scanner inp=new Scanner(System.in);
         do{
         System.out.println("..Welcome to shape area App ..");
         System.out.println("1. Calculate the Area of 2D Shapes");
         System.out.println("2. Calculate the Area of 3D Shapes");
         System.out.println("3. Calculate the Volume of 3D Shapes");
         System.out.println("4. Exit");
         System.out.println(" Select your Choice :- ");
         ch=inp.nextInt();
         switch(ch)
         {
             case 1:
                TwoDimensionalArea TwoDimension= new TwoDimensionalArea();
                TwoDimensionalArea.main(null);
                break;
             case 2:
                 ThreeDimension ThreeDimension= new ThreeDimension();
                 ThreeDimension.main(null);
                 break;
             case 3:
                 ThreeDimensionVolume ThreeDimensionVolume= new ThreeDimensionVolume();
                 ThreeDimensionVolume.main(null);
                 break;
             case 4:
                 System.exit(0);
                 break;
             default:
                  System.out.println("Please Enter a valid Entry");
             }
         
    }while(ch!=4);
  }
    
}

        
    
    

