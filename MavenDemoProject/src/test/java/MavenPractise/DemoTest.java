package MavenPractise;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest {

	@Test
	public void sum()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
		System.out.println("SUM SUCCESS");
	}
	@Test
	public void sub()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
		System.out.println("SUB SUCCESS");
	}
	
	@Test
	public void div()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
		System.out.println("DIV SUCCESS");
	}
	
	@Test
	public void multi()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(200, b*a);
		System.out.println("MULTI SUCCESS");
		
	}
}
