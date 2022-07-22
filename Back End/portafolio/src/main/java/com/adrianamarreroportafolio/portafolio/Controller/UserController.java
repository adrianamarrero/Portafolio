
package com.adrianamarreroportafolio.portafolio.Controller;

import com.adrianamarreroportafolio.portafolio.Interface.IUserService;
import com.adrianamarreroportafolio.portafolio.Model.User;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UserController {
    private final IUserService iuserService;

    public UserController(IUserService iuserService) {
        this.iuserService = iuserService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<User> traerUsuario(@PathVariable("id") Long id){
        User user = iuserService.findUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


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
    usuario.setName(nuevoNombre);
    usuario.setLastName(nuevoApellido);
    usuario.setProfilePic(nuevaFotoperfil);
    
    iuserService.saveUser(usuario);
    return usuario;
   
    }
}
