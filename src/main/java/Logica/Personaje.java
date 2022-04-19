package Logica;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Javier Bagatoli
 * fecha 12/04/2022
 */

public class Personaje implements IPersona{
    private String nombre;
    private EstadoVida<Integer,Integer> vida;
    private int habilidadAtaque;
    private int habilidadDefensa;
    private byte[] vectorDeDefensas = new byte[7];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Integer getVida() {
        return vida.getVida();
    }
    
    public void setVida(int vida){
        EstadoVida vidaMaxima = new EstadoVida<Integer,Integer>(vida,vida);
        this.vida = vidaMaxima;
        JOptionPane.showMessageDialog(null, this.getVida());
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

    public byte[] getVectorDeDefensas() {
        return vectorDeDefensas;
    }

    public void setVectorDeDefensas(byte[] vectorDeDefensas) {
        this.vectorDeDefensas = vectorDeDefensas;
    }

    /*
        FUNCIONES PROPIAS
    */
    @Override
    public void curar(int cantidadVida){
        this.vida.comprobarYcurar(cantidadVida);
    }
    @Override
    public void recibirDanio(int danio){
        aplicarDanio(danio);
    }
    
    @Override
    public int calcularDanioRecibido(int dado, byte tipoDanio,
            int ataqueRecibido, int danio){
        int resultadoAtaque =
                dado + ataqueRecibido - vectorDeDefensas[tipoDanio] * 10 - 
                habilidadDefensa - 20;
        if (resultadoAtaque < 0){
            resultadoAtaque = 0;
        }
        
        float resultadoPorcentual = (float) ((float) resultadoAtaque/100); //Acomoda el valor en flaot
        int danioResultanteRecibido = (int) (resultadoPorcentual * danio);
        
        return danioResultanteRecibido;
    }
    private void aplicarDanio (int cantidadVida){
        this.vida.daniarVida(cantidadVida);
    }
    
    @Override
    public String mostrarDatos() {
        return getNombre() + "<br>" +  mostrarDatosVida() +
            "<br> Habilidad de ataque: " + getHabilidadAtaque() +
            "<br> Habilidad de defensa: " + getHabilidadDefensa() +
            "<br> Valores de defensa: " + mostrarValoresDefensa();
    }
    
    public String mostrarDatosVida(){
        return this.vida.mostrarDatosVida();
    }
    
    public String mostrarValoresDefensa(){
        String defensa = "";
        for(int i = 0; i < vectorDeDefensas.length; i++){
            defensa = defensa.concat(" | " + vectorDeDefensas[i]);
            if (i == vectorDeDefensas.length-1){
                defensa = defensa.concat(" | ");
            }
        }
        return defensa;
    }

    @Override
    public void aumentarVida(int cantidadVida) {
        vida.aumentarVida(cantidadVida);
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Personaje() {
        this.nombre = "test";
        this.habilidadAtaque = -10;
        this.habilidadDefensa = -10;
        this.vectorDeDefensas[0] = -1;
        this.vectorDeDefensas[1] = -1;
        this.vectorDeDefensas[2] = -1;
        this.vectorDeDefensas[3] = -1;
        this.vectorDeDefensas[4] = -1;
        this.vectorDeDefensas[5] = -1;
        this.vectorDeDefensas[6] = -1;
        this.vida = new EstadoVida<Integer,Integer>(-1,-1);
        
    }
    
    public Personaje(String nombre, int vidaMaxima, int habilidadDeAtaque,
            int habilidadDeDefensa) {
        this.nombre = nombre;
        this.vida = new EstadoVida<Integer,Integer>(vidaMaxima,vidaMaxima);
        this.habilidadAtaque = habilidadDeAtaque;
        this.habilidadDefensa = habilidadDeDefensa;
        for(int i = 0; i<vectorDeDefensas.length; i++){
            vectorDeDefensas[i] = 0;
        }
    }
    
    public Personaje(String nombre, int vidaMaxima, int habilidadDeAtaque,
            int habilidadDeDefensa, byte[] vectorDeDefensas){
        this.nombre = nombre;
        this.vida = new EstadoVida<Integer,Integer>(vidaMaxima);
        this.habilidadAtaque = habilidadDeAtaque;
        this.habilidadDefensa = habilidadDeDefensa;
        this.vectorDeDefensas = vectorDeDefensas;
    }
}

