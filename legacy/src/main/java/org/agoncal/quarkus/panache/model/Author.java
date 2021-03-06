package org.agoncal.quarkus.panache.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@Entity
public class Author extends Artist {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Column(length = 5000)
  @Size(max = 5000)
  private String bio;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Author() {
  }

  public Author(String firstName, String lastName, String bio) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.bio = bio;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }
}
