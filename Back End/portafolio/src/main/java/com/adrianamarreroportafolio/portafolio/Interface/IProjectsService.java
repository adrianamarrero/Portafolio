package com.adrianamarreroportafolio.portafolio.Interface;

import com.adrianamarreroportafolio.portafolio.Model.Projects;
import java.util.List;

public interface IProjectsService {

    public List<Projects> getProject();

    public void saveProject(Projects projects);

    public void deleteProject(Long id);

    public Projects findProject(Long id);
}
