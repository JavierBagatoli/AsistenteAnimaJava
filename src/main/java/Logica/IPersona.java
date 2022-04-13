/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 * @author JavW11trial
 */
public interface IPersona {
    public void curar(int cantidadVida);
    public void daniar(int cantidadVida);
    public void atacar();
    public void aumentarVida(int cantidadVida);
    public String mostrarDatos();
}
