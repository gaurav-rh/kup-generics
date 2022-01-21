package com.knoldus.assignment

class StackImpl[+A](stack: List[A]) extends Stack[A] {
  def pop: (Stack[A], A) = {
    if (stack.nonEmpty) {
      (new StackImpl(stack.dropRight(1)), stack.last)
    }
    else
      throw new NoSuchElementException("empty stack")
  }

  def isEmpty: Boolean = false

  def push[B >: A](element: B): Stack[B] = new StackImpl(stack :+ element)

  def top: A = stack.last

  override def toString: String = stack.toString
}
