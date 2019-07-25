package BasicMaven.BasicMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	@Test
    public void sum() {
    	System.out.println("sum");
    	int a = 10;
    	int b = 20;
    	Assert.assertEquals(30, a+b);
    	
    }
	@Test
    public void sub() {
    	System.out.println("subtrac");
    	int a = 10;
    	int b = 20;
    	Assert.assertEquals(10, b-a);
    }
    @Test
    public void div() {
    	    	System.out.println("divide");
    	    	int a = 10;
    	    	int b = 20;
    	    	Assert.assertEquals(2, b/a);
    	    	
    	    }
    @Test
    public void multiple() {
    	    	System.out.println("divide");
    	    	int a = 10;
    	    	int b = 20;
    	    	Assert.assertEquals(200, b*a);
    	    	
    	    }

   
}
