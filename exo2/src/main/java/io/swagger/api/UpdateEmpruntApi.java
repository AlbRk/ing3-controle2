/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Emprunt;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T11:43:32.706Z")

@Api(value = "updateEmprunt", description = "the updateEmprunt API")
public interface UpdateEmpruntApi {

    @ApiOperation(value = "Mettre à jour un emprunt", notes = "", response = Void.class, tags={ "Emprunt", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "rdv not found", response = Void.class),
        @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    
    @RequestMapping(value = "/updateEmprunt",
        produces = { "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateEmpruntPut(@ApiParam(value = "L'objet emprunt à mettre à jour" ,required=true )  @Valid @RequestBody Emprunt body);

}