package com.example.ecommerce.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DependentService(@Autowired val serviceOne: ServiceOne, @Autowired val serviceTwo: ServiceTwo) {

    fun doSomethingInBulk() {
        serviceOne.doSomething()
        serviceTwo.doSomething()
    }
}