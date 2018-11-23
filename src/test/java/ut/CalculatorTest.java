package ut;

import static org.junit.Assert.*;
import org.junit.*;

import com.ms.calc.*;

public class CalculatorTest{
	
	static Calculator cobj;
	
	@BeforeClass
	public static void setUp(){
		cobj=new Calculator();
	}
	
	@AfterClass
	public static void tearDown(){
		System.gc();
	}
	@Test
	public void testAdd(){
		assertTrue(cobj.Add(3, 3)==0);
	}
	@Test
	public void testSub(){
		assertTrue(cobj.Sub(3, 3)==0);
	}
	@Test
	public void testMul(){
		assertTrue(cobj.Mul(3, 4)==9);
	}
	@Test
	public void testDiv(){
		assertTrue(cobj.Div(3, 3)!=0);
	}
}
