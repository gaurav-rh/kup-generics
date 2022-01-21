package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class EmptyTest extends AnyFlatSpec {
  val emptyStack = new Empty[Int]
  val element: Int = 5
  "push in empty stack" should "be valid" in {
    val result: List[Int] = List(5)
    assert(emptyStack.push(element).toString == result.toString())
  }

  "pop in empty stack" should "be valid" in {
    val resultMessage: String = "no element to pop"
    val thrown = intercept[NoSuchElementException] {
      emptyStack.pop
    }
    assert(thrown.getMessage == resultMessage)
  }
  "top in empty stack" should "be valid" in {
    val resultMessage: String = "no top element"
    val thrown = intercept[NoSuchElementException] {
      emptyStack.top
    }
    assert(thrown.getMessage == resultMessage)
  }

  "isEmpty in empty stack" should "be valid" in {
    val result: Boolean = true
    assert(emptyStack.isEmpty == result)
  }
}
