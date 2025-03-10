package hu.obuda.devops.fibonaccirestapi.controller

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class FibonacciController {

    /*@Autowired
    var fibonacciService: FibonacciService? = null

    @GetMapping(value = ["fibonacci"])
    open fun fibonacci(@RequestParam n: Int): Int? {
        // TODO - If n is greater than 46 then return BAD REQUEST use HttpStatus
        return fibonacciService?.fibonacci(n)
    }
}*/
    @Autowired
    var fibonacciService: FibonacciService? = null

    @GetMapping(value = ["fibonacci"])
    open fun fibonacci(@RequestParam n: Int): ResponseEntity<Any> {
        // Validate that n is not greater than 46
        if (n > 46) {
            return ResponseEntity.badRequest().body("n must be less than or equal to 46")
        }
        return ResponseEntity.ok(fibonacciService?.fibonacci(n))

    }
}