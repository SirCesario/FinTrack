package com.fintrack.ceva.DTO;

import com.fintrack.ceva.entity.Categoria;
import com.fintrack.ceva.entity.Usuario;

import java.util.Date;
import java.util.Set;

public class IngresoDTO {

    private Long id;
    private Long monto;
    private Date fecha;
    private String descripción;

    private Set<Categoria> categorias;
    private Set<Usuario> usuarios;

    public IngresoDTO (){}

    public IngresoDTO(Long id, Long monto, Date fecha, String descripción, Set<Categoria> categorias, Set<Usuario> usuarios) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.descripción = descripción;
        this.categorias = categorias;
        this.usuarios = usuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMonto() {
        return monto;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
