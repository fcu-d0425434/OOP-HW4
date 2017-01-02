package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a string");
		str1 = scanner.next();
		PasswordEncorder password = new PasswordEncorder();
		password.setpass(str1);
		System.out.println(password.getpass());
	}
}
