package com.example.demo.controllerclass;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.dao.UserDaoService;
import com.example.demo.exceptionhandler.UserNotFoundExceptioncreate;
import com.example.demo.model.User;

@RestController
public class UserResources {
	@Autowired
	private UserDaoService daoService;

	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return daoService.findAll();

	}

	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id) throws UserNotFoundExceptioncreate {
		User user = daoService.findOne(id);

		if (user == null)
			throw new UserNotFoundExceptioncreate("id-" + id);

		// "all-users", SERVER_PATH + "/users"
		// retrieveAllUsers
		EntityModel<User> resource = EntityModel.of(user);

		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllUsers());

		resource.add(linkTo.withRel("all-users"));

		// HATEOAS

		return resource;

	}

	@PostMapping("/useradd")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) throws UserNotFoundExceptioncreate {
		User saveduser = daoService.save(user);
		if (user == null)
			throw new UserNotFoundExceptioncreate("idvalid user entered");
		// we will get location of created user
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(saveduser.getId())
				.toUri();
		return ResponseEntity.created(location).build();

	}

	
}
