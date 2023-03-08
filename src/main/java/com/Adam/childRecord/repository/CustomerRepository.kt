package com.Adam.childRecord.repository

import com.Adam.childRecord.model.CustomerResponse
import java.util.UUID

class CustomerRepository {

    val customers = listOf(
            CustomerResponse(
                    "1",
                    "Mark",
                    "David",
                    "mark-david@gmail.com"
            ),
            CustomerResponse(
                    UUID.randomUUID().toString(),
                    "Tony",
                    "Nude",
                    "tony@gmail.com"
            ),
            CustomerResponse(
                    UUID.randomUUID().toString(),
                    "Gun",
                    "Gass",
                    "gasst@gmail.com"
            ),
    )

    fun findById(id: String): CustomerResponse?{
        return customers.find { it.id == id }
    }
}