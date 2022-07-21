package com.adrianamarreroportafolio.portafolio.Interface;

import com.adrianamarreroportafolio.portafolio.Model.User;
import java.util.List;


public interface IUserService {

    public List<User> getUser();

    public void saveUser(User usuario);

    public void deleteUser(Long id);

    public User findUser(Long id); 
}
