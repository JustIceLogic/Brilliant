/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.io.Serializable;

/**
 *
 * @author ROGLOGIC
 */
  public class clase implements Serializable{
    private String nombre;
    private String edificio;
    private String salon;
    private String topico;
    
    public clase(){
    nombre="";
    edificio="";
    salon="";
    topico="";
    }
    
    public clase(String nombre, String salon, String edificio, String topico){
        this.nombre = nombre;
        this.edificio = salon;
        this.salon = salon;
        this.topico = topico;
    }  

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edificio
     */
    public String getEdificio() {
        return edificio;
    }

    /**
     * @param edificio the edificio to set
     */
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    /**
     * @return the salon
     */
    public String getSalon() {
        return salon;
    }

    /**
     * @param salon the salon to set
     */
    public void setSalon(String salon) {
        this.salon = salon;
    }
    
     /**
     * @return the salon
     */
    public String getTopico() {
        return topico;
    }

    /**
     * @param salon the salon to set
     */
    public void setTopico(String topico) {
        this.topico = topico;
    }
  }

