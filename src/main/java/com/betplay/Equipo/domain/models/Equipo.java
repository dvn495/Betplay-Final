package com.betplay.Equipo.domain.models;

public class Equipo {
    private int equipoid;
    private String equipoName;
    private String equipoFechaFundacion;
    private int equipoidCiudad;
    private String equipoFechaUltimoTitulo;

    public Equipo(){}
    
    public Equipo(int equipoid, String equipoName, String equipoFechaFundacion, int equipoidCiudad,
            String equipoFechaUltimoTitulo) {
        this.equipoid = equipoid;
        this.equipoName = equipoName;
        this.equipoFechaFundacion = equipoFechaFundacion;
        this.equipoidCiudad = equipoidCiudad;
        this.equipoFechaUltimoTitulo = equipoFechaUltimoTitulo;
    }

    public int getEquipoid() {
        return equipoid;
    }

    public void setEquipoid(int equipoid) {
        this.equipoid = equipoid;
    }

    public String getEquipoName() {
        return equipoName;
    }

    public void setEquipoName(String equipoName) {
        this.equipoName = equipoName;
    }

    public String getEquipoFechaFundacion() {
        return equipoFechaFundacion;
    }

    public void setEquipoFechaFundacion(String equipoFechaFundacion) {
        this.equipoFechaFundacion = equipoFechaFundacion;
    }

    public int getEquipoidCiudad() {
        return equipoidCiudad;
    }

    public void setEquipoidCiudad(int equipoidCiudad) {
        this.equipoidCiudad = equipoidCiudad;
    }

    public String getEquipoFechaUltimoTitulo() {
        return equipoFechaUltimoTitulo;
    }

    public void setEquipoFechaUltimoTitulo(String equipoFechaUltimoTitulo) {
        this.equipoFechaUltimoTitulo = equipoFechaUltimoTitulo;
    }
    

    

}
