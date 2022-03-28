package com.una.paulo.bandaapi.services.interfaces;

import com.una.paulo.bandaapi.domain.Banda;

import java.util.List;

public interface BandaServiceAPI {

    public Banda get(Long id);

    public List<Banda> findAll();

    public Banda create(Banda banda);

    public void update(Banda banda);

    public void remove(Long id);
}
