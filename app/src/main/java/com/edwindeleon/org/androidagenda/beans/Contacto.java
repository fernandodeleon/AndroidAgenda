package com.edwindeleon.org.androidagenda.beans;

/**
 * Created by Fernando on 14/10/2017.
 */

public class Contacto {
    public int idContacto;
    public int foto;
    public String nombre;
    public String telefono;
    public String correo;
    public int like;

    public Contacto(int idContacto, int foto, String nombre, String telefono, String correo, int like) {
        this.idContacto = idContacto;
        this.foto = foto;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.like = like;
    }

    public int getIdContacto() { return idContacto; }

    public void setIdContacto(int idContacto) { this.idContacto = idContacto; }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getLike() { return like; }

    public void setLike(int like) { this.like = like; }
}
