package org.example.hhjava245spring;

import org.springframework.web.bind.annotation.*;

//@Component IOC = Inversion of Control
@RestController
@RequestMapping("/api")
public class HelloController {

    private User user = new User("0", "Null", 0);

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/2")
    public String sayHello2() {
        return "Hello World2";
    }

    @GetMapping("/{greeting}")
    public String sayHello(@PathVariable String greeting,@RequestParam String q) {
        return greeting + " " + q;
    }

    @PostMapping
    public String setUser(@RequestBody User user) {
        this.user = user;
        return user.toString();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        this.user = null;
        return "Delete Successful";
    }
}
