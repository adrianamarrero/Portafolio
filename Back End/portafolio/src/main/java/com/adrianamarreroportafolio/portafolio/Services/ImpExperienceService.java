package com.adrianamarreroportafolio.portafolio.Services;


import com.adrianamarreroportafolio.portafolio.Interface.IExperienceService;
import com.adrianamarreroportafolio.portafolio.Model.Experience;
import com.adrianamarreroportafolio.portafolio.Repository.IExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImpExperienceService implements IExperienceService {

    private final IExperienceRepository iExperienceRepository;

    @Autowired
    public ImpExperienceService(IExperienceRepository iExperienceRepository) {
        this.iExperienceRepository = iExperienceRepository;
    }

    @Override
    public List<Experience> getExperience() {
        List<Experience> experienceList = iExperienceRepository.findAll();
        return experienceList;
    }

    @Override
    public void saveExperience(Experience experience) {
        iExperienceRepository.save(experience);

    }

    @Override
    public void deleteExperience(Long id) {
        iExperienceRepository.deleteById(id);

    }

    @Override
    public Experience findExperience(Long id) {
        Experience experience = iExperienceRepository.findById(id).orElse(null);
        return experience;
    }
}
