package com.adrianamarreroportafolio.portafolio.Services;

import com.adrianamarreroportafolio.portafolio.Interface.ISkillsService;
import com.adrianamarreroportafolio.portafolio.Model.Projects;
import com.adrianamarreroportafolio.portafolio.Model.Skills;
import com.adrianamarreroportafolio.portafolio.Repository.ISkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImpSkillsService implements ISkillsService {

    private final ISkillsRepository iSkillsRepository;

    @Autowired
    public ImpSkillsService(ISkillsRepository iSkillsRepository) {
        this.iSkillsRepository = iSkillsRepository;
    }


    @Override
    public List<Skills> getSkill() {
        List<Skills> skillsList = iSkillsRepository.findAll();
        return skillsList;
    }

    @Override
    public void saveSkill(Skills skills) {
        iSkillsRepository.save(skills);
    }

    @Override
    public void deleteSkills(Long id) {
        iSkillsRepository.deleteById(id);
    }

    @Override
    public Skills findSkill(Long id) {
        Skills skills = iSkillsRepository.findById(id).orElse(null);
        return skills;
    }
}
