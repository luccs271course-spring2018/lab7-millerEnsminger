package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.*;

public class LinkedStack<E> implements IStack<E>{

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj){
    // TODO
    top = new Node<>(obj, top);
    return obj;
  }

  @Override
  public E peek() {
    // TODO



    if(isEmpty() == true){
      throw new NoSuchElementException();

    }
    else{
      return top.data;
      
    }
    }

  

  @Override
  public E pop() {
    // TODO
    

    if(isEmpty() == true){
      throw new NoSuchElementException();

    }
    else{
      E result = top.data;
      top = top.next;
      return result;
      
    }
    }

  

  @Override
  public boolean isEmpty() {
    // TODO
    if(top == null)
    {
      return true;
    }
    if(top != null)
    {
      return false;
    }
  }

  @Override
public List<E> asList() {
  final ArrayList<E> result = new ArrayList<>();
  populateList(top, result); //  replace null with the right reference
  return result;
}  
private void populateList(final Node<E> curr, final List<E> result) {
  //  recursively populate the list in the desired order
  result.add(curr.data);
  populateList(curr.next, result);
}

@Override
public List<E> asFifoList() {
  final ArrayList<E> result = new ArrayList<>();
  populateFifoList(top, result); //  replace null with the right reference
  return result;
}

private void populateFifoList(final Node<E> curr, final List<E> result) {
  //  recursively populate the list in the desired order
  result.add(0,curr.data);
  populateList(curr.next, result);
}
}
