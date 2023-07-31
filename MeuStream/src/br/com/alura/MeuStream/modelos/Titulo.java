package br.com.alura.MeuStream.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do br.com.alura.MeuStream.modelos.Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluso no Plano? " + incluidoNoPlano);
        System.out.println("Nota média: " + mediaAvaliacao());
    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public double mediaAvaliacao(){
        return somaAvaliacao/totalDeAvaliacao;
    }

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {return duracaoEmMinutos;}

    public int getAnoDeLancamento() {return anoDeLancamento;}


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
