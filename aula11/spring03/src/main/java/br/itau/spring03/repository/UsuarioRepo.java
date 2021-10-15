package br.itau.spring03.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.itau.spring03.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Long>{
    public Usuario findByEmail(String email);
    public Usuario findByEmailAndSenha(String email, String senha);
    
    public List<Usuario> findAllByOrderByNome();


    public Page<Usuario> findAll(Pageable pageable);

    @Query(value = "select * from tb_usuario where cod = ?", nativeQuery = true)
    public Object buscarUsuario(long codigo);

    @Query(value = "select user from Usuario user where cod = ?1")
    public Usuario buscarUsuarioModelo(long codigo);
}
