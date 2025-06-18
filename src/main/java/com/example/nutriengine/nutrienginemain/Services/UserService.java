package com.example.nutriengine.nutrienginemain.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.nutriengine.nutrienginemain.Entity.User;
import com.example.nutriengine.nutrienginemain.Respositories.UserRespository;

@Component
public class UserService {

    @Autowired
    private UserRespository UserRespository;

    public String generateHashPassword(){
        String hashPassword="";
       return hashPassword ;
    }

    public void generateUuid(){

    }

    // BMR(Basal Metabolic Rate)
    public void calculateBMR(){

    }

    // Total Daily Energy Expenditure
    public void calculateTDEE(){

    }

    public void calculateRequiredEnergy(){

    }

    public List<User> getAllUsers(){
       return UserRespository.findAll();
    }

    public User saveUser(User user){
        return UserRespository.save(user);
    }

}
