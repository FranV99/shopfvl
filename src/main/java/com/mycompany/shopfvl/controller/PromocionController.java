/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopfvl.controller;

import com.mycompany.shopfvl.model.Promocion;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.Date;

/**
 *
 * @author Pedro
 */
@Named
@ApplicationScoped
public class PromocionController extends AbstractController<Promocion> {
    @Inject
    PromocionController categoriaController;
    public PromocionController() {
        super(Promocion::new);
        //this.load();
    }

    @Override
    @PostConstruct
    public void load() {
        this.create();
        //this.getSelected().setId(-1);
        this.getSelected().setNombre("Oferta1");
        this.getSelected().setDescripcion("2x1 en la primera compra");
        this.getSelected().setFechainicio("22/7/2024");
        this.getSelected().setFechafin("23/7/2024");
        this.add();

        this.create();
        //this.getSelected().setId(-2);
        this.getSelected().setNombre("Oferta2");
        this.getSelected().setDescripcion("3x1 en la primera compra");
        this.getSelected().setFechainicio("12/10/1999");
        this.getSelected().setFechafin("Pa siempre");
        this.add();

        this.create();
        //this.getSelected().setId(3);
        this.getSelected().setNombre("Oferta3");
        this.getSelected().setDescripcion("Llevate gratis una taza");
        this.getSelected().setFechainicio("10/2/2023");
        this.getSelected().setFechafin("20/2/2023");
        this.add();
    }

    public String remove() {
        if (this.getSelected() != null) {
            /*if (this.propiedadcontroller.getItems().stream().filter(item -> {
                return item.getPromocion() == this.getSelected();
            }).count() == 0) {*/
                this.repositorio.remove(this.getSelected());
                return "remove";
            /*} else {
                return "";
            }*/

        }
        //se tiene que poner el error
        return "";

    }

    @Override
    public String preEdit() {
        return "edit";
    }

    @Override
    public String add() {
        //si es nuevo
        if (this.getSelected().getId() == -1) {
            this.getSelected().setId(this.repositorio.getAll().size() + 1);
            this.repositorio.create(this.getSelected());
        } else {
            this.repositorio.update(this.getSelected());
            //si ya existe
    
        }
        return "sucess";
    }
}
