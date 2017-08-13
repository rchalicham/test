package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	List<String> ss =  new ArrayList<String>();
	List<String> getList(){
		 
		return ss;		
	}
 
	 void setLists( List<String> s) {
		 s.add("pam");
	 }
	 
	 public void badSwap(int var1, int var2)
	 {
	   int temp = var1;
	   var1 = var2;
	   var2 = temp;
	 }

	 public void tricky(Point arg1, Point arg2)
	 {
	   arg1.x = 100;
	   arg1.y = 100;
	   Point temp = arg1;
	   arg1 = arg2;
	   arg2 = temp;
	 }

	public static void main(String[] args) {		
		Test tt = new Test();
		Point pnt1 = new Point(0,0);
		  Point pnt2 = new Point(0,0);
		  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
		  System.out.println(" ");
		  tt.tricky(pnt1,pnt2);
		  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y); 
//		List<String> ls = tt.getList();
//		tt.setLists(ls);
//		System.out.println(tt.getList());

	}

}