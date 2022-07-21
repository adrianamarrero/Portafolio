package com.adrianamarreroportafolio.portafolio.Repository;

import com.adrianamarreroportafolio.portafolio.Model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienceRepository extends JpaRepository <Experience, Long> {
}
