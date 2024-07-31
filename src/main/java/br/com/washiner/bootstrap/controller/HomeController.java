package br.com.washiner.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String login(Model model){
        model.addAttribute("keyLogin", "Bem vindo a tela de login");
        return "form";
        
    }
    
}
