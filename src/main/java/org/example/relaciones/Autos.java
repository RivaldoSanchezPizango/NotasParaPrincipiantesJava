package org.example.relaciones;

import java.util.List;

public class Autos {
    private Long id;
    private  String marca;
    private String modelo;
    private List <Propietarios> listaPropietarios; // RELACION 1 A MUCHIOS

    @Override
    public String toString() {
        return "Autos{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", listaPropietarios=" + listaPropietarios +
                '}';
    }

    public Autos() {
    }
    public Autos(Long id, String marca, String modelo, List <Propietarios> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }

    public Long getId() {
        return id;
    }
    public Autos setId(Long id) {
        this.id = id;
        return this;
    }

    public String getMarca() {
        return marca;
    }
    public Autos setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }
    public Autos setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public List<Propietarios> getListaPropietarios() {
        return listaPropietarios;
    }
    public Autos setListaPropietarios(List<Propietarios> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
        return this;
    }
}
