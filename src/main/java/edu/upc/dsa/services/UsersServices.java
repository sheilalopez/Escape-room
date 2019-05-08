package edu.upc.dsa.services;

import edu.upc.dsa.GameManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.Path;

@Api(value="/users", description = "Service of Autentication")
@Path("/users")

public class UsersServices {

    private GameManager auth;

    public UsersServices () throws Exception {} //Connect Mysql
    @GET
    @ApiOperation(value = "get the stats of a user", notes = "get the info of a user")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "User doesn't exist")
    })


}
