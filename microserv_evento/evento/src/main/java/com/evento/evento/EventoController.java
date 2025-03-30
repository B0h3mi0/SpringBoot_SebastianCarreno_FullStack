package com.evento.evento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class EventoController {

    private List <Evento> eventos = new ArrayList<>();

    public EventoController() {
        eventos.add( new Evento(1, "Expo Mascotas", "La Expo Mascotas y Animales es un evento que promueve el bienestar animal y que reúne a amantes de los animales", LocalDate.parse("2025-05-23"), "El Salto 5000, Huechuraba, Chile", "TicketPlus"));

        eventos.add( new Evento(2, "Especializadas pastor aleman", "Exposiciones del consejo de jueces del KCC para todas las razas + Especializadas de pastor aleman y pastor aleman de pelo largo", LocalDate.parse("2025-02-15"), "Av.macul 1352, Macul, Chile", "Kennel Club de chile"));

        eventos.add( new Evento(3, "Festival de patitas", "El Festival De Patitas es un evento canino masivo apto para toda la familia, enfocado en perros de todas las razas y tamaños, teniendo a disposición durante toda la jornada actividades, juegos, concursos, shows de interés para las mascotas y sus tutores", LocalDate.parse("2025-12-05"), "Estadio Municipal Ángel Navarrete Candia de la ciudad de Limache en la V Región, Chile", "Organizacion de Proteccion Animal"));
    }

    @GetMapping("/eventos")
    public List<Evento> getEvento () {
        return eventos;
    }

    @GetMapping("/eventos/{id}")
    public Evento getEventoById(@PathVariable long id) {
        for (Evento evento : eventos){
            if(evento.getId_evento() == id){
                return evento;
            }
        }
        return null;
    }
    
}
