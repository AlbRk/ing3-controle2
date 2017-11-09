package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Utilisateur
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T11:43:32.706Z")

public class Utilisateur   {
  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("prenom")
  private String prenom = null;

  @JsonProperty("email")
  private String email = null;

  public Utilisateur nom(String nom) {
    this.nom = nom;
    return this;
  }

   /**
   * Nom de l utilisateur
   * @return nom
  **/
  @ApiModelProperty(example = "ALBERCA", required = true, value = "Nom de l utilisateur")
  @NotNull


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Utilisateur prenom(String prenom) {
    this.prenom = prenom;
    return this;
  }

   /**
   * Prénom de l utilisateur
   * @return prenom
  **/
  @ApiModelProperty(example = "Romain", required = true, value = "Prénom de l utilisateur")
  @NotNull


  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Utilisateur email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "romain@alberca.fr", required = true, value = "")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Utilisateur utilisateur = (Utilisateur) o;
    return Objects.equals(this.nom, utilisateur.nom) &&
        Objects.equals(this.prenom, utilisateur.prenom) &&
        Objects.equals(this.email, utilisateur.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nom, prenom, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Utilisateur {\n");
    
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

