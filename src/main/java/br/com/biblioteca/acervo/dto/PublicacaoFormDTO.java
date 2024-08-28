package br.com.biblioteca.acervo.dto;

import br.com.biblioteca.acervo.entity.Categoria;
import br.com.biblioteca.acervo.entity.Modelo;
import br.com.biblioteca.acervo.entity.Publicacao;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PublicacaoFormDTO {

    private Long isbn;
    private String titulo;
    private String edicao;
    private String autor;
    private String categoria;
    private String modelo;

    public Publicacao converter(){
        Publicacao publicacao = new Publicacao();
        publicacao.setIsbn(isbn);
        publicacao.setAutor(autor);
        publicacao.setCategoria(Categoria.valueOf(categoria));
        publicacao.setEdicao(edicao);
        publicacao.setModelo(Modelo.valueOf(modelo));
        publicacao.setTitulo(titulo);
        return publicacao;
    }
    public void atualiza(Publicacao publicacao) {
        publicacao.setCategoria(Categoria.valueOf(categoria));
        publicacao.setModelo(Modelo.valueOf(modelo));
    }
}
