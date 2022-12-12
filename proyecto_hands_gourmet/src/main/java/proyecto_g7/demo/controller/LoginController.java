
package proyecto_g7.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Component
public class LoginController {
    
    @GetMapping("/login")
    public String index(){
     return "/login";
    }
    
}
