package Heranca;

public class Peixe extends Animal{
    String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Peixe(String nome, double peso, String habitat) {
        super(nome, peso);
        this.habitat = habitat;
    }

    public String toString(){
        return "Nome: " + nome + 
               "\nPeso: " + peso + 
               "\nHabitat : " + habitat;
    }

}
