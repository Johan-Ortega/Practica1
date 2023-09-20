
public class Practica1 {
    
    public static void main(String[]args){
        
        Calculadora c;
        c = new Calculadora();
        
        int r = c.suma(10, 10);
        
        System.out.println("El resultado es: "+ r);
        
        Mensaje m;
        m = new Saludo();
        m.imprimir();
        
        m = new Despedida();
        m.imprimir();
        
    }
}
