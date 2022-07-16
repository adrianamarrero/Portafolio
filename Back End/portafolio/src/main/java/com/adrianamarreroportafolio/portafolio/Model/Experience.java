
package com.adrianamarreroportafolio.portafolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experience {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idExperience;
   private String titleExperience;
   private String institutionExperience;
   private int dateExperience;
   private String descriptionExperience;

   public Experience() {
   }

   public Experience(Long idExperience, String titleExperience, String institutionExperience, int dateExperience, String descriptionExperience) {
      this.idExperience = idExperience;
      this.titleExperience = titleExperience;
      this.institutionExperience = institutionExperience;
      this.dateExperience = dateExperience;
      this.descriptionExperience = descriptionExperience;
   }

   public Long getIdExperience() {
      return idExperience;
   }

   public void setIdExperience(Long idExperience) {
      this.idExperience = idExperience;
   }

   public String getTitleExperience() {
      return titleExperience;
   }

   public void setTitleExperience(String titleExperience) {
      this.titleExperience = titleExperience;
   }

   public String getInstitutionExperience() {
      return institutionExperience;
   }

   public void setInstitutionExperience(String institutionExperience) {
      this.institutionExperience = institutionExperience;
   }

   public int getDateExperience() {
      return dateExperience;
   }

   public void setDateExperience(int dateExperience) {
      this.dateExperience = dateExperience;
   }

   public String getDescriptionExperience() {
      return descriptionExperience;
   }

   public void setDescriptionExperience(String descriptionExperience) {
      this.descriptionExperience = descriptionExperience;
   }
}
