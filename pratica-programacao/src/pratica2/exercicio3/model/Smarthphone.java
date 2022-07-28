package pratica2.exercicio3.model;

public class Smarthphone extends Computador{
   private String tamanhoDeTela;
   private String densidadePixels;
   private String operadora;

    public Smarthphone(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria, String tamanhoDeTela, String densidadePixels, String operadora) {
        super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
        this.tamanhoDeTela = tamanhoDeTela;
        this.densidadePixels = densidadePixels;
        this.operadora = operadora;
    }

    public void trocarOperadora(String operadora){
        this.operadora = operadora;
    }
}
