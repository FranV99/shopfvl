/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopfvl.model;

/**
 *
 * @author franvazquez
 */
public class Categoria implements Comparable<Categoria>, Cloneable {

    private String nombre;
    private boolean activo;
    private int id;

    public Categoria() {
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
    public int compareTo(Categoria o) {
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
        Categoria l = new Categoria();
        l.activo = this.activo;
        l.id = this.id;
        l.nombre = this.nombre;
        return l;
    }
    
}
