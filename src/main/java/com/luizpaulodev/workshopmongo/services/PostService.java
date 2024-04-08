package com.luizpaulodev.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizpaulodev.workshopmongo.domain.Post;
import com.luizpaulodev.workshopmongo.domain.User;
import com.luizpaulodev.workshopmongo.dto.UserDTO;
import com.luizpaulodev.workshopmongo.repository.PostRepository;
import com.luizpaulodev.workshopmongo.repository.UserRepository;
import com.luizpaulodev.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}
}