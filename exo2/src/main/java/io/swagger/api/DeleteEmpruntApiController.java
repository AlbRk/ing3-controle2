package io.swagger.api;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T11:43:32.706Z")

@Controller
public class DeleteEmpruntApiController implements DeleteEmpruntApi {



    public ResponseEntity<Void> deleteEmpruntIdEmpruntDelete(@ApiParam(value = "ID du emprunt à supprimer",required=true ) @PathVariable("idEmprunt") Integer idEmprunt) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
