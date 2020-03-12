package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Shape> shapes = new ArrayList<>();
		System.out.print("Enter the number of shapes : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Shape #"+ (i+1)+" Data:");
			System.out.print("Retangle or Circle? (r/c)");
			char type = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED) : ");
			sc.nextLine();
			String color = sc.nextLine();
			if(type == 'r') {
				System.out.print("Width : ");
				double width = sc.nextDouble();
				System.out.print("Height : ");
				double height = sc.nextDouble();
				shapes.add(new Rectangle(Color.valueOf(color),width,height));
			}
			if(type == 'c') {
				System.out.print("Radius : ");
				double radius = sc.nextDouble();
				shapes.add(new Circle(radius));
			}
					
		}
		
		System.out.println("Shape Areas : ");
		for(Shape shape : shapes) {
			System.out.println(String.format("%.2f",shape.area()));
		}
		
		sc.close();
	}
}
