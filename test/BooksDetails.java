import io.restassured.RestAssured;
import org.junit.Test;

public class BooksDetails {

    // @Test
    // public void GetBooksDetails() { 
    //     // Specify the base URL to the RESTful web service 
    //     RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
    //     // Get the RequestSpecification of the request to be sent to the server. 
    //     RequestSpecification httpRequest = RestAssured.given(); 
    //     // specify the method type (GET) and the parameters if any. 
    //     //In this case the request does not take any parameters 
    //     Response response = httpRequest.request(Method.GET, "");
    //     // Print the status and message body of the response received from the server 
    //     System.out.println("Status received => " + response.getStatusLine()); 
    //     System.out.println("Response=>" + response.prettyPrint());
            
    // }

    // public static void main(String[] args) {
      
    //         // Specify the base URL to the RESTful web service 
    //         RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
    //         // Get the RequestSpecification of the request to be sent to the server. 
    //         RequestSpecification httpRequest = RestAssured.given(); 
    //         // specify the method type (GET) and the parameters if any. 
    //         //In this case the request does not take any parameters 
    //         Response response = httpRequest.request(Method.GET, "");
    //         // Print the status and message body of the response received from the server 
    //         System.out.println("Status received => " + response.getStatusLine()); 
    //         System.out.println("Response=>" + response.prettyPrint());
                
        
    // }










    @Test

    public void testSimpleGet() {

        RestAssured.given()

                .when().get("https://jsonplaceholder.typicode.com/posts/1")

                .then()

                .statusCode(200);

    }


}
