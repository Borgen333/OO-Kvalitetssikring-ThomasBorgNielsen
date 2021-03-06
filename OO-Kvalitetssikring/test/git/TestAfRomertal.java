package git;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAfRomertal {

	@Test
	public void testAfOverFireIer() {
		Romertal romertal = new Romertal("I", "IIII");
		
		assertEquals("V", romertal.getFacit());
	}
	
	@Test
	public void testAfOverFireXer() {
		Romertal romertal = new Romertal("X", "XXXX");
		
		assertEquals("L", romertal.getFacit());
	}
	
	@Test
	public void testAfOverFireCer() {
		Romertal romertal = new Romertal("C", "CCCC");
		
		assertEquals("D", romertal.getFacit());
	}
	
	@Test
	public void testAfOverEnVer() {
		Romertal romertal = new Romertal("V", "V");
		
		assertEquals("X", romertal.getFacit());
	}
	
	@Test
	public void testAfOverEnLer() {
		Romertal romertal = new Romertal("L", "L");
		
		assertEquals("C", romertal.getFacit());
	}
	
	@Test
	public void testAfOverEnDer() {
		Romertal romertal = new Romertal("D", "D");
		
		assertEquals("M", romertal.getFacit());
	}
	
	@Test
	public void testAfForHøjInput()	{
		Romertal romertal = new Romertal("MMM", "DDDD");
		
		assertEquals("Ugyldigt input, prøv igen", romertal.getFacit());
	}
	
	@Test
	public void testAfForLavInput() {
		Romertal romertal = new Romertal("", "");
		
		assertEquals("Ugyldigt input, prøv igen", romertal.getFacit());
	}
	
	@Test
	public void testAfHøjtInput() {
		Romertal romertal = new Romertal("MDCCCC", "XXXXVIIII");
		
		assertEquals("MDCCCCXXXXVIIII", romertal.getFacit());
	}
	
	@Test
	public void testOOInput() {
		Romertal romertal = new Romertal("MCCXVII", "DCCCCLXI");
		
		assertEquals("MMCLXXVIII", romertal.getFacit());
	}
}
