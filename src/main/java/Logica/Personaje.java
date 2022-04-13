package Logica;

/**
 * @author JavW11trial
 */
public class Personaje implements IPersona{
    private String nombre;
    private EstadoVida<Integer,Integer> vida;
    private int habilidadAtaque;
    private int habilidadDefensa;
    private int[] vectorDeDefensas = new int[8];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
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

    /*
        FUNCIONES PROPIAS
    */
    @Override
    public void curar(int cantidadVida){
        this.vida.comprobarYcurar(cantidadVida);
    }
    @Override
    public void daniar(int cantidadVida){
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
        }
        return defensa;
    }

    @Override
    public void aumentarVida(int cantidadVida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            int habilidadDeDefensa, int[] vectorDeDefensas){
        this.nombre = nombre;
        this.vida = new EstadoVida<Integer,Integer>(vidaMaxima);
        this.habilidadAtaque = habilidadDeAtaque;
        this.habilidadDefensa = habilidadDeDefensa;
        this.vectorDeDefensas = vectorDeDefensas;
    }
}

