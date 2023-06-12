package com.fintrack.ceva.repository;

import com.fintrack.ceva.entity.Ingreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngresoRepository  extends JpaRepository<Ingreso, Long> {

    List<Ingreso> findAll();
    @Query("select sum (i.monto) from Ingreso  i")
    Long calcularTotalIngresos();

}
