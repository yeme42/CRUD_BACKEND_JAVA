package com.api.crud_backend.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud_backend.models.UserModels;
import com.api.crud_backend.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

@Autowired
private UserService userService;



@CrossOrigin(origins = "http://localhost:4200")



    @GetMapping("/paged")
    public Page<UserModels>getUserPage(Pageable pageable){
        return  this.userService.getUserPage(pageable);
    }

    @GetMapping
    public ArrayList<UserModels> getUsers(){
        return this.userService.getUsers();
    }


    @PostMapping
    public UserModels saveUser(@RequestBody UserModels user){
        return this.userService.saveUser(user);
    }

    @GetMapping( path= "/{id}")
    public Optional<UserModels> getUserById(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }

    @PutMapping( path= "/{id}")
    public UserModels updateUserByID(@RequestBody UserModels request, @PathVariable("id") Long id){
        return this.userService.updateById(request, id);
    }

    @DeleteMapping( path= "/{id}")
    public ResponseEntity<ApiResponse> deleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUSer(id);

        if(ok){
              return ResponseEntity.ok(new ApiResponse("User successfully deleted."));
        }else{
            return ResponseEntity.ok(new ApiResponse("An error occurred while trying to delete user"));
        }
    }

    public static class ApiResponse {
        private String message;

        public ApiResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}

