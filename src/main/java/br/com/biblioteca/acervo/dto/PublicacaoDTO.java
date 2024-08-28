package br.com.biblioteca.acervo.dto;

import br.com.biblioteca.acervo.entity.Publicacao;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class PublicacaoDTO {

    private Long isbn;
    private String titulo;
    private String edicao;
    private String autor;

    public PublicacaoDTO(Publicacao publicacao){
        isbn = publicacao.getIsbn();
        titulo = publicacao.getTitulo();
        edicao = publicacao.getEdicao();
        autor = publicacao.getAutor();
    }

    public static List<PublicacaoDTO> converter(List<Publicacao> publicacoes){
        return publicacoes.stream().map(PublicacaoDTO::new).collect(Collectors.toList());
    }
}
