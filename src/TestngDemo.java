import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngDemo {

	@Test(priority = 5)//runs based on priority rather than sequential
	public void demo() {
		Reporter.log("test1",true);
	}
	@Test(dependsOnMethods = {"demo2","demo3"})//array of methods to be executed before execution
	public void demo4() {
	Reporter.log("test5",true);
	}
		
	
	@Test(priority=2,invocationCount = 3)// setting priority for test and no of times of running the test
	public void demo1() {
		Reporter.log("test2",true);
	}
	
	@Test(dependsOnMethods = "demo2")//executes only after executing specified method
	public void demo3() {
		Reporter.log("test4",true);
	}
	
	@Test(enabled = true)//whether to run the test or not
	public void demo2() {
		Reporter.log("test3", true);
	}
	
	@Test(groups="func", dependsOnGroups = "smoke" )
	public void demo5(){
		Reporter.log("func",true);
	}
	@Test(groups = "smoke")
	public void demo6() {
		Reporter.log("smoke1",true);
	}
	@Test(groups = "smoke")
	public void demo7() {
		Reporter.log("smoke2",true);
	}
	}

