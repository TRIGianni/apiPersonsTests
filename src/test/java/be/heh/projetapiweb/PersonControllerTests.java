package be.heh.projetapiweb;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
class PersonControllerTests {

    @LocalServerPort
    private int port;

    @Test
    void getAllPersons() {
        baseURI ="http://localhost/api";
       given().
               port(port).
       when().
                get("/persons").
       then().
                statusCode(200).
                body("persons[1].lastName",equalTo("titi1")).
                body("persons.lastName",hasItems("titi","titi1","titi2"));
    }

}
