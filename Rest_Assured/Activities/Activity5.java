package Activities;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import static org.hamcrest.CoreMatchers.equalTo;
import static io.restassured.RestAssured.given;

//@ExtendWith(PactConsumerTestExt.class)
public class Activity5 {
	DslPart reqResBody = new PactDslJsonBody()
		    .numberType("id", 123)
		    .stringType("firstName", "Saahil")
		    .stringType("lastName", "Sharma")
		    .stringType("email", "saahil@example.com");
    // Create the contract(Pact)
    @Pact(consumer = "UserConsumer", provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder) {        
        return builder.given("POSTRequest")
            .uponReceiving("A request to add data")
                .method("POST")
                .path("/api/path")
                .body(reqResBody)
            .willRespondWith()
                .status(200)
                .body(reqResBody)
            .toPact();
    }

    // Consumer test with mock provider
    @Test
    @PactTestFor(providerName = "TestProvider", port = "9000")
    public void postRequestTest() {
        // Create a request body
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", 123);
        reqBody.put("firstName", "Taro");
        reqBody.put("lastName", "Sakamoto");
        reqBody.put("email", "sakamotodays@example.com");

        // Send request, get response, assert response
        given()
            .baseUri("http://localhost:9000/api/path")
            .body(reqBody)
            .log().all()
        .when()
            .post()
        .then()
            .statusCode(200)
            .body("lastName", equalTo("Sakamoto")).log().all();
    }
}