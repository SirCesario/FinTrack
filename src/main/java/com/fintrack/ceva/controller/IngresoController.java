package com.fintrack.ceva.controller;

import com.fintrack.ceva.entity.Ingreso;
import com.fintrack.ceva.service.IngresoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/ingreso")
public class IngresoController {

    private IngresoService ingresoService;

    public IngresoController( IngresoService ingresoService){
        this.ingresoService = ingresoService;
    }

    @GetMapping("/ingresos")
    public ResponseEntity<List<Ingreso>> obtenerTodosLosIngresos(){
        List<Ingreso> ingresos = ingresoService.obtenerTodosLosIngresos();
        return ResponseEntity.ok(ingresos);
    }

    @GetMapping("/total")
    public Long calcularTotal(){
        Long totalIngresos = ingresoService.calcularTotalMontoIngresos();
        return totalIngresos != null ? totalIngresos :0;
    }
    @GetMapping("/{id}")
    public  ResponseEntity<?> obtenerIngresoPorId(@PathVariable Long id){
        String Mensaje = "";
        Ingreso ingreso = ingresoService.buscarPorId(id);
        if (ingreso != null){
            return ResponseEntity.ok(ingreso);
        }else {
            Mensaje = "No hay ingresos con ese Número de ID" + id;
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Mensaje);
        }
    }

    @PostMapping
    public ResponseEntity<?> crearIngreso(@RequestBody Ingreso ingreso){
        String Mensaje = "";
        ingresoService.crearIngreso(ingreso);
        Mensaje = "Se ha creado un Ingreso de manera Correcta";
        return ResponseEntity.status(HttpStatus.CREATED).body(Mensaje);
    }

}
