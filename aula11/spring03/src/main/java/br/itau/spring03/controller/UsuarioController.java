package br.itau.spring03.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring03.dto.UsuarioDTO;
import br.itau.spring03.model.Usuario;
import br.itau.spring03.repository.UsuarioRepo;

@RestController // indica que esta classe é um controller REST
@CrossOrigin("*") // aceita requisições de outros domínios
@RequestMapping("/user") // nome do recurso
public class UsuarioController {
    
    @Autowired
    private UsuarioRepo repo;

    @GetMapping("/{codigo}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable long codigo){
        Usuario usuario = repo.findById(codigo).orElse(null);

        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/email")
    public ResponseEntity<UsuarioDTO> buscaPorEmail(@RequestBody Usuario usuario){
        Usuario usuarioEncontrado = repo.findByEmail(usuario.getEmail());

        if(usuarioEncontrado != null){
            //usuarioEncontrado.setSenha("**********");
            UsuarioDTO user = new UsuarioDTO(usuarioEncontrado);
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/login")
    public ResponseEntity<UsuarioDTO> buscaPorLogin(@RequestBody Usuario usuario){
        Usuario loginEncontrado = repo.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
       

        if(loginEncontrado != null){
            //usuarioEncontrado.setSenha("**********");
            UsuarioDTO user = new UsuarioDTO(loginEncontrado);
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }
        
    @GetMapping("/todos")
    public List<Usuario> listarPorNome(){
        
       return repo.findAllByOrderByNome();
    }

    @GetMapping("/todos2")
    public List<UsuarioDTO> listarPorNome2(){
        List<Usuario> listaUsuarios = repo.findAllByOrderByNome();
        List<UsuarioDTO> listaDTO = new ArrayList<>();

        for(Usuario usuario : listaUsuarios){
            listaDTO.add(new UsuarioDTO(usuario));
        }

        return listaDTO;
    }


    @GetMapping("codigo/{codigo}")
    public ResponseEntity<Object> buscarUsuario2(@PathVariable long codigo){
        Object usuario = repo.buscarUsuario(codigo);

        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.notFound().build();
    }

        
    }

