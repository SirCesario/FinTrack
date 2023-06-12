package com.fintrack.ceva.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripción;


    @ManyToMany
    private Set<Ingreso> ingresos;
    private Categoria (){}

    public Categoria(Long id, String nombre, String descripción, Set<Ingreso> ingresos) {
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
