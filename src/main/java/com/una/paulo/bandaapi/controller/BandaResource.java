package com.una.paulo.bandaapi.controller;

import com.una.paulo.bandaapi.domain.Banda;
import com.una.paulo.bandaapi.services.interfaces.BandaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bandas")
public class BandaResource {

    @Autowired
    private BandaServiceAPI bandaService;

    @GetMapping
    public @ResponseBody
    HttpEntity<List<Banda>> findAll() {

        List<Banda> bandas = bandaService.findAll();

        if(bandas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(bandas);
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    HttpEntity<Banda> get(@PathVariable(name = "id") Long id) {

        Banda banda = bandaService.get(id);
        return ResponseEntity.ok(banda);
    }

    @PostMapping
    public @ResponseBody
    HttpEntity<Banda> create(@RequestBody Banda banda) {

        banda = bandaService.create(banda);
        return ResponseEntity.ok(banda);
    }

    @PutMapping(value = "/{id}")
    public @ResponseBody
    HttpEntity<Banda> update(@PathVariable(name = "id") Long id,
                             @RequestBody Banda banda) {

        banda.setId(id);
        bandaService.update(banda);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public @ResponseBody
    HttpEntity<Banda> remove(@PathVariable(name = "id") Long id) {

        bandaService.remove(id);
        return ResponseEntity.ok().build();
    }
}

