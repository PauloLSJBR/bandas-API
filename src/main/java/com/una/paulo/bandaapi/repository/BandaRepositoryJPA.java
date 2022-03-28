package com.una.paulo.bandaapi.repository;

import com.una.paulo.bandaapi.domain.Banda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandaRepositoryJPA extends JpaRepository<Banda, Long> {

}

