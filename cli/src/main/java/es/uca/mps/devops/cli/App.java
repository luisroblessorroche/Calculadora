package es.uca.mps.devops.cli;
import java.util.Scanner;
import java.lang.Math;

import java.util.*;

public class App
{
	public class DivideByZeroException extends Exception
	{
		public DivideByZeroException(String message)
		{
			super(message);
		}
	}
	
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
	
	public int multiplicar()
	{
		return x*y;
	}
	
	public int potencia()
	{
		return (int)(Math.pow(x, y));
	}
	
	public int dividir() throws DivideByZeroException
	{
		if(y == 0)
		{
			throw new DivideByZeroException("No se puede dividir entre 0");
		}
		else
		{
			return x/y;
		}
	}
	
	public int modulo() throws DivideByZeroException
	{
		if(y == 0)
		{
			throw new DivideByZeroException("No se puede hacer el modulo entre 0");
		}
		else
		{
			return x%y;
		}
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
				System.out.println("3: Multiplicacion");
				System.out.println("4: Potencia");
				System.out.println("5: Division");
				System.out.println("6: Modulo");
				System.out.println("Escribe un numero entre el 0 y el 6");
				op = s.nextInt();
			}while(op < 0 && op > 6);
			
			switch(op) {
				case 0: flag=false;break;
				case 1: System.out.println("El resultado es: "+c.suma());break;
				case 2: System.out.println("El resultado es: "+c.resta());break;
				case 3: System.out.println("El resultado es: "+c.multiplicar());break;
				case 4: System.out.println("El resultado es: "+c.potencia());break;
				case 5: try
				{
					System.out.println("El resultado es: "+c.dividir());
				}catch(DivideByZeroException ex)
				{
					System.out.println(ex.getMessage());
				};break;
				case 6: try
				{
					System.out.println("El resultado es: "+c.modulo());
				}catch(DivideByZeroException ex2)
				{
					System.out.println(ex2.getMessage());
				};break;
			}
		}
		System.out.println("Gracias por utilizar esta calculadora");
		s.close();
	}
}
