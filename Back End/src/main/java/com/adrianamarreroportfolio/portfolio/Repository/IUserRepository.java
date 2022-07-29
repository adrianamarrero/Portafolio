package com.adrianamarreroportfolio.portfolio.Repository;

import com.adrianamarreroportfolio.portfolio.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository <User,Long> {
}