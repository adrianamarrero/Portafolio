package com.adrianamarreroportafolio.portafolio.Interface;

import com.adrianamarreroportafolio.portafolio.Model.Education;
import java.util.List;

public interface IEducationService {

    public List<Education> getEducation();

    public void saveEducation(Education education);

    public void deleteEducation(Long id);

    public Education findEducation(Long id);
}
