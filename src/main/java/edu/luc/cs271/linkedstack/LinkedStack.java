package edu.luc.cs271.linkedstack;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  private Node<E> top;

  private int size = 0;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    top = new Node<>(obj, top);
    size++;
    return obj;
  }

  @Override
  public E peek() {
    // TODO

    if (isEmpty() == true) {
      throw new NoSuchElementException();

    } else {
      return top.data;
    }
  }

  @Override
  public E pop() {
    // TODO

    if (isEmpty() == true) {
      throw new NoSuchElementException();

    } else {
      E result = top.data;
      top = top.next;
      size--;
      return result;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if (top == null) {
      return true;
    }
    return false;
    // if(top != null)
    // {
    //   return false;
    // }
  }

  @Override
  public List<E> asList() {
    final List<E> result = new ArrayList(size);
    populateList(top, result); //  replace null with the right reference
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    //  recursively populate the list in the desired order
    // add if else where if next != null
    if (curr != null) {
      if (curr.next != null) {
        result.add(curr.data);
        populateList(curr.next, result);
      } else {
        result.add(curr.data);
      }
    }
  }

  @Override
  public List<E> asFifoList() {
    final List<E> result = new ArrayList(size);
    populateFifoList(top, result); //  replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    //  recursively populate the list in the desired order
    // add if else where if next !=null
    if (curr != null) {
      if (curr.next != null) {
        result.add(0, curr.data);
        populateList(curr.next, result);
      } else {
        result.add(0, curr.data);
      }
    }
  }
}
