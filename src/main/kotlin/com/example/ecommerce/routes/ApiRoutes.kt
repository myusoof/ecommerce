package com.example.ecommerce.routes

import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.function.server.router

class ApiRoutes{

    @Bean
    fun route() = router {
        ("/api").nest {
            GET("/customer/1",)
        }
    }
}