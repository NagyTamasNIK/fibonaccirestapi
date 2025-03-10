package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun testFibonacciZero() {
        Assertions.assertEquals(0, underTest.fibonacci(0))
    }

    @Test
    fun testFibonacciOne() {
        Assertions.assertEquals(1, underTest.fibonacci(1))
    }

    @Test
    fun testFibonacciTwo() {
        Assertions.assertEquals(1, underTest.fibonacci(2))
    }

    @Test
    fun testFibonacciThree() {
        Assertions.assertEquals(2, underTest.fibonacci(3))
    }

    @Test
    fun testFibonacciFour() {
        Assertions.assertEquals(3, underTest.fibonacci(4))
    }

    @Test
    fun testFibonacciFive() {
        Assertions.assertEquals(5, underTest.fibonacci(5))
    }

    @Test
    fun testFibonacciSix() {
        Assertions.assertEquals(8, underTest.fibonacci(6))
    }

    @Test
    fun testFibonacciSeven() {
        Assertions.assertEquals(13, underTest.fibonacci(7))
    }

    @Test
    fun testFibonacciEight() {
        Assertions.assertEquals(21, underTest.fibonacci(8))
    }

    @Test
    fun testFibonacciNine() {
        Assertions.assertEquals(34, underTest.fibonacci(9))
    }

    @Test
    fun testFibonacciTen() {
        Assertions.assertEquals(55, underTest.fibonacci(10))
    }

    @Test
    fun testFibonacciEleven() {
        Assertions.assertEquals(89, underTest.fibonacci(11))
    }

    @Test
    fun testFibonacciTwelve() {
        Assertions.assertEquals(144, underTest.fibonacci(12))
    }
    // TODO - Test with greater numbers and test edge cases

}