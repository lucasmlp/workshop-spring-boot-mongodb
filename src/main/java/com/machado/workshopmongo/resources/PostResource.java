package com.machado.workshopmongo.resources;

import com.machado.workshopmongo.domain.Post;
import com.machado.workshopmongo.domain.User;
import com.machado.workshopmongo.dto.UserDTO;
import com.machado.workshopmongo.services.PostService;
import com.machado.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/post")
public class PostResource {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<Post> getById(@PathVariable String id){
        Post post = postService.getById(id);
        return ResponseEntity.ok().body(post);
    }
}
