
package com.adrianamarreroportafolio.portafolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nameSkill;
    private int percentageSkill;
    
}
