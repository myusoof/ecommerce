package com.example.ecommerce.config

import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class ApplicationService(val applicationConfig: ApplicationConfig) {

    @PostConstruct
    fun testing(){
        println("${applicationConfig.url} ${applicationConfig.username} ${applicationConfig.version}")
    }

}