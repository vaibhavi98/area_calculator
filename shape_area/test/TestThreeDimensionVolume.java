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
import shape_area.ThreeDimensionVolume;

/**
 *
 * @author Asus
 */
public class TestThreeDimensionVolume {
    ThreeDimensionVolume v;
    
    public TestThreeDimensionVolume() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testcalcVol_Cube()
    {
        assertEquals(8.0,v.calcVol_Cube(2),0.01);
        assertEquals(3.37,v.calcVol_Cube(1.5),0.01);
        assertEquals(343.0,v.calcVol_Cube(7),0.01);
        assertEquals(11390.62,v.calcVol_Cube(22.5),0.01);
    }
    
    @Test
    public void testcalcVol_Cuboid()
    {
        assertEquals(8.0,v.calcVol_Cuboid(2.0,2.0,2.0),0.01);
        assertEquals(24.0,v.calcVol_Cuboid(1.0,4.0,6.0),0.01);
        assertEquals(132.6,v.calcVol_Cuboid(2.5,5.1,10.4),0.01);
        assertEquals(78.0,v.calcVol_Cuboid(4.0,3.0,6.5),0.01);
    }
    
    @Test
    public void testcalcVol_Triangular_Prism()
    {
        assertEquals(13.5,v.calcVol_Triangular_Prism(3.0,3.0,3.0),0.01);
        assertEquals(35.0,v.calcVol_Triangular_Prism(5.0,2.0,7.0),0.01);
        assertEquals(56.1,v.calcVol_Triangular_Prism(6.0,5.5,3.4),0.01);
        assertEquals(110.0,v.calcVol_Triangular_Prism(4.4,5.0,10.0),0.01);
    }
    
    @Test
    public void testcalcVol_Cylinder()
    {
        assertEquals(25.13,v.calcVol_Cylinder(2.0,2.0),0.01);
        assertEquals(169.64,v.calcVol_Cylinder(3.0,6.0),0.01);
        assertEquals(127.23,v.calcVol_Cylinder(3.0,4.5),0.01);
        assertEquals(3534.28,v.calcVol_Cylinder(15.0,5.0),0.01);
    }
    
    @Test
    public void testcalcVol_Cone()
    {
        assertEquals(149.28,v.calcVol_Cone(4.0,9.0),0.01);
        assertEquals(8.29,v.calcVol_Cone(2.0,2.0),0.01);
        assertEquals(197.10,v.calcVol_Cone(6.5,4.5),0.01);
        assertEquals(90.71,v.calcVol_Cone(5.0,3.5),0.01);
    }
    
    @Test
    public void testcalcVol_Sphere()
    {
        assertEquals(16.71,v.calcVol_Sphere(2.0),0.01);
        assertEquals(104.45,v.calcVol_Sphere(5.0),0.01);
        assertEquals(126.39,v.calcVol_Sphere(5.5),0.01);
        assertEquals(361.38,v.calcVol_Sphere(9.3),0.01);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
