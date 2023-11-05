package com.fintrack.ceva.entity;


import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombreUsuario;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String nombres;
    @Column(nullable = false)
    private String apellidos;
    @Column(nullable = false, unique = true)
    private String correo;
    @Column(nullable = false)
    private String celular;
    @Column(nullable = false)
    private String sexo;


    @ManyToMany
    private Set<Ingreso> ingresos;

    public Usuario() {
    }

    public Usuario(Long id,String nombreUsuario, String password, String nombres, String apellidos, String correo, String celular, String sexo, Set<Ingreso> ingresos) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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