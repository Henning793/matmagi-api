package com.example.matmagi

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class HealthControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `should get health` (){
        mockMvc.get("/health").andExpect {
            status { isOk() }
            content { string("health1") }
        }
    }
}