package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestContoller {

    @GetMapping("/")
    public String getTest(){
        return "Hello Jenkins";
    }

}
