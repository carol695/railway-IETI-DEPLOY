package edu.escuelaing.ieti.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String getStatus(){
        return "Carol Tatiana Cely";
    }
}
