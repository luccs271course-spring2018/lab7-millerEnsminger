package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in
    // reverse order
    System.out.println(input.nextLine());
    String inputs = input.nextLine();
    LinkedStack<String> stack = new LinkedStack<String>();
    List<String> result = new ArrayList<String>();
    stack.push(inputs);
    System.out.println(stack.peek());
    result.add(0, inputs);
    for (int i = 0; i < result.size(); i++) {
      System.out.println(result.get(i));
    }
  }
}
