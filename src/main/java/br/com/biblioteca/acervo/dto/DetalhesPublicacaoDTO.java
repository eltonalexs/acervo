package br.com.biblioteca.acervo.dto;

import br.com.biblioteca.acervo.entity.Publicacao;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DetalhesPublicacaoDTO {

    private Long isbn;
    private String titulo;
    private String edicao;
    private String autor;
    private String categoria;
    private String modelo;

    public DetalhesPublicacaoDTO(Publicacao publicacao) {
        isbn = publicacao.getIsbn();
        titulo = publicacao.getTitulo();
        edicao = publicacao.getEdicao();
        autor = publicacao.getAutor();
        categoria = publicacao.getCategoria().name();
        modelo = publicacao.getModelo().name();
    }

}
