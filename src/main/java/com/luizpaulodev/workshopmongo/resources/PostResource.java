package com.luizpaulodev.workshopmongo.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.luizpaulodev.workshopmongo.domain.Post;
import com.luizpaulodev.workshopmongo.domain.User;
import com.luizpaulodev.workshopmongo.dto.UserDTO;
import com.luizpaulodev.workshopmongo.repository.PostRepository;
import com.luizpaulodev.workshopmongo.services.PostService;
import com.luizpaulodev.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

	@Autowired
	private PostService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
 	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}