package maratons;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();
		System.out.println("Bye...");

	}

	private void readInput() {
		double a;
		double b;
		double c;
		double d;
		double u;
		Double calArea;
		Double calRound;
		int shapeCounter = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("Lutfen hesaplamak istediginiz seklin (en fazla 4 kenar) kenar uzunluklarini giriniz (-1 ile cikis): ");
		System.out.println("Lutfen 1. kenar uzunlugunu giriniz (0 ile sonlandir): ");
		a = sc.nextDouble();
		if (a==-1) 
			break;
		if (a== 0) {System.out.println("Kenar uzunlugunu 0 girdiniz, lutfen tekrar deneyiniz.");
		continue;}
		
		System.out.println("Lutfen 2. kenar uzunlugunu giriniz (0 ile sonlandir): ");
		b = sc.nextDouble();
		if (b==0) {System.err.println("Tek kenarlı sekil olamaz");
			continue;}
		System.out.println("Lutfen 3. kenar uzunlugunu giriniz (0 ile sonlandir): ");
		c = sc.nextDouble();
		if (c==0) {System.err.println("Iki kenarlı sekil olamaz");
		continue;}
		
		System.out.println("Lutfen 4. kenar uzunlugunu giriniz (0 ile sonlandir): ");
		d = sc.nextDouble();		
		
		
		if(d == 0) {
			u = (a+b+c)/2; //üçgenin alan hesabı için gerekli değişken
			calArea = (double) Math.sqrt(u * (u - a) * (u - b) * (u - c));
			if (calArea.isNaN()) {
				System.out.println("Girdiginiz kenar uzunluklari bir sekle ait olamaz, tekrar deneyiniz");
				continue;
			}else {
			System.out.println(shapeCounter + ".seklin alani: " + calArea);
			calRound = a+b+c;			
			System.out.println(shapeCounter + ".seklin cevresi: " + calRound);
			}
		}
			
		if (d!= 0) {
		calArea = a*b;  
		System.out.println(shapeCounter + ".seklin alani: " + calArea);
		calRound = a+b+c+d;			
		System.out.println(shapeCounter + ".seklin cevresi: " + calRound);
		}
		
		shapeCounter ++;
	}
		sc.close();
			
	}
		
}
	
	

