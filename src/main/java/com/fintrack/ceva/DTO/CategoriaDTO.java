package com.fintrack.ceva.DTO;

import com.fintrack.ceva.entity.Ingreso;

import java.util.Set;

public class CategoriaDTO {

    private Long id;
    private String nombre;
    private String descripción;
    private Set<Ingreso> ingresos;

    public CategoriaDTO (){}

    public CategoriaDTO(Long id, String nombre, String descripción, Set<Ingreso> ingresos) {
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
        this.ingresos = ingresos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Set<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(Set<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }
}
