package Agenda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class agenda {
    private String tipoevento;
    private Calendar fecha;
    private String prioridad;
    private ArrayList<agenda> PrioridadUrgente;
    private ArrayList<agenda> PrioridadMedia;
    private ArrayList<agenda> PrioridadBaja;
    
    public agenda(String tipoevento, Calendar fecha, String prioridad){
        this.PrioridadUrgente = new ArrayList<>();
        this.PrioridadMedia = new ArrayList<>();
        this.PrioridadBaja = new ArrayList<>();
        this.prioridad = prioridad;
        this.tipoevento = tipoevento;
        this.fecha = fecha;       
    }

    public String getTipoevento() {
        return tipoevento;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setTipoevento(String tipoevento) {
        this.tipoevento = tipoevento;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    public void agregarUrgente(agenda ev){
        PrioridadUrgente.add(ev);
    }

    public void agregarMedia(agenda ev){
        PrioridadMedia.add(ev);
    }
    
    public void agregarBaja(agenda ev){
        PrioridadBaja.add(ev);
    }
}
