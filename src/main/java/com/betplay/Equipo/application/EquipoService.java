package com.betplay.Equipo.application;

import java.util.Optional;
import java.util.List;
import com.betplay.Equipo.domain.models.Equipo;
import com.betplay.Equipo.infrastructure.EquipoRepository;

public class EquipoService {
    private final EquipoRepository equiporepository;

    public EquipoService(EquipoRepository equiporepository) {
        this.equiporepository = equiporepository;
    }

    public void createEquipo(Equipo equipo) {
        equiporepository.save(equipo);
    }

    public void updateEquipo(Equipo equipo) {
        equiporepository.update(equipo);
    }

    public Optional<Equipo> getEquipoById(int equipoid) {
        return equiporepository.findById(equipoid);
    }

    public void deleteEquipo(int equipoid) {
        equiporepository.delete(equipoid);
    }

    public List<Equipo> getAllEquipos() {
        return equiporepository.findAll();
    }
}
