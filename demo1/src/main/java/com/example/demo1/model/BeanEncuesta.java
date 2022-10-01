package com.example.demo1.model;

public class BeanEncuesta {
    private int id;
    private String name;
    private String nameN;
    private String escuela;
    private int funcionalidad;
    private int confiabilidad;
    private int usabilidad;
    private int rendimiento;
    private int mantenimiento;
    private int portabilidad;
    private int seguridad;
    private int compatibilidad;

    public BeanEncuesta() {
    }

    public BeanEncuesta(int id, String name, String nameN, String escuela, int funcionalidad, int confiabilidad, int usabilidad, int rendimiento, int mantenimiento, int portabilidad, int seguridad, int compatibilidad) {
        this.id = id;
        this.name = name;
        this.nameN = nameN;
        this.escuela = escuela;
        this.funcionalidad = funcionalidad;
        this.confiabilidad = confiabilidad;
        this.usabilidad = usabilidad;
        this.rendimiento = rendimiento;
        this.mantenimiento = mantenimiento;
        this.portabilidad = portabilidad;
        this.seguridad = seguridad;
        this.compatibilidad = compatibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameN() {
        return nameN;
    }

    public void setNameN(String nameN) {
        this.nameN = nameN;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(int funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public int getConfiabilidad() {
        return confiabilidad;
    }

    public void setConfiabilidad(int confiabilidad) {
        this.confiabilidad = confiabilidad;
    }

    public int getUsabilidad() {
        return usabilidad;
    }

    public void setUsabilidad(int usabilidad) {
        this.usabilidad = usabilidad;
    }

    public int getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public int getPortabilidad() {
        return portabilidad;
    }

    public void setPortabilidad(int portabilidad) {
        this.portabilidad = portabilidad;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }

    public int getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(int compatibilidad) {
        this.compatibilidad = compatibilidad;
    }
    public double promedio(){
        return (funcionalidad + confiabilidad + usabilidad + rendimiento + mantenimiento +portabilidad +seguridad+ compatibilidad) * 1000 /40;
    }
}
