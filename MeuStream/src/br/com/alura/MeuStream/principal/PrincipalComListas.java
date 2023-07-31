package br.com.alura.MeuStream.principal;

import br.com.alura.MeuStream.modelos.Filme;
import br.com.alura.MeuStream.modelos.Serie;
import br.com.alura.MeuStream.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme evilDead= new Filme("Evil Dead",2013);
        evilDead.avalia(9.5);
        Filme scream = new Filme("Scream", 1996);
        scream.avalia(10);
        Filme halloween = new Filme("Halloween", 2018);
        halloween.avalia(6.5);
        Serie theOffice= new Serie("The Office", 2005);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(scream);
        lista.add(evilDead);
        lista.add(halloween);
        lista.add(theOffice);
        for (Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme) {
                Filme filme= (Filme) item;
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        /* O for each acima pode ser reescrito de duas formas:

        lista.forEach(item -> System.out.println(item)); (expressão lambda)

        - E utilizando method reference
        lista.forEach(System.out::println);
        */

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("John Carpenter");
        buscaPorArtista.add("David Lynch");

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);

    }
}
