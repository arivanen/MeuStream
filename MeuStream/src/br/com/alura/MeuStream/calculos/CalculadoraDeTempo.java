package br.com.alura.MeuStream.calculos;

import br.com.alura.MeuStream.modelos.Filme;
import br.com.alura.MeuStream.modelos.Serie;
import br.com.alura.MeuStream.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {return tempoTotal;}

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
