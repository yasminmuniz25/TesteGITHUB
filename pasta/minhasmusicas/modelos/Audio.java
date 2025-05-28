package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totReproducoes;
    private int totCurtidas;
    private int classificacao;


    //título vai ser o único que tera getter e setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //para os outros, apenas getter


    public int getTotReproducoes() {
        return totReproducoes;
    }

    public int getTotCurtidas() {
        return totCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totCurtidas++;
    }

    public void reproduz(){
        this.totReproducoes++;
    }


}
