package hu.obuda.devops.fibonaccirestapi.service
//package hu.obuda.devops.fibonaccirestapi.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.result.MockMvcResultMatchers


@SpringBootTest
@AutoConfigureMockMvc
class FibonacciControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `should return fibonacci number when n is less than or equal to 46`() {
        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/fibonacci")
            .param("n", "10"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("55"))
    }

    @Test
    fun `should return bad request when n is greater than 46`() {
        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/fibonacci")
            .param("n", "47"))
            .andExpect(MockMvcResultMatchers.status().isBadRequest)
            .andExpect(MockMvcResultMatchers.content().string("n must be less than or equal to 46"))
    }

    @Test
    fun `should return fibonacci number when n is 0`() {
        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/fibonacci")
            .param("n", "0"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("0"))
    }

    @Test
    fun `should return fibonacci number when n is 1`() {
        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/fibonacci")
            .param("n", "1"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("1"))
    }

    @Test
    fun `should return fibonacci number when n is 2`() {
        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/fibonacci")
            .param("n", "2"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("1"))
    }

    @Test
    fun `should return fibonacci number when n is 46`() {
        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/fibonacci")
            .param("n", "46"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("1836311903"))
    }

}