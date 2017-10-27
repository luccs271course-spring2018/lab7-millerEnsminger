package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

	public static void main(String[] args) {
		// TODO read successive input lines until EOF, then print out in reverse order


	LinkedStack<String> stack = new LinkedStack<String>();
		
    final Scanner input = new Scanner(System.in);
		String line;
		while ((line = input.nextLine()) != null) {
			line = input.nextLine();
			stack.push(line);
		}
		String response = ""; 
		while (!stack.isEmpty()){
			response = response + stack.pop();
			System.out.println(response);
		}


	}
}
