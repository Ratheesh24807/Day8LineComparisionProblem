package com.lineComparisionProgram;

public class CheckTwoLinesEqual {
	
	int x1 = 2;
	int x2 = 4;
	int y1 = 2;
	int y2 = 4;
	
	int a1 = 2;
	int a2 = 4;
	int b1 = 2;
	int b2 = 4;

	String z1 ="0";
	String z2 ="0";

	public static void main(String[] args) {
		 
		CheckTwoLinesEqual TwoLinesEqual = new CheckTwoLinesEqual();
	
		float Line1_Length =  (float) Math.sqrt( Math.pow (TwoLinesEqual.x2 - TwoLinesEqual.x1 ,2) + Math.pow (TwoLinesEqual.y2- TwoLinesEqual.y1 , 2));
			
		TwoLinesEqual.z1 =String.valueOf(Line1_Length);  
		
		System.out.println( "Line1_Length" );
		System.out.println( Line1_Length );
		
		float Line2_Length =  (float) Math.sqrt( Math.pow (TwoLinesEqual.a2 - TwoLinesEqual.a1 ,2) + Math.pow (TwoLinesEqual.b2- TwoLinesEqual.b1 , 2));
		
		TwoLinesEqual.z2 =String.valueOf(Line2_Length);
		
		System.out.println( "Line2_Length");
		System.out.println( Line2_Length );
		
		if(TwoLinesEqual.z1.equals(TwoLinesEqual.z2))
				
		{
			System.out.println(TwoLinesEqual.z1.equals(TwoLinesEqual.z2));			
			System.out.println("Both Line equal");	

	      }
		else {
			System.out.println("Both Line are not equal");	
			
		}
	}
	
}
