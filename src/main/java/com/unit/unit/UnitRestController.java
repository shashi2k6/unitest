package com.unit.unit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitRestController {

    @Autowired
    private UnitService unitService;

    @GetMapping("/test")
    public String getMessage(){
        return "test";
    }
}
