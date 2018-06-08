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
import shape_area.ThreeDimension;

/**
 *
 * @author User
 */
public class TestThreeDimension {
    ThreeDimension thd;
    
    public TestThreeDimension() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        thd = new ThreeDimension();
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Calc_SArea_Cube() {
        assertEquals(2400.0,thd.Calc_SArea_Cube(20.0),0.1);
        assertEquals(181.5,thd.Calc_SArea_Cube(5.5),0.1);
        assertEquals(937.5,thd.Calc_SArea_Cube(12.5),0.1);
        assertEquals(294.0,thd.Calc_SArea_Cube(7.0),0.1);
     }
      @Test
     public void Calc_SArea_Cuboid() {
        assertEquals(862.0,thd. Calc_SArea_Cuboid(11.0,12.0,13.0),0.1);
        assertEquals(26.6,thd. Calc_SArea_Cuboid(1.1,2.2,3.3),0.1);
        assertEquals(570.0,thd. Calc_SArea_Cuboid(5,10.5,15.0),0.1);
        assertEquals(384.0,thd. Calc_SArea_Cuboid(8.0,8.0,8.0),0.1);
     }
      @Test
     public void Calc_SArea_Triangular_Prism() {
        assertEquals(1770.8,thd.Calc_SArea_Triangular_Prism(10.0,20.0,30.0),0.1);
        assertEquals(708.2,thd.Calc_SArea_Triangular_Prism(5.5, 12.5, 20.2),0.1);
        assertEquals(262.9,thd.Calc_SArea_Triangular_Prism(4.4,5.0,15.0),0.1);
        assertEquals(163.5,thd.Calc_SArea_Triangular_Prism(5,6,7.1),0.1);
     }
     @Test
     public void Calc_SArea_Cylinder() {
        assertEquals(471.3,thd.Calc_SArea_Cylinder(5.0,10.0),0.1);
        assertEquals(33.17,thd.Calc_SArea_Cylinder(1.1, 3.7),0.1);
        assertEquals(1693.3,thd.Calc_SArea_Cylinder(11.0, 13.5),0.1);
        assertEquals(5301.4,thd.Calc_SArea_Cylinder(22.5, 15.0),0.1);
     }
     @Test
     public void Calc_SArea_Cone() {
        assertEquals(867.96,thd.Calc_SArea_Cone(5.0,50.0),1);
        assertEquals(933.77,thd.Calc_SArea_Cone(10.0, 17.0),1);
        assertEquals(1815.44,thd.Calc_SArea_Cone(13.55, 25.75),1);
        assertEquals(13364.6,thd.Calc_SArea_Cone(40.5, 50.25),1);
     }
     @Test
     public void Calc_SArea_Sphere() {
        assertEquals(7854.0,thd.Calc_SArea_Sphere(25.0),1);
        assertEquals(2926.29,thd.Calc_SArea_Sphere(15.26),1);
        assertEquals(127555.62,thd.Calc_SArea_Sphere(100.75),1);
        assertEquals(8364.67,thd.Calc_SArea_Sphere(25.8),1);
     }
     
}
