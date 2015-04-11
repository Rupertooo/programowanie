
package zadanie1;

public class Kwadratowe {
    
    private double a,b,c;
    
    public Kwadratowe(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void setParamets(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getX1(){
        double del = delta();
        if (del >= 0){ 
        return ((b*(-1))-Math.sqrt(del))/2*a;
        } else return Double.NaN;
    }
    
    public double getX2(){
        double del = delta();
        if (del >= 0){ 
        return (-b+Math.sqrt(del))/2*a;
        } else return Double.NaN;
    }
    
    private double delta(){
        
        return Math.pow(b, 2)-(4*a*c);
    }
    
}
