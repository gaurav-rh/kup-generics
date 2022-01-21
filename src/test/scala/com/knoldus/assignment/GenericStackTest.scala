package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class StackImplTest extends AnyFlatSpec {
  val StackImplObject = new StackImpl[Int](List(2, 4))
  val element: Int = 5

  "push in stack" should "be valid " in {
    val resultStack = List(2, 4, 5)
    assert(StackImplObject.push(element).toString == resultStack.toString())
  }

  "pop in stack" should "be valid " in {
    val resultStack = (List(2), 4)
    assert(StackImplObject.pop.toString == resultStack.toString())
  }

  "pop in stack when stack is empty" should "be valid " in {
    val stack: Stack[Nothing] = new StackImpl[Nothing](List())
    val resultMessage: String = "empty stack"
    val thrown = intercept[NoSuchElementException] {
      stack.pop
    }
    assert(thrown.getMessage == resultMessage)
  }

  "stack status if not empty" should "be valid  " in {
    val resultStatus: Boolean = false
    assert(StackImplObject.isEmpty == resultStatus)
  }

  "top in stack" should "be valid " in {
    val resultStack = 4
    assert(StackImplObject.top.toString == resultStack.toString)
  }
}
