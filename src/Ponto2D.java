public class Ponto2D {
    private int x;
    private int y;

    public Ponto2D(int x, int y ){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void pontosIguais(Ponto2D ponto){
        if (ponto.x == x && ponto.y == y ) {
            System.out.println("Os pontos " + "(" + x + ", " + y + ")" + " e " + ponto + " são iguais." );  
        }
        else{
            System.out.println("Os pontos " + "(" + x + ", " + y + ")" + " e " + ponto + " não são iguais." );
        }
    }
    public double distancia(Ponto2D ponto){
        double distancia = Math.sqrt(Math.pow((ponto.x - x),2)+Math.pow((ponto.y - y),2));
        return distancia;
    }

}
