package com.veterinaria.veterinaria;

public class FacturaVet {
    private long id_factura;
    private String servicio; 
    private int costo_asociado; 
    private String nom_veterinario;
    private String nom_mascota;
    private String tipo_mascota;
    private boolean chip;
    private String nom_dueño;


    public FacturaVet(long id_factura, String servicio, int costo_asociado, String nom_veterinario, String nom_mascota, String tipo_mascota, boolean chip, String nom_dueño){
        this.id_factura = id_factura;
        this.servicio = servicio;
        this.costo_asociado = costo_asociado;
        this.nom_veterinario = nom_veterinario;
        this.nom_mascota = nom_mascota;
        this.tipo_mascota = tipo_mascota;
        this.chip = chip;
        this.nom_dueño = nom_dueño;
    }

    public long getId_factura() {
        return id_factura;
    }

    public String getServicio() {
        return servicio;
    }

    public int getCosto_asociado() {
        return costo_asociado;
    }

    public String getNom_veterinario() {
        return nom_veterinario;
    }

    public String getNom_mascota() {
        return nom_mascota;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public boolean getChip() {
        return chip;
    }

    public String getNom_dueño() {
        return nom_dueño;
    }
}
