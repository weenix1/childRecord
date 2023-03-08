package com.Adam.childRecord.model

data class CustomerResponse(
        val id: String,
        val firstName: String,
        val lastName: String,
        val email: String,

)
// val shows that this final and immutable and does not need setter, kotlin gives automatically getter
// so no need to write the getter. And using data class gives so many boiler plates to use.
// no need to write public because in kotlin all classes are public unless specified private