package com.api.crud_backend.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.crud_backend.models.UserModels;
import com.api.crud_backend.repositories.IUserRepository;

@Service
public class UserService {

        @Autowired
        IUserRepository userRepository;

        public Page<UserModels> getUserPage(Pageable pageable) {
            return userRepository.findAll(pageable);
        }

        public ArrayList<UserModels> getUsers(){
            return (ArrayList<UserModels>) userRepository.findAll();
        }

        public UserModels saveUser(UserModels user){
         return userRepository.save(user);
        }

        public Optional<UserModels> getById(Long id){
            return userRepository.findById(id);
        }

        public UserModels updateById(UserModels request, Long id){
            UserModels user = userRepository.findById(id).get();

            user.setNombre(request.getNombre());
            user.setApellido(request.getApellido());
            user.setCorreo(request.getCorreo());

            return userRepository.save(user);
        }

        public Boolean deleteUSer (Long id){
            try{
                userRepository.deleteById(id);
                return true;
            }catch(Exception e){
                return false;
            }
              
        }



}
