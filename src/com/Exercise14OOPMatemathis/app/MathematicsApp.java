package com.Exercise14OOPMatemathis.app;

import java.util.Scanner;
import com.Exercise14OOPMatemathis.model.Operations;

public class MathematicsApp {

	public static void main(String[] args) {
		
		//Variable declaration
		double base = 0;
		double height = 0;
		double radio = 0;
		double side = 0;
		double result = 0;
		
		//Object declaration
		Scanner input = new Scanner(System.in);
		
		//Obtain the values
		System.out.println("Introduce the base of the triangle: ");
		base = input.nextDouble();
		
		System.out.print("Introduce the height of the triangle: ");
		height = input.nextDouble();
		
		result = Operations.areaTriangle(base, height);
		System.out.println("The area of the tringle is: "+result);

	}

}
