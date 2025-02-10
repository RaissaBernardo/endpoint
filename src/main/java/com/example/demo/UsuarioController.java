package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // lista s usuarios
    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // add usuarios
    @PostMapping("/usuarios")
    public String addUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return "Usuário adicionado!";
    }

    //atualizar um usuário
    @PutMapping("/usuarios/{cpf}")
    public String updateUsuario(@PathVariable String cpf, @RequestBody Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getCpf().equals(cpf)) {
                u.setNome(usuario.getNome());
                u.setTelefone(usuario.getTelefone());
                return "Usuário atualizado!";
            }
        }
        return "Usuário não encontrado!";
    }

    //deletar um usuário
    @DeleteMapping("/usuarios/{cpf}")
    public String deleteUsuario(@PathVariable String cpf) {
        usuarios.removeIf(u -> u.getCpf().equals(cpf));
        return "Usuário removido!";
    }
}
