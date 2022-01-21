package com.knoldus.assignment

class Empty[+A] extends Stack[Nothing] {
  def pop: (Stack[Nothing], Nothing) = throw new NoSuchElementException("no element to pop")

  def push[B >: Nothing](element: B): Stack[B] = new StackImpl(List(element))

  def isEmpty: Boolean = true

  def top: Nothing = throw new NoSuchElementException("no top element")
}

