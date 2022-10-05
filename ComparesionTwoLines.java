package com.lineComparisionProgram;

public class ComparesionTwoLines {

	public static void main(String[] args) {

		int x1 = 80;
		int x2 = 40;
		int y1 = 80;
		int y2 = 40;

		int a1 = 80;
		int a2 = 400;
		int b1 = 80;
		int b2 = 400;

		Double z1 = 0.0;
		Double z2 = 0.0;

		float Line1_Length = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		z1 = Double.valueOf(Line1_Length);

		System.out.println("Line1_Length");
		System.out.println(Line1_Length);

		float Line2_Length = (float) Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

		z2 = Double.valueOf(Line2_Length);

		System.out.println("Line2_Length");
		System.out.println(Line2_Length);

		// System.out.println(z1);
		// System.out.println(z2);

		System.out.println(z1.compareTo(z2)); // if z2--> greater thn -ve , if z1-->greater thn +ve value

		if (z1.compareTo(z2) == 1)
		{
			// System.out.println(z1.compareTo(z2));
			System.out.println("z1 line is greater");
		}
		else if (z1.compareTo(z2) == -1) 
		{
			// System.out.println(z1.compareTo(z2));
			System.out.println("z2 Line is greater");
		}
		else 
		{
			System.out.println("both line Equal");
		}
	}

}