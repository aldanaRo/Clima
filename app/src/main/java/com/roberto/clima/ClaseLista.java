package com.roberto.clima;
public class ClaseLista {

    private String dia;
    private String estado;
    private String temperatura;
    private int imagen;

    public ClaseLista(String dia, String estado, String temperatura, int imagen) {
        this.dia = dia;
        this.estado = estado;
        this.temperatura = temperatura;
        this.imagen = imagen;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImage(int imagen) {
        this.imagen = imagen;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }



}