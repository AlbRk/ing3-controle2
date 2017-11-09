package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Livre;
import io.swagger.model.Utilisateur;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Emprunt
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T11:43:32.706Z")

public class Emprunt   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("horaire")
  private DateTime horaire = null;

  @JsonProperty("livre")
  private Livre livre = null;

  @JsonProperty("participant")
  private List<Utilisateur> participant = null;

  public Emprunt date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "1994-01-13", required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Emprunt horaire(DateTime horaire) {
    this.horaire = horaire;
    return this;
  }

   /**
   * Get horaire
   * @return horaire
  **/
  @ApiModelProperty(example = "780", required = true, value = "")
  @NotNull

  @Valid

  public DateTime getHoraire() {
    return horaire;
  }

  public void setHoraire(DateTime horaire) {
    this.horaire = horaire;
  }

  public Emprunt livre(Livre livre) {
    this.livre = livre;
    return this;
  }

   /**
   * Get livre
   * @return livre
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Livre getLivre() {
    return livre;
  }

  public void setLivre(Livre livre) {
    this.livre = livre;
  }

  public Emprunt participant(List<Utilisateur> participant) {
    this.participant = participant;
    return this;
  }

  public Emprunt addParticipantItem(Utilisateur participantItem) {
    if (this.participant == null) {
      this.participant = new ArrayList<Utilisateur>();
    }
    this.participant.add(participantItem);
    return this;
  }

   /**
   * Liste des utilisateurs
   * @return participant
  **/
  @ApiModelProperty(value = "Liste des utilisateurs")

  @Valid

  public List<Utilisateur> getParticipant() {
    return participant;
  }

  public void setParticipant(List<Utilisateur> participant) {
    this.participant = participant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emprunt emprunt = (Emprunt) o;
    return Objects.equals(this.date, emprunt.date) &&
        Objects.equals(this.horaire, emprunt.horaire) &&
        Objects.equals(this.livre, emprunt.livre) &&
        Objects.equals(this.participant, emprunt.participant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, horaire, livre, participant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emprunt {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    horaire: ").append(toIndentedString(horaire)).append("\n");
    sb.append("    livre: ").append(toIndentedString(livre)).append("\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
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

