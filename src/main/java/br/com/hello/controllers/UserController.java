package br.com.hello.controllers;

import br.com.hello.models.User;
import br.com.hello.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView findAll(ModelMap model) {
        model.put("users", repository.findAll());
        return new ModelAndView("users/index", model);
    }

    @RequestMapping(method = RequestMethod.POST)
    private User createUser(@RequestBody User user) {
        return repository.save(user);
     }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    private ModelAndView findOne(@PathVariable Long userId, ModelMap model) {
        model.put("user", repository.findOne(userId));
        return new ModelAndView("/users/show", model);
    }

}
