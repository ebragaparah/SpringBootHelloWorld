package br.com.hello.controllers;

import br.com.hello.models.User;
import br.com.hello.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable findAll() {
        return repository.findAll();
    }

     @RequestMapping(method = RequestMethod.POST)
     private User createUser(@RequestBody User user) {
        return repository.save(user);
     }

     @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
     private User findOne(@PathVariable Long userId) {
       return repository.findOne(userId);
     }

}
