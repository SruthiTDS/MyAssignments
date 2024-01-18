package week6.day1.testcase;

import org.testng.annotations.Test;

public class LearningAttributes {
	@Test(priority=1,enabled=false)
	public void Create() {
		System.out.println("Create");
	}
	@Test(invocationCount=3,invocationTimeOut=200)
	public void Delete() {
		System.out.println("Delete");
	}
	@Test(priority=-1)
	public void Merge() {
		System.out.println("Merge");
	}
	@Test(priority=2)
	public void Edit() {
		System.out.println("Edit");
	}
	@Test
	public void Test() {
		System.out.println("Test");
	}
	

}
