package Com.junitprogramm;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;



public class Testcase {
	StudentAges s1 = new StudentAges(25, "Akash");
	StudentAges s2 = new StudentAges(15, "Ayush");
	@Test
	public void testbellow() {
		s2.calculateAge();
		assertEquals("bellow 18", s2.res);
		s2.disp();
	}
	@Test
	public void testAbove() {
		s1.calculateAge();
		assertEquals("above 18", s1.res);
		s1.disp();
	}

}
