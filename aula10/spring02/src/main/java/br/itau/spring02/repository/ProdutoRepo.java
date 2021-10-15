package br.itau.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.spring02.model.Produto;

// CRUD - create, read, update e delete - 4 operaçõs basicas do BD
public interface ProdutoRepo extends CrudRepository<Produto, Long>{ 
    //vai ter <....> pra saber o tipo de informação que ele vai manipular
    //Produto e Long --> Long é o nome da classe do tipo da chave primaria
    
}
