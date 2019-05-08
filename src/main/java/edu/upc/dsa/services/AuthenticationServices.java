package edu.upc.dsa.services;

import edu.upc.dsa.GameManager;
import edu.upc.dsa.models.UserTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api(value = "/auth")
@Path("/auth")
public class AuthenticationServices {

    private GameManager auth;

    public AuthenticationServices() throws Exception {} //Connect Mysql

    @POST
    @ApiOperation(value = "register user")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful")
    })
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response register(UserTO user) {
        this.auth.register(user);
        return Response.status(201).build();
    }

    @POST
    @ApiOperation(value = "login user")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful")
    })
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(UserTO user) {
        this.auth.login(user);
        return Response.status(201).build();
    }

}
