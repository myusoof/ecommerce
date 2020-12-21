package com.example.ecommerce.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import java.util.*


@Component
@ConfigurationProperties(prefix = "application")
data class ApplicationConfig(
    var url: String = "",
    var version: String = "",
    var username: String = "",
    val tableName: List<String>,
    val mapExample: Map<String, String>,
    val enumTable: EnumMap<Table, TableProperties> = EnumMap(Table::class.java)
)
class TableProperties {
    var name: String = ""
}

enum class Table(val tableName: String){
    CUSTOMER("customer-table"),
    ORDER("order-table")
}
