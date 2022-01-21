package com.knoldus.assignment

trait Stack[+A] {
  def push[B >: A](element: B): Stack[B]

  def pop: (Stack[A], A)

  def isEmpty: Boolean

  def top: A
}
