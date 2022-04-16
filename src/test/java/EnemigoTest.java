/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Logica.Enemigo;

/**
 *
 * @author Javier Bagatoli
 */
public class EnemigoTest {
    
    public EnemigoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void crearVacio() {
        Enemigo enemigo = new Enemigo();
        assertNotNull(enemigo.mostrarDatos());
    }
    @Test
    public void EnemigoConAtaque(){
        Enemigo enemigo = new Enemigo();
        assertEquals(-10, enemigo.getHabilidadAtaque());
    }
}
