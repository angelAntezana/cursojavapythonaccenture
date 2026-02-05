package com.biblioteca.domain.reserva;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {

    private Long idReserva;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean finalizada;

    public Reserva(Long idReserva, LocalDate fechaInicio, LocalDate fechaFin, Boolean finalizada) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.finalizada = finalizada;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    
}
