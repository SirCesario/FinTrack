package com.fintrack.ceva.service;

import com.fintrack.ceva.entity.Ingreso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IngresoService {

    List<Ingreso> obtenerTodosLosIngresos();
    Long calcularTotalMontoIngresos();
    Ingreso buscarPorId(Long id);
    void crearIngreso (Ingreso ingreso);
    void actualizarIngreso(Ingreso ingreso);
    void eliminarIngreso(Long id);

}
