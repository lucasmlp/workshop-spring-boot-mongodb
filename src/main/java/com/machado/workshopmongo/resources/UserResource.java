package com.machado.workshopmongo.resources;

import com.machado.workshopmongo.domain.User;
import com.machado.workshopmongo.dto.UserDTO;
import com.machado.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/userList")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAll(){
        List<User> userList = userService.getAll();
        List<UserDTO> userDTOList = userList.stream().map(u -> new UserDTO(u)).collect(Collectors.toList());
        return ResponseEntity.ok().body(userDTOList);
    }
}
