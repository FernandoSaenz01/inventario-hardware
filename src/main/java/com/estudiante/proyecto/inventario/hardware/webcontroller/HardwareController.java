package com.estudiante.proyecto.inventario.hardware.webcontroller;

import com.estudiante.proyecto.inventario.hardware.domain.HardwareEntity;
import com.estudiante.proyecto.inventario.hardware.service.HardwareService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HardwareController {

    private final HardwareService hardwareService;

    public HardwareController(HardwareService hardwareService) {
        this.hardwareService = hardwareService;
    }

    @GetMapping("/imperativo")
    public List<HardwareEntity> imperativo() {
        return hardwareService.procesarImperativo();
    }

    @GetMapping("/funcional")
    public List<HardwareEntity> funcional() {
        return hardwareService.procesarFuncional();
    }
}