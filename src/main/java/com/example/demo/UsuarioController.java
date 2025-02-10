package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController //indicar que a classe vai lidar com requisições HTTP
public class usuarioController {

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
        us1 = usRecebido;
        return "Usuário recebido com sucesso!";
    }

}
