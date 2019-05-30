package io.esuau.rest

import io.esuau.definition.Book
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class BookResource {

    @GET
    fun getBooks() = listOf(Book(1L, "Clean Architecture: A Craftsman's Guide to Software Structure and Design", "Robert C. Martin", "Prentice Hall", 2017, "978-0134494166"),
                            Book(1L, "Domain-Driven Design: Tackling Complexity in the Heart of Software", "Eric Evans", "Addison Wesley", 2003, "978-0321125217"))

}