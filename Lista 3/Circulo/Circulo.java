public class Circulo {
    private float x, y, r;
    private final float PI = 3.141592f;

    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.r = 0;
    }
    public Circulo(float x, float y, float r){
        if(!validaCirculo(x, y, r)){
            System.out.println("Valor invalido.");
            System.exit(-1);
        }
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public float getR(){
        return this.r;
    }

    public boolean validaCirculo(float x, float y, float r){
        if(x>0 && y>0 && r>0){
            return true;
        }else{
            return false;
        }
    }

    public void imprimeCirculo(){
        System.out.printf("X: %f\nY: %f\n R: %f\n", this.x, this.y, this.r);
    }

    public float area(){
        return (PI * this.r * this.r);
    }
    //usa para comparar um outro circulo
    public float area(float r){
        return (PI * r * r);
    }

    public float perimeter(){
        return (2 * PI * this.r);
    }

    public isBiggerThan(Circulo c){
        if(area()> area(c.getR())){
            return true;
        }
        return false;
    }

    public boolean isInnerPoint(Ponto2D p){
        double distancia = Math.sqrt((p.getX() - this.x) * (p.getX() - this.x) + (p.getY() - this.y) * (p.getY() - this.y));
        
        if(distancia<r){
            return true;
        }else{
            return false;
        }
    }
}