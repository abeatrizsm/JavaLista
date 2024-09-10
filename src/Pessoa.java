public class Pessoa {
    String nome;
    Short anoDeNascimento;
    float peso;
    float altura;

    public double imc(){
        double imc = peso / Math.pow(altura, 2);
        return imc;
    }

    public byte idade(){
        byte idade = (byte)(2024 - anoDeNascimento);
        return idade;
    }

    public float agua(){
        float agua = (float)(peso*35/1000);
        return agua;
    }

    public void mostra(){
        System.out.println(nome + ", você tem " + idade() + " anos, seu imc é " + String.format("%.2f", imc()) + " e você precisa beber " + agua() + "L de agua por dia.");
    }



}
