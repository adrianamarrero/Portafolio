package com.adrianamarreroportafolio.portafolio.Interface;

import com.adrianamarreroportafolio.portafolio.Model.User;
import java.util.List;


public interface IUserService {
    
    //traer una lista de usuarios
    public List<User> getUser();
    
    
    //guardar un usuario
    public void saveUser(User usuario);
    
    //eliminar un usuario buscandolo por ID
    public void deleteUser(Long id);
    
    //buscar un usuario por ID
    public User findUser(Long id); 
}
