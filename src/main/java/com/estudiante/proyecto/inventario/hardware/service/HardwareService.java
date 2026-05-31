package com.estudiante.proyecto.inventario.hardware.service;

import com.estudiante.proyecto.inventario.hardware.domain.HardwareEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class HardwareService {

    public List<HardwareEntity> generarInventario() {
        List<HardwareEntity> inventario = new ArrayList<>();

        String[] categorias = {"Laptop", "PC", "Servidor"};
        String[] estados = {"ACTIVO", "BAJA"};

        for (int i = 1; i <= 10000; i++) {
            String categoria = categorias[i % categorias.length];
            String estado = estados[i % estados.length];

            inventario.add(new HardwareEntity(
                    (long) i,
                    "Modelo-" + i,
                    categoria,
                    BigDecimal.valueOf(300 + (i % 5000)),
                    LocalDate.now().minusYears(i % 10),
                    estado
            ));
        }

        return inventario;
    }
    public List<HardwareEntity> procesarImperativo() {

        List<HardwareEntity> inventario = generarInventario();
        List<HardwareEntity> resultado = new ArrayList<>();

        for (HardwareEntity hardware : inventario) {

            if ("ACTIVO".equals(hardware.getEstado())
                    && hardware.getFechaCompra().isAfter(LocalDate.now().minusYears(5))) {

                resultado.add(hardware);
            }
        }

        return resultado;
    }
    public List<HardwareEntity> procesarFuncional() {

        return generarInventario().stream()
                .filter(hardware -> "ACTIVO".equals(hardware.getEstado()))
                .filter(hardware -> hardware.getFechaCompra()
                        .isAfter(LocalDate.now().minusYears(5)))
                .toList();
    }
}

