/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author ludwin
 */
public class automovil {
    private String marca;
    private String subMarca;
    private int modelo;
    private Color Color;

    public automovil() {
    }

    public automovil(String marca, String subMarca, int modelo, Color Color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.Color = Color;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", Color=" + Color + '}';
    }
    
    // exdi yiyi ici
    
}
