package dio.my_first_api.controller;

import dio.my_first_api.handler.BusinessException;
import dio.my_first_api.model.User;
import dio.my_first_api.repository.UserRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user",produces = {"application/json"})
@Tag(name = "My first API")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    List<User> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{login}")
    List<User> getUserByLogin(@PathVariable("login") String login){
        return repository.findByLogin(login);
    }

    @DeleteMapping("/{id}")
    void deleteUserById(@PathVariable("id") Integer  id){
        repository.deleteById(id);
    }

    @PostMapping()
    User postUser(@RequestBody User user){
        return repository.save(user);
    }

    @PutMapping()
    public void putUser(@RequestBody User user){
        if(user.getLogin()==null || user.getPassword() == null){
            throw new BusinessException("Login or password is blank.");
        }
        repository.save(user);
    }
}
