/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 * @author JavWdes
 * 
 */
public interface IPersona {
    public void curar(int cantidadVida);
    public void recibirDanio(int danio);
    public int calcularDanioRecibido(int dado, byte tipoDanio, int ataque, int danio);
    public void atacar();
    public void aumentarVida(int cantidadVida);
    public String mostrarDatos();   
}

