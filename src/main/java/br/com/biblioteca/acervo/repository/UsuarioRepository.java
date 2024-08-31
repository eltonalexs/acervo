package br.com.biblioteca.acervo.repository;

import br.com.biblioteca.acervo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos de consulta personalizados podem ser adicionados aqui, se necessário

    // Exemplo: encontrar um usuário pelo nome
    // List<Usuario> findByNome(String nome);

    // Exemplo: encontrar um usuário pelo sobrenome
    // List<Usuario> findBySobrenome(String sobrenome);

    // Exemplo: encontrar um usuário por nome e sobrenome
    // Usuario findByNomeAndSobrenome(String nome, String sobrenome);
}
