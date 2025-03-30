package com.veterinaria.veterinaria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class FacturaController {
    
    private List <FacturaVet> facturas = new ArrayList<>();
    
    public FacturaController(){
        facturas.add( new FacturaVet(1, "Desparacitacion", 30000, "Emilio Saavedra", "Juanin", "Gato", true, "Maciel Pasten"));
        facturas.add( new FacturaVet(2, "Analisis de sangre", 25000, "Emilio Saavedra", "Kurt", "Uron", false, "Rocio Carrasco"));
        facturas.add( new FacturaVet(3, "Cirugia", 73500, "Paola Urrutia", "Roberto", "Erizo", true, "Carlos Santana"));
    }

    @GetMapping("/facturas")
    public List<FacturaVet> getFacturaVet() {
        return facturas;
    }
    

    @GetMapping("/facturas/{id}")
    public FacturaVet getFacturaById(@PathVariable long id) {
        for (FacturaVet facturaVet : facturas){
            if(facturaVet.getId_factura() == id){
                return facturaVet;
            }
        }
        return null;
    }
}
