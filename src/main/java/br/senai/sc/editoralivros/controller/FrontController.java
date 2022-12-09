package br.senai.sc.editoralivros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/editora-livros-api")
public class FrontController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/livros")
    public String livros() {
        return "cadastro-livros";
    }

    @RequestMapping("/usuarios")
    public String cadastroLivros() {
        return "cadastro-usuarios";
    }
}