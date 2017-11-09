package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Livre
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T11:43:32.706Z")

public class Livre   {
  @JsonProperty("titre")
  private String titre = null;

  @JsonProperty("categorie")
  private String categorie = null;

  @JsonProperty("neuf")
  private Boolean neuf = null;

  public Livre titre(String titre) {
    this.titre = titre;
    return this;
  }

   /**
   * Get titre
   * @return titre
  **/
  @ApiModelProperty(example = "le java pour les nuls", required = true, value = "")
  @NotNull


  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public Livre categorie(String categorie) {
    this.categorie = categorie;
    return this;
  }

   /**
   * Get categorie
   * @return categorie
  **/
  @ApiModelProperty(example = "action", required = true, value = "")
  @NotNull


  public String getCategorie() {
    return categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public Livre neuf(Boolean neuf) {
    this.neuf = neuf;
    return this;
  }

   /**
   * Get neuf
   * @return neuf
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  @NotNull


  public Boolean getNeuf() {
    return neuf;
  }

  public void setNeuf(Boolean neuf) {
    this.neuf = neuf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Livre livre = (Livre) o;
    return Objects.equals(this.titre, livre.titre) &&
        Objects.equals(this.categorie, livre.categorie) &&
        Objects.equals(this.neuf, livre.neuf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titre, categorie, neuf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Livre {\n");
    
    sb.append("    titre: ").append(toIndentedString(titre)).append("\n");
    sb.append("    categorie: ").append(toIndentedString(categorie)).append("\n");
    sb.append("    neuf: ").append(toIndentedString(neuf)).append("\n");
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

