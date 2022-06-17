package modelo.tickets;

import modelo.interfaces.ILocacion;
import modelo.constantes.Puntajes;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Ticket implements Comparable{
    protected Formulario_de_Busqueda formularioDeBusqueda;
    protected Calendar fechaDeAlta = Calendar.getInstance();
    protected String estado; // activo-suspendido-cancelado-finalizado
    protected String tipoDeTrabajo;
    protected double puntajeTotal;

    // CONSTRUCTOR
    public Ticket(Formulario_de_Busqueda formularioDeBusqueda, String tipoDeTrabajo) {
        this.formularioDeBusqueda = formularioDeBusqueda;
        this.fechaDeAlta = new GregorianCalendar();
        this.estado = "Activo";
        this.tipoDeTrabajo = tipoDeTrabajo;
        this.puntajeTotal = 0;
    }

    // GETTERS && SETTERS
    public Formulario_de_Busqueda getFormularioDeBusqueda() {
        return formularioDeBusqueda;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipoDeTrabajo() {
        return tipoDeTrabajo;
    }

    public double getRemuneracion() {
        return formularioDeBusqueda.getRemuneracion();
    }

    public int getCargaHoraria() {
        return formularioDeBusqueda.getCargaHoraria();
    }

    public int getTipoPuestoLaboral() {
        return formularioDeBusqueda.getTipoPuestoLaboral();
    }

    public int getRangoEtario() {
        return formularioDeBusqueda.getRangoEtario();
    }

    public int getExperienciaPrevia() {
        return formularioDeBusqueda.getExperienciaPrevia();
    }

    public int getEstudiosCursados() {
        return formularioDeBusqueda.getEstudiosCursados();
    }

    public double getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPuntajeTotal(double puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }


    // FUNCIONALIDADES
    // Double dispatch con la locacion.
    // Para el resto de puntajes los calcularemos mediante matrices
    public int puntajeLocacion(ILocacion locacion) {
        return this.formularioDeBusqueda.puntajeLocacion(locacion);
    }

    public double puntajeRenumeracion(Ticket ticket) {
        return Puntajes.RENUMERACION[this.indiceRenumeracion()][ticket.indiceRenumeracion()];
    }

    public double puntajeCargaHoraria(Ticket ticket) {
        return Puntajes.MATRIZ2[this.getCargaHoraria()][ticket.getCargaHoraria()];
    }

    public int indiceRenumeracion() {
        if (this.getRemuneracion() < Puntajes.V1)
            return 0;
        else
            if (this.getRemuneracion() < Puntajes.V2)
                return 1;
            else
                return 2;
    }

    public double puntajeTipoDeTrabajo(Ticket ticket) {
        return Puntajes.MATRIZ2[this.getTipoPuestoLaboral()][ticket.getTipoPuestoLaboral()];
    }

    public double puntajeRangoEtario(Ticket ticket) {
        return Puntajes.MATRIZ2[this.getRangoEtario()][ticket.getRangoEtario()];
    }

    public double puntajeExperienciaPrevia(Ticket ticket) {
        return Puntajes.MATRIZ3[this.getExperienciaPrevia()][ticket.getExperienciaPrevia()];
    }

    public double puntajeEstudiosCursados(Ticket ticket) {
        return Puntajes.MATRIZ3[this.getEstudiosCursados()][ticket.getEstudiosCursados()];
    }

    @Override
    public int compareTo(Object o) {
        Ticket aux = (Ticket) o;

        if (this.puntajeTotal > aux.puntajeTotal)
            return 1;
        else
            if (this.puntajeTotal == aux.puntajeTotal)
                return 0;
            else
                return -1;
    }
}
