package io.swagger.api;

import io.swagger.model.Message;
import io.swagger.model.SubmitRequest;

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
public class CreateEmpruntApiController implements CreateEmpruntApi {



    public ResponseEntity<Message> createEmpruntPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SubmitRequest submitParam) {
        // do some magic!
        return new ResponseEntity<Message>(HttpStatus.OK);
    }

}
