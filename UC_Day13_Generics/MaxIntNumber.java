package com.bridgelabz.day13.UC_Day13_Generics;

public class MaxIntNumber {
	public static Float maxNumberFloat(Float num1, Float num2, Float num3)
	{
		Float max = num1;
		if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			max = num1;
		else if(num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			max = num2;
		else
			max = num3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("The max Number Among 3 numbers is: "+maxNumberFloat(93.32f, 2698.76f, 437.3f));

	}

}
