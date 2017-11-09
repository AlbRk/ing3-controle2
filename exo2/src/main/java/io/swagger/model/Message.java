package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Message
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T11:43:32.706Z")

public class Message   {
  @JsonProperty("contenu")
  private String contenu = null;

  public Message contenu(String contenu) {
    this.contenu = contenu;
    return this;
  }

   /**
   * Message de succes
   * @return contenu
  **/
  @ApiModelProperty(example = "succes", value = "Message de succes")


  public String getContenu() {
    return contenu;
  }

  public void setContenu(String contenu) {
    this.contenu = contenu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.contenu, message.contenu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contenu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    contenu: ").append(toIndentedString(contenu)).append("\n");
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

