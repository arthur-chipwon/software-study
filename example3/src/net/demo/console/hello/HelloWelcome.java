package net.demo.console.hello;

import java.io.*;

public class HelloWelcome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		System.out.println("What is your name?");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println("Welcome you, " + str + "!");

	}

}
