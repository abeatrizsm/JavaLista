public class Turma {
    String alunos[];
    int idade[];
    float media[];

    public Turma(String alunos[], int idade[], float media[]){
        this.alunos = alunos;
        this.idade = idade;
        this.media = media;
    }

    public String[] getAlunos() {
        return alunos;
    }

    public void setAlunos(String[] alunos) {
        this.alunos = alunos;
    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }

    public float[] getMedia() {
        return media;
    }

    public void setMedia(float[] media) {
        this.media = media;
    }

    public int idadeMaisVelho(){
        int maiorIdade = 0;
        
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
            }
        }
        return maiorIdade;
    }

    public String maisNovo(){
        int maisNovo = 0;
        int menorIdade = idade[0];

        for (int i = 0; i < idade.length; i++) {
            if (menorIdade > idade[i]) {
                maisNovo = i;
            }
        }
        return alunos[maisNovo];
    }

    public int aprovados(){
        int aprovados = 0;
        for (int i = 0; i < media.length; i++) {
            if (media[i] > 7) {
                aprovados++;
            }  
        }
        return aprovados;
    }

}
