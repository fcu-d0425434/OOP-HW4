package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NissanTiida square = new NissanTiida();
		int x,y;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		
		for(y=1;y<=x;y++){
			System.out.println("call:"+y);
			square.printsquare(y);
		}
	}
}
