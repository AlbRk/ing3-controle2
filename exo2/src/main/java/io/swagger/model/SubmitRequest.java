package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Emprunt;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubmitRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T11:43:32.706Z")

public class SubmitRequest   {
  @JsonProperty("Emprunt")
  private Emprunt emprunt = null;

  public SubmitRequest emprunt(Emprunt emprunt) {
    this.emprunt = emprunt;
    return this;
  }

   /**
   * Get emprunt
   * @return emprunt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Emprunt getEmprunt() {
    return emprunt;
  }

  public void setEmprunt(Emprunt emprunt) {
    this.emprunt = emprunt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitRequest submitRequest = (SubmitRequest) o;
    return Objects.equals(this.emprunt, submitRequest.emprunt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emprunt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitRequest {\n");
    
    sb.append("    emprunt: ").append(toIndentedString(emprunt)).append("\n");
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

