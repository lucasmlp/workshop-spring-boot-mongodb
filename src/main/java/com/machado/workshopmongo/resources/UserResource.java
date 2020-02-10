package com.machado.workshopmongo.resources;

import com.machado.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/userList")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        User maria = new User("1", "Maria Brown", "maria@gmail.com");
        User alex = new User("2", "Alex Green", "alex@gmail.com");
        List<User> userList= new ArrayList<>();
        userList.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(userList);
    }
}
