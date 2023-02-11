/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.shopfvl.controller;

import jakarta.annotation.PostConstruct;
import java.util.List;

/**
 *
 * @author franvazquez
 */
public interface IController<T> {
 @PostConstruct
 public abstract void load();
 public String create();
 public String add();
 public String cancel();
 public T getSelected();
 public void setSelected(T element);
 public String preEdit();
 public List<T> getItems();
}
