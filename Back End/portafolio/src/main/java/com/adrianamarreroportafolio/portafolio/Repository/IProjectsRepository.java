package com.adrianamarreroportafolio.portafolio.Repository;

import com.adrianamarreroportafolio.portafolio.Model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectsRepository extends JpaRepository <Projects, Long> {
}
