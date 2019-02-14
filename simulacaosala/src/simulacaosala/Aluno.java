package simulacaosala;

public class Aluno extends Pessoa {
    private String interesse, duvida;
    private boolean vontade_banheiro;

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    public String getDuvida() {
        return duvida;
    }

    public void setDuvida(String duvida) {
        this.duvida = duvida;
    }

    public boolean isVontade_banheiro() {
        return vontade_banheiro;
    }

    public void setVontade_banheiro(boolean vontade_banheiro) {
        this.vontade_banheiro = vontade_banheiro;
    }

    
}
