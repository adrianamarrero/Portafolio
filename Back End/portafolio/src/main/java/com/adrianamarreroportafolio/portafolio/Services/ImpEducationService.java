package com.adrianamarreroportafolio.portafolio.Services;

import com.adrianamarreroportafolio.portafolio.Interface.IEducationService;
import com.adrianamarreroportafolio.portafolio.Model.Education;
import com.adrianamarreroportafolio.portafolio.Repository.IEducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ImpEducationService implements IEducationService {

    private final IEducationRepository iEducationRepository;

    @Autowired
    public ImpEducationService(IEducationRepository iEducationRepository) {
        this.iEducationRepository = iEducationRepository;
    }

    @Override
    public List<Education> getEducation() {
        List<Education> educationList = iEducationRepository.findAll();
        return educationList;
    }

    @Override
    public void saveEducation(Education education) {
        iEducationRepository.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        iEducationRepository.deleteById(id);
    }

    @Override
    public Education findEducation(Long id) {
        Education education = iEducationRepository.findById(id).orElse(null);
        return education;
    }
}
