package edu.upc.dsa.services;
import edu.upc.dsa.*;
import edu.upc.dsa.models.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@Api(value="/auth", description = "Service of User")
@Path("/auth")
public class Authentication {

    @POST
    @ApiOperation(value = "load the Profile", notes = "enter a username and password to login")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = User.class, responseContainer = "User"),
            @ApiResponse(code = 404, message = "User doesn't exist"),
            @ApiResponse(code = 402, message = "User is already conected in other device")
    })
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response logIn(User user) {
        String username = user.getUsername();
        String password = user.getPassword();

        //falta el login
    }

    @POST
    @ApiOperation(value = "create new Profile", notes = "enter a username and password to create a new account")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = void.class, responseContainer = "Void class"),
            @ApiResponse(code = 402, message = "Username already exists")
    })
    @Path("/sign-up")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response signUp(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        //falta "darse de alta"
    }






}



