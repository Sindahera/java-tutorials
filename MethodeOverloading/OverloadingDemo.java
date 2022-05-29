package io.github.sindahera.MethodeOverloading;

public class OverloadingDemo {

	  public int multiply(int x, int y)
	  {
		  return(x*y);
	  }
	  
	  public int multiply(int x, int y, int z)
	  {
		  return(x*y*z);
	  }
	  
	  public double multiply(double x, double y, double z)
	  {
		  return(x*y*z);
	  }
	  
	  public static void main(String[] args) {
		  OverloadingDemo demo = new OverloadingDemo();
		  System.out.println(demo.multiply(10, 20));
		  System.out.println(demo.multiply(10, 20,30));
		  System.out.println(demo.multiply(10.5, 20.5,5.5));
	}
	  

}
