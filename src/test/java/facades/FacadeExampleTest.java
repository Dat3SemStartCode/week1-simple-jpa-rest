/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class FacadeExampleTest {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("putest");
    private static FacadeExample fe = FacadeExample.getFacadeExample(emf);
    public FacadeExampleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
//        Add code to setup entities for test before running any test methods
    }
    
    @AfterClass
    public static void tearDownClass() {
//        Clean up database after test is done or use a persistence unit with drop-and-create to start up clean on every test
    }
    
    @Before
    public void setUp() {
//        Put the test database in a proper state before each test is run
    }
    
    @After
    public void tearDown() {
//        Remove any data after each test was run
    }

    /**
     * Test a method here.
     */
    @Test
    public void testSomeMethod() {
        fail("The test case is a prototype.");
    }
    
}
