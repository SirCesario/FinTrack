package com.fintrack.ceva.service.imp;

import com.fintrack.ceva.entity.Ingreso;
import com.fintrack.ceva.repository.IngresoRepository;
import com.fintrack.ceva.service.IngresoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngresoServiceImp implements IngresoService {

    private IngresoRepository ingresoRepository;

    public IngresoServiceImp(IngresoRepository ingresoRepository) {
        this.ingresoRepository = ingresoRepository;
    }

    @Override
    public Long calcularTotalMontoIngresos() {
        Long total = ingresoRepository.calcularTotalIngresos();
        return total != null ? total : 0;
    }

    @Override
    public List<Ingreso> obtenerTodosLosIngresos() {
        return ingresoRepository.findAll();
    }

    @Override
    public Ingreso buscarPorId(Long id) {
        return ingresoRepository.findById(id).orElse(null);
    }

    @Override
    public void crearIngreso(Ingreso ingreso) {
        ingresoRepository.save(ingreso);
    }

    @Override
    public void actualizarIngreso(Ingreso ingreso) {
        ingresoRepository.save(ingreso);
    }

    @Override
    public void eliminarIngreso(Long id) {
        ingresoRepository.deleteById(id);
    }
}
