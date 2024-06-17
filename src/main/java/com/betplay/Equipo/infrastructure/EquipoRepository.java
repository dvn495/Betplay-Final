package com.betplay.Equipo.infrastructure;

import com.betplay.Equipo.domain.models.Equipo;
import java.util.List;
import java.util.Optional;

public interface EquipoRepository {
    void save(Equipo equipo);
    void update(Equipo equipo);
    Optional<Equipo> findById(int equipoid);
    void delete (int equipoid);
    List<Equipo> findAll();
}
