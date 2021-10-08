package br.itau.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring02.model.Produto;
import br.itau.spring02.repository.ProdutoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired //implememta a interface, os metodos e disponibiliza o objeto para
    private ProdutoRepo repo;
    
    @GetMapping("/{codigo}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable long codigo){
      Produto produto = repo.findById(codigo).orElse(null);

      if(produto != null){ // achou o produto
        return ResponseEntity.ok(produto); //ok = 200 = sucesso
      }
      return ResponseEntity.notFound().build(); //notfound = 404 - não encontrado
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Produto>> listarTodos(){
        List<Produto> lista  = (List<Produto>) repo.findAll();

        return ResponseEntity.ok(lista);
    }
}
