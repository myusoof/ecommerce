package com.example.ecommerce.setterlevel

import org.springframework.beans.factory.annotation.Autowired

class DependentServiceTwo {

    @Autowired
    private lateinit var serviceTestOne: ServiceTestOne

    @Autowired
    private lateinit var serviceTestTwo: ServiceTestTwo

//    @Autowired
//    fun setServiceTestOne(serviceTestOne: ServiceTestOne){
//        this.serviceTestOne = serviceTestOne
//    }
//
//    @Autowired
//    fun setServiceTestTwo(serviceTestTwo: ServiceTestTwo){
//        this.serviceTestTwo = serviceTestTwo
//    }

    fun doSomething(){
        serviceTestOne.doSomething()
        serviceTestTwo.doSomething()
    }
}