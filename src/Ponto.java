public class Ponto {
    // construtores
    public Ponto() {x=0; y=0;}
    public Ponto(int cx, int cy){
        x=cx;
        y=cy;
    }
    public Ponto(Ponto p){
        x=p.getX();
        y = p.getY();
    }
    //variaveis de instancia
    private int x;
    private int y;

    // metodos de instancia
    // interrogador devolve o x
    public int getX(){return x;}

    //interrogador devolve o y
    public int getY(){return y;}

    //modificador-incremento das coordenadas
    public void incCoord(int deltaX, int deltaY){
        x = x+deltaX;
        y =y+deltaY;
    }

    //modificador - decremento das coordenadas
    public void deccCoord(int deltaX, int deltaY){
        x -=deltaX;
        y -=deltaY;
    }

    //determina se um ponto tem ambas as coordenadas positivas
    public boolean coordPos(){
        return x>0 && y>0;
    }

    //verifica se um ponto é simetrico, ou seja, dista igualmente dos eixo dos X e dos Y
    public boolean simetrico(){
        return x==y;
    }


}
