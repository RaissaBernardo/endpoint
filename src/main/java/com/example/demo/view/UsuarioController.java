package com.example.demo.view;
import com.example.demo.model.Usuario;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController //indicar que a classe vai lidar com requisições HTTP
public class UsuarioController {

    public Usuario us1;

    @GetMapping("/usuario")
    public String getUsuario(){
        if(us1 == null){
            return "Nenhum usuario cadastrado";
        } else {
            return us1.toString();
        }
    }

    @PostMapping("/usuario")
    public String postUsuario(@RequestBody Usuario usRecebido) {
        if (us1 == null) {
            return "Nenhum usuário encontrado!";
        }
        us1 = usRecebido;
        return "Usuário recebido com sucesso!";
    }

    @PutMapping("/usuario")
    public String putUsuario(@RequestBody Usuario usAtualizado) {
        if (us1 == null) {
            return "Nenhum usuário cadastrado para atualizar!";
        }
        us1 = usAtualizado;
        return "Usuário atualizado com sucesso!";
    }

    @DeleteMapping("/usuario")
    public String deletUsuario(@RequestBody Usuario usDeletado){
        if (us1 == null) {
            return "Nenhum usuário cadastrado para deletar!";
        }
        us1 = null;
        return "Usuário deletado com sucesso!";
    }
}
