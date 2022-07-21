package com.adrianamarreroportafolio.portafolio.Interface;

import com.adrianamarreroportafolio.portafolio.Model.Experience;
import java.util.List;

public interface IExperienceService {

    public List<Experience> getExperience();

    public void saveExperience(Experience experience);

    public void deleteExperience(Long id);

    public Experience findExperience(Long id);
}
