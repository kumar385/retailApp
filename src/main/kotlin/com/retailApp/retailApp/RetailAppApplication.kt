package com.retailApp.retailApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.retailApp.retailApp.controller")
class RetailAppApplication

fun main(args: Array<String>) {
    runApplication<RetailAppApplication>(*args)
}
