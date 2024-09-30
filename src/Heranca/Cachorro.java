package Heranca;

public class Cachorro extends Animal{
    String raca;


    public String toString(){
        return "Nome: " + nome + 
               "\nPeso: " + peso + 
               "\nRaça : " + raca;
    }

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
