package br.com.biblioteca.acervo.repository;

import br.com.biblioteca.acervo.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long> {

}
