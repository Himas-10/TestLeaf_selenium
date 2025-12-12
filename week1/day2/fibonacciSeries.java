package week1.day2;

import java.util.Iterator;

public class fibonacciSeries {

	public static void main(String[] args) {
    // TODO Auto-generated method stub
	int first, second;
	first = 0;
	second = 1;
	
	for (int i = 0; i <=8; ++i)
	{
		System.out.println("Fibonacci Series are:" + first);

		int n1= first+second;
		first = second;
		second = n1;
	}
		
	}

	}


