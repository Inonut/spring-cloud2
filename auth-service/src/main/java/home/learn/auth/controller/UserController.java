package home.learn.auth.controller;

import home.learn.auth.domain.User;
import home.learn.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void createUser(@Valid @RequestBody User user) {
        userService.create(user);
    }

    @GetMapping
    public List<User> loadUsers() {
        return userService.loadUsers();
    }
}
