package docker.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DockerApplicationController {
    
    @GetMapping("/")
    public String dockerApplication() {
        return "docker";
    }
}
