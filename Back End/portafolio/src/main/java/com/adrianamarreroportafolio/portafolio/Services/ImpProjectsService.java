package com.adrianamarreroportafolio.portafolio.Services;

import com.adrianamarreroportafolio.portafolio.Interface.IProjectsService;
import com.adrianamarreroportafolio.portafolio.Model.Projects;
import com.adrianamarreroportafolio.portafolio.Repository.IProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImpProjectsService implements IProjectsService {

private final IProjectsRepository iProjectsRepository;

@Autowired
public ImpProjectsService(IProjectsRepository iProjectsRepository) {
        this.iProjectsRepository = iProjectsRepository;
    }

    @Override
    public List<Projects> getProject() {
        List<Projects> projectsList = iProjectsRepository.findAll();
        return projectsList;
    }

    @Override
    public void saveProject(Projects project) {
        iProjectsRepository.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        iProjectsRepository.deleteById(id);
    }

    @Override
    public Projects findProject(Long id) {
    Projects project = iProjectsRepository.findById(id).orElse(null);
        return project;
    }
}
