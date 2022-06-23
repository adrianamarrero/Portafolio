
package com.adrianamarreroportafolio.portafolio.Services;

import com.adrianamarreroportafolio.portafolio.Interface.IUserService;
import com.adrianamarreroportafolio.portafolio.Model.User;
import com.adrianamarreroportafolio.portafolio.Repository.IUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpUserService implements IUserService{
    @Autowired IUserRepository iUserRepository;
    
    @Override
    public List<User> getUser() {
        List<User> users = iUserRepository.findAll();
        return users;
    }

    @Override
    public void saveUser(User usuario) {
        iUserRepository.save(usuario);
    }

    @Override
    public void deleteUser(Long id) {
        iUserRepository.deleteById(id);
    }

    @Override
    public User findUser(Long id) {
        User usuario = iUserRepository.findById(id).orElse(null);
        return usuario;
    }
}
