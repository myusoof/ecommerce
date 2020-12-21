package com.example.ecommerce

import com.example.ecommerce.setterlevel.DependentServiceTwo
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
class SetterLevelInjection

fun main() {
    val applicationContext = ClassPathXmlApplicationContext("settinglevel.xml")
//    println(applicationContext.getBeansOfType(DependentServiceTwo::class.java).size)
}