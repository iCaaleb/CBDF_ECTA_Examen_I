package com.upiiz.proveedores.models;

public class Proveedor {
    private Long id;
    private String nombre_empresa;
    private String nombre_contacto;
    private String correo;
    private String telefono;

    public Proveedor(){

    }

    public Proveedor(Long id, String nombre_empresa, String nombre_contacto, String correo, String telefono) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.nombre_contacto = nombre_contacto;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
