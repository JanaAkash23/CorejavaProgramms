package Com.junitprogramm;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class JunitTestString{

	JunitString obj=new JunitString("Akash","Akash");
@Test
public void testDisplay(){
  assertEquals("Both strings are eqqual",obj.display());
  System.out.println("Both strings are eqqual.");
}

}

