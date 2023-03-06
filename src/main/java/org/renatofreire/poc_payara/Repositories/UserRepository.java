package org.renatofreire.poc_payara.Repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.renatofreire.poc_payara.Models.UserModel;

import java.util.List;

@ApplicationScoped
@Transactional
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserModel> getAllUsers(){
        return entityManager.createNamedQuery("findAllUsers", UserModel.class).getResultList();
    }

    public UserModel addUser(UserModel user){
        entityManager.persist(user);
        return user;
    }

    public UserModel deleteUser(UserModel userModel) {
        entityManager.detach(userModel);
        return userModel;
    }
}
