package com.machado.workshopmongo.services;

import com.machado.workshopmongo.domain.Post;
import com.machado.workshopmongo.domain.User;
import com.machado.workshopmongo.dto.UserDTO;
import com.machado.workshopmongo.repositories.PostRepository;
import com.machado.workshopmongo.repositories.UserRepository;
import com.machado.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post getById(String id){
        Optional<Post> user = postRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
