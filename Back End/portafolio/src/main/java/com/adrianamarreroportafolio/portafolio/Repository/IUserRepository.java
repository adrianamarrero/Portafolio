
package com.adrianamarreroportafolio.portafolio.Repository;

import com.adrianamarreroportafolio.portafolio.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
    
@Repository
public interface IUserRepository extends JpaRepository <User,Long> {
   
}
