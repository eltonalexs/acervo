package br.com.biblioteca.acervo.repository;

import br.com.biblioteca.acervo.entity.Publicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PublicacaoRepository extends JpaRepository<Publicacao, Long> {

    Optional<Publicacao> findByIsbn(Long isbn);

    void deleteByIsbn(Long isbn);
}
