public class Data {

    protected int dia;
    protected int mes;
    protected int ano;

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
  
    
    public String toString() {
        return  dia + "/" + mes + "/" + ano;
    }

    public String datasIguais(Data data){
        if(dia == data.dia && mes == data.mes && ano == data.ano){
            return "As datas são iguais";
        }
        return "As datas não são iguais";
    }

    public String vemAntes(Data data) {
        if (ano < data.ano || (ano == data.ano && (mes < data.mes || (mes == data.mes && dia < data.dia)))) {
            return "Vem antes.";
        }
        return "Vem depois.";
    }
    


}
