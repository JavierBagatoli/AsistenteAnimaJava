package Logica;

/**
 *
 * @author Javier Bagatoli
 * fecha 12/04/202
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
    
    private void aumentarVida(Integer aumentoDeVida){
        int NuevaVida = vidaMaxima + aumentoDeVida;
        vidaMaxima = (A) Integer.valueOf(NuevaVida);
    }
    
    public void comprobarYcurar(B curarVida){
        if(faltaVida()){
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
        int vidaDaniada = vidaActual - danio;
        vidaActual = (B) Integer.valueOf(vidaDaniada);
    }
    
    public String mostrarDatosVida(){
        return "Vida Maxima: " + vidaMaxima.intValue() + " Vida Actual: " + vidaActual.intValue();
    }
}
