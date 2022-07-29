package com.adrianamarreroportfolio.portfolio.Repository;

import com.adrianamarreroportfolio.portfolio.Model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationRepository extends JpaRepository <Education, Long> {
}