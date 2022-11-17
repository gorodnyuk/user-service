package uk.gorodny.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.gorodny.userservice.dto.User;
import uk.gorodny.userservice.service.UserService;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{name}/{age}")
    public ResponseEntity<User> getUser(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        return ResponseEntity.ok(userService.getUser(name, age));
    }
}
