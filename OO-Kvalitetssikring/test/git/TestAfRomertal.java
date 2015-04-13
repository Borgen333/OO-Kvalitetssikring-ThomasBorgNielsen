package git;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAfRomertal {
	
	private Romertal romertal;
	
	
	@Test
	public void testAfOverFireIer() {
		romertal = new Romertal("I", "IIII");
		assertEquals("V", romertal.getFacit());
	}
	
	@Test
	public void testAfOverFireXer() {
		romertal = new Romertal("X", "XXXX");
		assertEquals("L", romertal.getFacit());
	}

}
