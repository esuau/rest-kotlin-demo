package io.esuau.rest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/books")
class BookResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() = "hello"
}