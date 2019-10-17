package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
<<<<<<< HEAD

public class HelloController {
    @GetMapping("/hello")
        public String hello(@RequestParam(name = "name") String name, Model model){
            model.addAttribute("name",name);
            return "hello";
        }
=======
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
>>>>>>> a46fc15ae2e99f1085bccbdbb0dcd089b906b5c7
}
