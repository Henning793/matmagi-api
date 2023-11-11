package com.example.matmagi

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class RescipeControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `should get all recipes`() {
        mockMvc.get("/recipe").andExpect {
            status { isOk() }
            jsonPath("$[0].name") { value("korean fried chicken") }
            jsonPath("$[0].id") { value(1) }

        }
    }
}