package br.itau.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.spring02.model.Produto;

// CRUD
public interface ProdutoRepo extends CrudRepository<Produto, Long>{
    
}
