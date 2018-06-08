/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import shape_area.TwoDimensionalArea;

/**
 *
 * @author Vaibhavi
 */
public class TestTwoDimensionalArea {
    
    TwoDimensionalArea d;
    
    public TestTwoDimensionalArea() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    TwoDimensionalArea d =new TwoDimensionalArea();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testcalcArea_Triangle() 
    {
      assertEquals(50.0,d.calcArea_Triangle(10.0,10.0),0.01);
      assertEquals(6.30,d.calcArea_Triangle(4.2,3.0),0.01);
      assertEquals(17.5,d.calcArea_Triangle(5,7),0.01);
    }
    
     @Test
    public void testcalcArea_Parallelogram() 
    {
      assertEquals(100.0,d.calcArea_Parallelogram(10.0,10.0),0.01);
      assertEquals(21.12,d.calcArea_Parallelogram(3.3,6.4),0.01);
      assertEquals(20.0,d.calcArea_Parallelogram(4,5),0.01);
    }
    
     @Test
    public void testcalcArea_Circle() 
    {
      assertEquals(28.27,d.calcArea_Circle(3.0),0.01);
      assertEquals(15.20,d.calcArea_Circle(2.2),0.01);
      
    }
    
     @Test
    public void testcalcArea_Square() 
    {
      assertEquals(25.0,d.calcArea_Square(5.0),0.01);
      assertEquals(13.69,d.calcArea_Square(3.7),0.01);
    }
    
      @Test
    public void testcalcArea_SquareDiagonal() 
    {
      assertEquals(8.0,d.calcArea_SquareDiagonal(4.0),0.01);
      assertEquals(1.80,d.calcArea_SquareDiagonal(1.9),0.01);
    }
    
     @Test
    public void testcalcArea_Rectangle() 
    {
      assertEquals(20.0,d.calcArea_Rectangle(4.0,5.0),0.01);
      assertEquals(1.69,d.calcArea_Rectangle(2.6,0.65),0.01);

    }
    
     @Test
    public void testcalcArea_Rhombus() 
    {
      assertEquals(24.0,d.calcArea_Rhombus(4.0,6.0),0.01);
      assertEquals(9.80,d.calcArea_Rhombus(2.8,3.5),0.01);
    }
    
}
