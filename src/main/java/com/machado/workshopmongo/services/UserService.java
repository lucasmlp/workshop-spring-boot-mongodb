package com.machado.workshopmongo.services;

import com.machado.workshopmongo.domain.User;
import com.machado.workshopmongo.dto.UserDTO;
import com.machado.workshopmongo.repositories.UserRepository;
import com.machado.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getById(String id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user){
        return userRepository.insert(user);
    }

    public void deleteUser(String id){
        getById(id);
        userRepository.deleteById(id);
    }

    public User updateUser(User user){
        User newUser = getById(user.getId());
        updateData(newUser, user);
        return userRepository.save(newUser);
    }

    private void updateData(User newUser, User user) {
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
    }

    public User fromDTO(UserDTO userDTO){
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
