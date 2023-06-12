package com.fintrack.ceva.DTO;

import com.fintrack.ceva.entity.Ingreso;

import java.util.Set;

public class UsuarioDTO {

    private Long id;
    private String nombres;
    private String apellidos;
    private String correo;
    private String celular;
    private String sexo;
    private Set<Ingreso> ingresos;

    public UsuarioDTO() {

    }
    public UsuarioDTO(Long id, String nombres, String apellidos, String correo, String celular, String sexo, Set<Ingreso> ingresos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.celular = celular;
        this.sexo = sexo;
        this.ingresos = ingresos;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Set<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(Set<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }
}
