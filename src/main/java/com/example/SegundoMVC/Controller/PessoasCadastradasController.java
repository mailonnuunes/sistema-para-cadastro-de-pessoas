package com.example.SegundoMVC.Controller;


import com.example.SegundoMVC.Model.Usuario;
import com.example.SegundoMVC.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/PessoasCadastradas")
public class PessoasCadastradasController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public String listaUsuarios( Model model){
        List<Usuario> listaUsuarios = usuarioRepository.findAll();
        if(listaUsuarios != null){
            model.addAttribute("usuarios", listaUsuarios);
        }
        return "PessoasCadastradas";
    }
}
