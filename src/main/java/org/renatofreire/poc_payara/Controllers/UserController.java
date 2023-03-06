package org.renatofreire.poc_payara.Controllers;

import jakarta.inject.Inject;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.renatofreire.poc_payara.Models.UserModel;
import org.renatofreire.poc_payara.Services.UserService;

import java.util.List;

@Path("/users")
public class UserController {

    @Inject
    private UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserModel> getUsers(){
        return userService.getAllUsers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public UserModel addUser(@NotNull UserModel user){
        return userService.addUser(user);
    }

    @Path("/{userName}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public UserModel deleteUser(@PathParam("userName") String userName){
        return userService.deleteUser(userName);
    }
}
