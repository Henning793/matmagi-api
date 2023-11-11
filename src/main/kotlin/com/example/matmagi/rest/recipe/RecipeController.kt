package com.example.matmagi.rest.recipe

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/recipe")
class RecipeController {
    @GetMapping
    fun getRecipes (): List<RecipeDTO> {
        return listOf(
            RecipeDTO(1, "korean fried chicken")
        )
    }

}