package i5.las2peer.services.test;


import java.net.HttpURLConnection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;

import i5.las2peer.api.Service;
import i5.las2peer.api.Context;
import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.json.simple.*;
 

/**
 *
 * Testservice2
 *
 * This microservice was generated by the CAE (Community Application Editor). If you edit it, please
 * make sure to keep the general structure of the file and only add the body of the methods provided
 * in this main file. Private methods are also allowed, but any "deeper" functionality should be
 * outsourced to (imported) classes.
 *
 */
@ServicePath("http://localhost:8080")
public class Test extends RESTService {





  public Test() {
	super();
    // read and set properties values
    setFieldValues();

  }

  @Override
  public void initResources() {
	getResourceConfig().register(RootResource.class);
  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // REST methods
  // //////////////////////////////////////////////////////////////////////////////////////

  @Api
  @SwaggerDefinition(
      info = @Info(title = "Testservice2", version = "1.0",
          description = "A las2peer microservice generated by the CAE.",
          termsOfService = "none",
          contact = @Contact(name = "fsdfsd", email = "CAEAddress@gmail.com") ,
          license = @License(name = "BSD",
              url = "https://github.com/CAE-Community-Application-Editor/microservice-Testservice2/blob/master/LICENSE.txt") ) )
  @Path("/")
  public static class RootResource {

    private final Test service = (Test) Context.getCurrent().getService();

      /**
   * 
   * rdfsfsdf
   * 
   *
   * 
   * @return Response  
   * 
   */
  @GET
  @Path("//fsdf")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "fsdf")
  })
  @ApiOperation(value = "rdfsfsdf", notes = " ")
  public Response rdfsfsdf() {

    // fsdf
    boolean fsdf_condition = true;
    if(fsdf_condition) {
      JSONObject sdf = new JSONObject();
      return Response.status(HttpURLConnection.HTTP_OK).entity(sdf.toJSONString()).build();
    }
    return null;
  }



  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // Service methods (for inter service calls)
  // //////////////////////////////////////////////////////////////////////////////////////
  
  

}
