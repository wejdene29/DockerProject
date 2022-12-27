package com.example.dockerproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin  (origins = "http://localhost:8083")
@Controller
public class UserController {

/*

@Autowired
    UserRepo ur ;
/*
    @GetMapping(path="/all")
   /* public ResponseEntity<List<User>> getAllUser() {
            List<User> users = new ArrayList<>();

                ur.findAll().forEach(u -> users.add((User) u));
        System.out.println(users);
                if (users.isEmpty()) {
                    System.out.println("empty");
                }

        return new ResponseEntity<>(users, HttpStatus.OK);
        }
/*
    @PostMapping ("/add")
    public ResponseEntity<User> createTutorial(@RequestBody User tutorial) {
        try {
            User _tutorial = (User) ur.save(new User(tutorial.getNom(), tutorial.getPrenom()));
            return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/

    @GetMapping(path="/")
    public String hello(){
        System.out.print("welcome on board !");
        return "welcome" ;
    }

}
