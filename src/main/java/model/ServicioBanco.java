package model;

import org.joda.time.DateTime;

public class ServicioBanco {

    private String nombre;
    private Horarios horarios;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }
    
    public void setHorarios(Horarios horarios) {
        this.horarios = horarios;
    }

    public Horarios getHorarios() {
        return horarios;
    }

    protected boolean estaDisponible() {
        DateTime fechaHoraActual = new DateTime();
        return horarios.atiende(fechaHoraActual);
    }
}
