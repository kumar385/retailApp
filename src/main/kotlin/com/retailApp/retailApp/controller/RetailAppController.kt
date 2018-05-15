package com.retailApp.retailApp.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
open class RetailAppController(){

    @PostMapping(path=["/test"])
    open fun testURL(@RequestBody  address:Address): Address{
        return Address(name = "address is updated "+address.name)
    }

    class Address (
        val name:String
    )

}