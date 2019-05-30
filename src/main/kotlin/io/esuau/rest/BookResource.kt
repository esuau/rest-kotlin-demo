package io.esuau.rest

import io.esuau.definition.Book
import java.lang.Exception
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class BookResource {

    companion object {
        var books: MutableList<Book> = mutableListOf(Book(1L, "Clean Architecture: A Craftsman's Guide to Software Structure and Design", "Robert C. Martin", "Prentice Hall", 2017, "978-0134494166"),
                                                     Book(2L, "Domain-Driven Design: Tackling Complexity in the Heart of Software", "Eric Evans", "Addison Wesley", 2003, "978-0321125217"))
    }

    @GET
    fun getBooks() = books

    @GET
    @Path("/{id}")
    fun getBookById(@PathParam("id") id: Long): Response {
        val book: Book = books.find { it.id == id } ?: return Response.status(Response.Status.NOT_FOUND).entity("ERROR: Book does not exist").build()
        return Response.ok(book).build()
    }

}