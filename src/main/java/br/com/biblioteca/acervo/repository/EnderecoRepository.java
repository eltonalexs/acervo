package br.com.biblioteca.acervo.repository;

import br.com.biblioteca.acervo.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    // Métodos de consulta personalizados podem ser adicionados aqui, se necessário

    // Exemplo: encontrar um endereço por cidade
    // List<Endereco> findByCidade(String cidade);
}
