package org.keirobm.accounts

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("org.keirobm.accounts")
                .mainClass(Application.javaClass)
                .start()
    }
}