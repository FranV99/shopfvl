/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopfvl.model;

/**
 *
 * @author franvazquez
 */
public class Tienda implements Comparable<Tienda>, Cloneable {

    private String nombre;
    private boolean activo;
    private int id;
    private Categoria categoria;
    private String direccion;
    private String gps;

    public Tienda() {
        this.id = -1;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Tienda o) {
        if (o == null) {
            return -1;
        } else {
            if (o.getId() == this.id) {
                return 0;
            } else {
                return 1;
            }
        }
    }
    
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    protected Object clone() {
        Tienda l = new Tienda();
        l.activo = this.activo;
        l.id = this.id;
        l.nombre = this.nombre;
        l.direccion = this.direccion;
        l.gps = this.gps;
        return l;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
