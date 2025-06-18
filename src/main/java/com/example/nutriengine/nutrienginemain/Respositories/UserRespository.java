package com.example.nutriengine.nutrienginemain.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nutriengine.nutrienginemain.Entity.User;

public interface UserRespository extends JpaRepository<User, Long> {

}
