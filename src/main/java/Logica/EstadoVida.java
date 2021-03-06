package Logica;

import static java.lang.Math.abs;

/**
 *
 * @author Javier Bagatoli
 * fecha 12/04/2022
 * @param <A>
 * @param <B>
 */
public class EstadoVida<A extends Integer, B extends Integer> {
    A vidaMaxima;
    B vidaActual;

    public EstadoVida(A vidaMaxima, B vidaActual) {
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaActual; 
    }

    public EstadoVida(A vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = (B) this.vidaMaxima;
    }
    
    public void aumentarVida(Integer aumentoDeVida){
        int NuevaVida = vidaMaxima + aumentoDeVida;
        vidaMaxima = (A) Integer.valueOf(NuevaVida);
    }
    
    public void comprobarYcurar(B curarVida){
        if(faltaVida() && curarVida > 0){
            if(curarTodaVida(curarVida)){
                vidaActual = (B) vidaMaxima;
            }else{
                int vidaAlCurar = vidaActual + curarVida;
                vidaActual = (B) Integer.valueOf(vidaAlCurar); 
            }
        }
    }
    private boolean faltaVida(){
        return vidaMaxima > vidaActual;
    }
    
    private boolean curarTodaVida(B curarVida){
        return (curarVida > vidaMaxima - vidaActual);
    }
    
    public void daniarVida(B danio){
        int vidaDaniada = vidaActual - abs(danio);
        vidaActual = (B) Integer.valueOf(vidaDaniada);
    }
    
    public String mostrarDatosVida(){
        return "Vida Maxima: " + vidaMaxima.intValue() + " Vida Actual: " + vidaActual.intValue();
    }
    
    public Integer getVida(){
        return vidaActual;
    }
}
