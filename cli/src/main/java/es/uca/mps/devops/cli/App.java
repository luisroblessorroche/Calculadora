package es.uca.mps.devops.cli;
import java.util.Scanner;
import java.lang.Math;

import java.util.*;

public class App
{
	
	private int x;
	private int y;
	
	public App(int x_, int y_) {
		x = x_;
		y = y_;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

		
	public int suma()
	{
		return x+y;
	}
	
	public int resta()
	{
		return x-y;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		int x,y,op=-1;
		
		while(flag == true){
			
			System.out.println("Escribe el primer número");
			x = s.nextInt();
			
			System.out.println("Escribe el segundo número");
			y = s.nextInt();
			
			App c = new App(x,y);
			do {
				System.out.println("0: Salir");
				System.out.println("1: Suma");
				System.out.println("2: Resta");
				System.out.println("Escribe un numero entre el 0 y el 2");
				op = s.nextInt();
			}while(op < 0 && op >2);
			
			switch(op) {
				case 0: flag=false;break;
				case 1: System.out.println("El resultado es: "+c.suma());break;
				case 2: System.out.println("El resultado es: "+c.resta());break;
			}
		}
		System.out.println("Gracias por utilizar esta calculadora");
		s.close();
	}
	
}
