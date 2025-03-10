package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    /*fun fibonacci(n: Int): Int {
        for(i in 0..n){

        }
        return if (n == 1) 1
        else
        //else 0 // TODO instead of this logic implement fibonacci
    }*/
    fun fibonacci(n: Int): Int {
        if (n <= 1) return n

        var a = 0
        var b = 1
        var fib = 0

        for (i in 2..n) {
            fib = a + b
            a = b
            b = fib
        }

        return fib
    }
}