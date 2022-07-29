package com.adrianamarreroportfolio.portfolio.Controller;

import com.adrianamarreroportfolio.portfolio.Interface.IEducationService;
import com.adrianamarreroportfolio.portfolio.Model.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EducationController {


    @Autowired
    IEducationService ieducationService;

    @GetMapping("education/get")
    public List<Education> getEducation(){
        return ieducationService.getEducation();
    }

    @PostMapping("education/save")
    public String createEducation(@RequestBody Education education){
        ieducationService.saveEducation(education);
        return "La experiencia educativa fue añadida al portfolio";
    }

    @DeleteMapping("/education/delete/{id}")
    public String deleteEducation(@PathVariable Long id){
        ieducationService.deleteEducation(id);
        return "La experiencia educativa fue eliminada del portfolio";
    }

    @PutMapping("education/edit/{id}")
    public Education editEducation(@PathVariable Long id,
                         @RequestParam("title") String newTitle,
                         @RequestParam("institution") String newInstitution,
                         @RequestParam("date") int newDate,
                                   @RequestParam("description") String newDescription){
        Education education = ieducationService.findEducation(id);
        education.setTitleEducation(newTitle);
        education.setInstitutionEducation(newInstitution);
        education.setDateEducation(newDate);
        education.setDescriptionEducation(newDescription);

        ieducationService.saveEducation(education);
        return education;

    }
}
