
package com.adrianamarreroportafolio.portafolio.Controller;

import com.adrianamarreroportafolio.portafolio.Interface.IUserService;
import com.adrianamarreroportafolio.portafolio.Model.User;
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
    
    @GetMapping("personas/traer")
    public List<User> getUser(){
        return iuserService.getUser();
    }
    
    @PostMapping ("personas/crear")
    public String createUser(@RequestBody User user){
        iuserService.saveUser(user);
        return "El usuario fue creado correctamente";
    }

    @DeleteMapping ("personas/borrar/{id}")
    public String deleteUser(@PathVariable Long id){
        iuserService.deleteUser(id);
        return "El usuario fue eliminado correctamente";
    }
    
    @PutMapping("personas/editar/{id}")
    public User editUser(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("fotoperfil") String nuevaFotoperfil){
    User usuario = iuserService.findUser(id);
    usuario.setNombre(nuevoNombre);
    usuario.setApellido(nuevoApellido);
    usuario.setFotoperfil(nuevaFotoperfil);
    
    iuserService.saveUser(usuario);
    return usuario;
   
    }
}
