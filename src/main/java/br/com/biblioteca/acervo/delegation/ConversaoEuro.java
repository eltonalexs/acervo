package br.com.biblioteca.acervo.delegation;

import br.com.biblioteca.acervo.interfaces.Conversao;

public class ConversaoEuro implements Conversao {
    @Override
    public Double converter(Double valor) {
        return valor / 6.12; //27-08-2024
    }
}
