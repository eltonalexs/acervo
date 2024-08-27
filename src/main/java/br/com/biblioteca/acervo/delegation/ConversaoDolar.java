package br.com.biblioteca.acervo.delegation;

import br.com.biblioteca.acervo.interfaces.Conversao;

public class ConversaoDolar implements Conversao {
    @Override
    public Double converter(Double valor) {
        return valor / 5.50;//27-08-2024
    }
}
