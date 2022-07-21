package com.adrianamarreroportafolio.portafolio.Repository;

import com.adrianamarreroportafolio.portafolio.Model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationRepository extends JpaRepository <Education, Long> {
}
