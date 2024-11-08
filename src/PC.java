/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flash
 */
public abstract class PC{
    
    private String ip;
    private String mascara;
    private String nombre;

    public PC(String ip, String mascara, String nombre) {
        this.ip = ip;
        this.mascara = mascara;
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public String getMascara() {
        return mascara;
    }

    public static boolean IPValido(String ip){
        boolean valido = true;
        String[] strings = ip.split(".");
        if(strings.length != 4){
            valido = false;
        } else {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[i].length(); j++) {
                    int ascii = strings[i].charAt(j);
                    if(ascii < 48 || ascii > 57){
                        valido = false;
                    }
                }
                if(valido){
                    int numero = Integer.parseInt(strings[i]);
                    if(numero < 0 || numero > 255){
                        valido = false;
                    }
                }
            }
        }
        return valido;
    }
}
