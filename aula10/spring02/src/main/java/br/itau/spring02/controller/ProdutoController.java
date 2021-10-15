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

@RestController //indica que essa classe é um controller REST
@CrossOrigin("*") //aceita requisicoes de outros dominios - pode vir de outros varios servidores
@RequestMapping("/produto") //nome do recurso
public class ProdutoController {

    @Autowired //implememta a interface, os metodos e disponibiliza para o objeto
    private ProdutoRepo repo; 
    
    @GetMapping("/{codigo}")//aciono o metodo --> Esse codigo vai ser trasmitido para o parametro do metodo
    public ResponseEntity<Produto> buscarProduto(@PathVariable long codigo){ //uso ResponseEntity pois alem de devolver dados quero devolver codigos http
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
