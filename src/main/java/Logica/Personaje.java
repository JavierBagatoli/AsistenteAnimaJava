package Logica;

/**
 * @author JavW11trial
 */
public class Personaje {
    private EstadoVida<Integer,Integer> vida;
    private int habilidadAtaque;
    private int habilidadDefensa;
    private int[] vectorDeDefensas = new int[8];

    public EstadoVida<Integer, Integer> getVida() {
        return vida;
    }

    public int getHabilidadAtaque() {
        return habilidadAtaque;
    }

    public void setHabilidadAtaque(int habilidadAtaque) {
        this.habilidadAtaque = habilidadAtaque;
    }

    public int getHabilidadDefensa() {
        return habilidadDefensa;
    }

    public void setHabilidadDefensa(int habilidadDefensa) {
        this.habilidadDefensa = habilidadDefensa;
    }

    public int[] getVectorDeDefensas() {
        return vectorDeDefensas;
    }

    public void setVectorDeDefensas(int[] vectorDeDefensas) {
        this.vectorDeDefensas = vectorDeDefensas;
    }

    
    
    private void curar(int cantidadVida){
        this.vida.comprobarYcurar(cantidadVida);
    }
    
    private void daniar(int cantidadVida){
        this.vida.daniarVida(cantidadVida);
    }
    
    public Personaje(int vidaMaxima) {
        this.vida = new EstadoVida<Integer,Integer>(vidaMaxima,vidaMaxima);
    }
    
    
    
}
