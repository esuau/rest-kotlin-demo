package io.esuau.rest

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
open class BookResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/books")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

}