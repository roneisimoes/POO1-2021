
package aula09on;

/**
 *
 * @author ronei
 */
public class ArCondicionado {
    private double temperatura;
    private double temperaturaMaxima = 30.0;
    private double temperaturaMinima = 17.0;
    
    
    public ArCondicionado(double temperatura){
       this.setTemperatura(temperatura);
    }
            
    public double getTemperatura(){
        return this.temperatura;
    }
    
    public void setTemperatura(double temperatura){
        if(temperatura >= temperaturaMinima && temperatura <= temperaturaMaxima){
            this.temperatura = temperatura;
        }else{
            System.out.println("Temperatura deve ser entre 17.0 e 30.0");
        }
        
    }
    
    public void subirTemperatura(){
        if(this.temperatura >= temperaturaMaxima){
            System.out.println("A temperatura já esta no máximo!!");
        }else{
            this.temperatura += 0.5;
        }
    }
    
    public void baixarTemperatura(){
        if(this.temperatura <= temperaturaMinima){
            System.out.println("A temperatura já esta no mínimo!!");
        }else{
            this.temperatura -= 0.5;
        }
    }
    
    public void status(){
        System.out.println("Temperatura = " + this.temperatura);
    }
    
    
    
    
    
    
}
