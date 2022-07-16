
package com.adrianamarreroportafolio.portafolio.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProject;
    private String titleProject;
    private String institutionProject;
    private int dateProject;
    private String descriptionProject;

    public Projects() {
    }

    public Projects(Long idProject, String titleProject, String institutionProject, int dateProject, String descriptionProject) {
        this.idProject = idProject;
        this.titleProject = titleProject;
        this.institutionProject = institutionProject;
        this.dateProject = dateProject;
        this.descriptionProject = descriptionProject;
    }

    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public String getInstitutionProject() {
        return institutionProject;
    }

    public void setInstitutionProject(String institutionProject) {
        this.institutionProject = institutionProject;
    }

    public int getDateProject() {
        return dateProject;
    }

    public void setDateProject(int dateProject) {
        this.dateProject = dateProject;
    }

    public String getDescriptionProject() {
        return descriptionProject;
    }

    public void setDescriptionProject(String descriptionProject) {
        this.descriptionProject = descriptionProject;
    }
}
