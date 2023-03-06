package org.renatofreire.poc_payara.Services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.renatofreire.poc_payara.Models.UserModel;
import org.renatofreire.poc_payara.Repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class UserService {

    @Inject
    private UserRepository userRepository;

    public List<UserModel> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public UserModel addUser(UserModel user){
        return userRepository.addUser(user);
    }

    public UserModel deleteUser(String userName){
        Optional<UserModel> user = userRepository.getAllUsers()
                .stream()
                .filter(u -> u.getName().equals(userName))
                .findFirst();

        if(user.isPresent())
            return userRepository.deleteUser(user.get());
        else
            return new UserModel();
    }
}
