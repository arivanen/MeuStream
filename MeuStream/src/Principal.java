import br.com.alura.MeuStream.calculos.CalculadoraDeTempo;
import br.com.alura.MeuStream.calculos.FiltroRecomendacao;
import br.com.alura.MeuStream.modelos.Episodio;
import br.com.alura.MeuStream.modelos.Filme;
import br.com.alura.MeuStream.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme= new Filme();
        meuFilme.setNome("Evil Dead");
        meuFilme.setAnoDeLancamento(2013);
        meuFilme.setDuracaoEmMinutos(90);

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        //meuFilme.exibeFichaTecnica();

        //Criar uma série
        Serie theOffice= new Serie();
        theOffice.setNome("The Office");
        theOffice.setAnoDeLancamento(2005);
        theOffice.setTemporadas(9);
        theOffice.setEpisodiosPorTemporada(22);
        theOffice.setMinutosPorEpisodio(23);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(theOffice);
        System.out.println(calculadora.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theOffice);
        episodio.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(episodio);


    }
}
