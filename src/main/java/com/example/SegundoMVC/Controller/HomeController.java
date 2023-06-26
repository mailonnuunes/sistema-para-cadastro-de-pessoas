package com.example.SegundoMVC.Controller;

import com.example.SegundoMVC.Model.Usuario;
import com.example.SegundoMVC.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UsuarioRepository usuarioRepository;



    @GetMapping
    public String PaginaHome( ){
        String home = "Index";
        return home;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String adicionaUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
        return "redirect:/";
    }


}
