package br.com.alura.MeuStream.principal;

import br.com.alura.MeuStream.calculos.CalculadoraDeTempo;
import br.com.alura.MeuStream.calculos.FiltroRecomendacao;
import br.com.alura.MeuStream.modelos.Episodio;
import br.com.alura.MeuStream.modelos.Filme;
import br.com.alura.MeuStream.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme evilDead= new Filme("Evil Dead",2013);
        evilDead.setDuracaoEmMinutos(90);

        evilDead.avalia(8);
        evilDead.avalia(9);
        evilDead.avalia(10);
        //meuFilme.exibeFichaTecnica();

        //Criar uma série
        Serie theOffice= new Serie("The Office", 2005);
        theOffice.setTemporadas(9);
        theOffice.setEpisodiosPorTemporada(22);
        theOffice.setMinutosPorEpisodio(23);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(evilDead);
        calculadora.inclui(theOffice);
        //System.out.println(calculadora.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theOffice);
        episodio.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(episodio);

        Filme scream = new Filme("Scream", 1996);
        scream.avalia(10);

        Filme halloween = new Filme("Halloween", 2018);
        halloween.avalia(6.5);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(scream);
        listaDeFilmes.add(evilDead);
        listaDeFilmes.add(halloween);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.toString());

    }
}
