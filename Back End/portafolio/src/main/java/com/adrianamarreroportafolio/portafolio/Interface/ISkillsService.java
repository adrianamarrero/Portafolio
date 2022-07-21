package com.adrianamarreroportafolio.portafolio.Interface;

import com.adrianamarreroportafolio.portafolio.Model.Skills;
import java.util.List;

public interface ISkillsService {

    public List<Skills> getSkill();

    public void saveSkill(Skills skills);

    public void deleteSkills(Long id);

    public Skills findSkill(Long id);
}
