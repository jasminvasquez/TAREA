package jasmin;

import java.util.Scanner;

public class miclase 
{

	public static void main(String[] args)
	{
				// TODO Auto-generated method stub
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4");
		System.out.print("5");
		Scanner mi_scanner= new Scanner(System.in);
		int mi_variable =mi_scanner.nextInt();
		System.out.print(mi_variable*2);
		
		if (mi_variable==10)
		{
			System.out.print("es un 10");
		}
		System.out.print("fin del prog");
	}
}



