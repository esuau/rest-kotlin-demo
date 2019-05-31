package io.esuau.rest

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
open class BookResourceTest {

    @Test
    fun testBooksEndpoint() {
        given()
          .`when`().get("/books")
          .then()
             .statusCode(200)
             .body("$.size()", `is`(2))
    }

    @Test
    fun testBookByIdEndpoint() {
        given()
          .`when`().get("/books/1")
          .then()
            .statusCode(200)
            .body("id", `is`(1),
                  "title", `is`("Clean Architecture: A Craftsman's Guide to Software Structure and Design"))
    }

}