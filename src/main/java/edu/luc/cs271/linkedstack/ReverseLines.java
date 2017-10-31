package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in
    // reverse order
    // System.out.println(input.nextLine());

    if (input.hasNextLine()) {
      final String lines = input.nextLine();
      System.out.println(lines);
      printReverse(input);
      System.out.println(lines);
    }
  }
}
