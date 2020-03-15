package org.keirobm.accounts

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello")
class HelloController {

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(): Map<String, Any> = hashMapOf(
        "field1" to 123,
        "field2" to true
    )


}