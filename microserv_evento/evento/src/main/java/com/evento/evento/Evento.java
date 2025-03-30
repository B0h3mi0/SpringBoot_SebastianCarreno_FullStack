package com.evento.evento;

import java.time.LocalDate;

public class Evento {
    private long id_evento;
    private String nom_evento;
    private String descripcion;
    private LocalDate fecha_evento;
    private String direccion_evento;
    private String coordinador_evento;
    
    public Evento(long id_evento, String nom_evento, String descripcion, LocalDate fecha_evento, String direccion_evento,
            String coordinador_evento) {
        this.id_evento = id_evento;
        this.nom_evento = nom_evento;
        this.descripcion = descripcion;
        this.fecha_evento = fecha_evento;
        this.direccion_evento = direccion_evento;
        this.coordinador_evento = coordinador_evento;
    }

    public long getId_evento() {
        return id_evento;
    }

    public String getNom_evento() {
        return nom_evento;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha_evento() {
        return fecha_evento;
    }

    public String getDireccion_evento() {
        return direccion_evento;
    }

    public String getCoordinador_evento() {
        return coordinador_evento;
    }



}
