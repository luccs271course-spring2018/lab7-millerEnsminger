package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.ArrayList;

public class ReverseLines {

	public static void main(final String[] args) {
  final Scanner input = new Scanner(System.in);
  printReverse(input);
}
private static void printReverse(final Scanner input) {
  // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
  System.out.println(input.nextLine());
  String inputs = input.nextLine();
  ArrayList<E> result = new ArrayList<>();
  result.add(0,inputs);
  for(int i = 0; i < result.size(); i++)
  {
  	System.out.println(result[i]);
  }
  
} 
}
