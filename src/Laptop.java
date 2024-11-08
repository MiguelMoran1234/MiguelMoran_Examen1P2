/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flash
 */
public class Laptop extends PC{
    
    private String marca;
    private String definicion;
    private boolean rgb;

    public Laptop(String marca, String definicion, boolean rgb, String ip, String mascara, String nombre) {
        super(ip, mascara, nombre);
        this.marca = marca;
        this.definicion = definicion;
        this.rgb = rgb;
    }
    
}
