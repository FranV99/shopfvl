/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopfvl.model;

import java.util.Date;

/**
 *
 * @author franvazquez
 */
public class Promocion implements Comparable<Promocion>, Cloneable {

    private String nombre;
    private int id;
    private String descripcion;
    private String fechainicio;
    private String fechafin;

    public Promocion() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Promocion o) {
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
        Promocion l = new Promocion();
        l.id = this.id;
        l.nombre = this.nombre;
        l.setDescripcion(this.getDescripcion());
        l.setFechainicio(this.getFechainicio());
        l.setFechafin(this.getFechafin());
        return l;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

}
