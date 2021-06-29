package apiTests;

import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class User {
       String uri = "https://petstore.swagger.io/v2/user";
       int userId = 2110;
       String username = "darthvader";
       String password = "123456";
       String token = "";

        // Padrão
        // Given = Dado
        // .When = Quando
        // .Then = Então

        // Funções de Apoio
        public String lerJson(String caminhoJson) throws IOException {
            return new String(Files.readAllBytes(Paths.get(caminhoJson)));

        }

        @Test
        public void incluirUsuario() throws IOException {
             String jsonBody = lerJson("src/test/resources/data/user.json");

             given()
                     .contentType("application/json")
                     .log().all()
                     .body(jsonBody)
             .when()
                     .post(uri)
             .then()
                    .log().all()
                    .statusCode(200)
                    .body("code", is(200))
                    .body("type", is("unknown"))
                    .body("message", is(Integer.toString(userId)))
             ;

        }

        @Test
        public void consultarUsuario() {

            given()
                    .contentType("application/json")
                    .log().all()
            .when()
                    .get(uri + "/" + username)
            .then()
                    .log().all()
                    .statusCode(200)
                    .body("id", is(userId))
                    .body("username", is(username))
                    .body("firstName", is("Darth"))
                    .body("lastName", is("Vader"))
                    .body("email", is("darthvader@test.com"))
                    .body("password", is("123456"))
                    .body("phone", is("55998895090"))
                    .body("userStatus", is(0))
            ;

        }

        @Test
        public void login() {

        String mensagem =
        given()
                .contentType("application/json")
                .log().all()
        .when()
                .get(uri + "/login?username="+ username + "&password=" + password)
        .then()
                .log().all()
                .statusCode(200)
                .body("code", is(200))
                .body("type", is("unknown"))
        .extract()
                .path("message")
        ;

            System.out.println("A mesangem é :" + mensagem);
            token = mensagem.substring(23);
            System.out.println("O token é :" + token);



        }
}