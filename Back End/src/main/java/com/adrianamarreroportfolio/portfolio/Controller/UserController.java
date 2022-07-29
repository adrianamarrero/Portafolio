package com.adrianamarreroportfolio.portfolio.Controller;

import com.adrianamarreroportfolio.portfolio.Interface.IUserService;
import com.adrianamarreroportfolio.portfolio.Model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired IUserService iuserService;

    @GetMapping("users/get")
    public List<User> getUser(){
        return iuserService.getUser();
    }

    @PostMapping ("users/save")
    public String createUser(@RequestBody User user){
        iuserService.saveUser(user);
        return "El nuevo usuario fue añadido a la base de datos.";
    }

    @DeleteMapping ("/users/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        iuserService.deleteUser(id);
        return "El usuario fue eliminado de la base de datos";
    }

    @PutMapping("users/edit/{id}")
    public User editUser(@PathVariable Long id,
                         @RequestParam("name") String newName,
                         @RequestParam("lastName") String newLastName,
                         @RequestParam("profilePic") String newProfilePic){
        User usuario = iuserService.findUser(id);
        usuario.setName(newName);
        usuario.setLastName(newLastName);
        usuario.setProfilePic(newProfilePic);

        iuserService.saveUser(usuario);
        return usuario;

    }
}