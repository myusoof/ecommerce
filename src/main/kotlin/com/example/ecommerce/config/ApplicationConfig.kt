package com.example.ecommerce.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component


@Component
@ConfigurationProperties(prefix = "application")
data class ApplicationConfig(
    var url: String = "",
    var version: String = "",
    var username: String = "",
    val tableName: List<String>
)
