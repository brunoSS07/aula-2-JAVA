package br.itau.spring03.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
            user.setLogin("Logado");
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
            user.setLogin("Logado");
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }
        
    @GetMapping("/todos") //1ª maneira de puxar todos os dados
    public List<Usuario> listarPorNome(){
        
       return repo.findAllByOrderByNome();
    }

    @GetMapping("/todos2") //2ª maneira de puxar todos os dados
    public List<UsuarioDTO> listarPorNome2(){
        List<Usuario> listaUsuarios = repo.findAllByOrderByNome();
        List<UsuarioDTO> listaDTO = new ArrayList<>();

        for(Usuario usuario : listaUsuarios){
            listaDTO.add(new UsuarioDTO(usuario));
        }

        return listaDTO;
    }

    @GetMapping("codigo/{codigo}") //buscar pelo codigo usando uma query sql
    public ResponseEntity<Object> buscarUsuario2(@PathVariable long codigo){
        Object usuario = repo.buscarUsuario(codigo);

        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.notFound().build();
    }


    @GetMapping({"/cod","/cod/{codigo}"}) //buscar pelo codigo usando uma query sql
    public ResponseEntity<Usuario> buscarUsuarioModelo(@PathVariable(required = false) Long codigo){
        
        if(codigo != null){
            Usuario usuario = repo.buscarUsuarioModelo(codigo);

            if(usuario != null){
                return ResponseEntity.ok(usuario);
            }
        return ResponseEntity.notFound().build();
        }
        Usuario userModelo = new Usuario();
        userModelo.setCodigo(0);
        userModelo.setNome("Nome do usuario");
        userModelo.setEmail("nome@email.com");
        userModelo.setSenha("*********");
        return ResponseEntity.ok(userModelo);
    }


    @GetMapping("/listar")
    public Page<Usuario> listarTodos(Pageable pageable){
       Page<Usuario> usuario =  repo.findAll(pageable);

       return usuario;
    }

        
    }

