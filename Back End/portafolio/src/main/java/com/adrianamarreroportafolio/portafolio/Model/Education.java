
package com.adrianamarreroportafolio.portafolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEducation;
    private String titleEducation;
    private String institutionEducation;
    private int dateEducation;
    private String descriptionEducation;

    public Education() {
    }

    public Education(Long idEducation, String titleEducation, String institutionEducation, int dateEducation, String descriptionEducation) {
        this.idEducation = idEducation;
        this.titleEducation = titleEducation;
        this.institutionEducation = institutionEducation;
        this.dateEducation = dateEducation;
        this.descriptionEducation = descriptionEducation;
    }

    public Long getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(Long idEducation) {
        this.idEducation = idEducation;
    }

    public String getTitleEducation() {
        return titleEducation;
    }

    public void setTitleEducation(String titleEducation) {
        this.titleEducation = titleEducation;
    }

    public String getInstitutionEducation() {
        return institutionEducation;
    }

    public void setInstitutionEducation(String institutionEducation) {
        this.institutionEducation = institutionEducation;
    }

    public int getDateEducation() {
        return dateEducation;
    }

    public void setDateEducation(int dateEducation) {
        this.dateEducation = dateEducation;
    }

    public String getDescriptionEducation() {
        return descriptionEducation;
    }

    public void setDescriptionEducation(String descriptionEducation) {
        this.descriptionEducation = descriptionEducation;
    }
}
