package com.example.matmagi

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class MatmagiConfiguration {
    @Bean
    fun corsConfig (): WebMvcConfigurer {
            return object : WebMvcConfigurer {
                override fun addCorsMappings(registry: CorsRegistry) {
                    registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("*")
                }
            }
    }
}