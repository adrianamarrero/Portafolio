package com.adrianamarreroportafolio.portafolio.Repository;

import com.adrianamarreroportafolio.portafolio.Model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepository extends JpaRepository <Skills, Long> {
}
