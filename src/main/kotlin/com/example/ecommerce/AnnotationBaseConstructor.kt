package com.example.ecommerce

import com.example.ecommerce.example.DependentService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.ClassPathXmlApplicationContext


//@SpringBootApplication
class AnnotationBaseConstructor

fun main(args: Array<String>) {
    runApplication<AnnotationBaseConstructor>(*args)
    val applicationContext = ClassPathXmlApplicationContext("autowiredfile.xml")
    val dependentService = applicationContext.getBean("dependentService") as DependentService
    dependentService.doSomethingInBulk()
}
