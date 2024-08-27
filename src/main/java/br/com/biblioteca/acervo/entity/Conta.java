package br.com.biblioteca.acervo.entity;

import br.com.biblioteca.acervo.interfaces.Conversao;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Conta {

    private Integer id;
    private Double valor; //doação para a biblioteca
    public Double getBalanco(Conversao conversao){
        return conversao.converter(valor);
    }

}
