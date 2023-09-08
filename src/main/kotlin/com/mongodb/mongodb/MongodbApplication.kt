package com.mongodb.mongodb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongodbApplication

fun main(args: Array<String>) {
	runApplication<MongodbApplication>(*args)
}
