package com.example.ecommerce.example

import org.springframework.stereotype.Service

@Service
class DependentService(val serviceOne: ServiceOne, val serviceTwo: ServiceTwo) {

    fun doSomethingInBulk() {
        serviceOne.doSomething()
        serviceTwo.doSomething()
    }
}