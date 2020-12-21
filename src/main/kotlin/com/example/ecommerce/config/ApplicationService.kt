package com.example.ecommerce.config

import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class ApplicationService(val applicationConfig: ApplicationConfig) {

    @PostConstruct
    fun applicationRead(){
        println("${applicationConfig.url} ${applicationConfig.username} ${applicationConfig.version}")
        applicationConfig.tableName.forEach{println(it)}
        applicationConfig.mapExample.forEach{k ,v -> println("$k: $v")}
        applicationConfig.enumTable.forEach{k, v -> println("${k.tableName}, ${v.name} ") }
    }

}