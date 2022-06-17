package modelo.tickets;

import modelo.interfaces.ILocacion;
import modelo.constantes.Puntajes;

public class Formulario_de_Busqueda {
    private ILocacion locacion;
    private double remuneracion;
    private int cargaHoraria;
    private int tipoPuestoLaboral;
    private int rangoEtario;
    private int experienciaPrevia;
    private int estudiosCursados;

    // CONSTRUCTOR
    public Formulario_de_Busqueda(ILocacion locacion, double remuneracion, int cargaHoraria, int tipoPuestoLaboral, int rangoEtario, int experienciaPrevia, int estudiosCursados) {
        this.locacion = locacion;
        this.remuneracion = remuneracion;
        this.cargaHoraria = cargaHoraria;
        this.tipoPuestoLaboral = tipoPuestoLaboral;
        this.rangoEtario = rangoEtario;
        this.experienciaPrevia = experienciaPrevia;
        this.estudiosCursados = estudiosCursados;
    }

    // GETTERS
    public ILocacion getLocacion() {
        return locacion;
    }

    public int puntajeLocacion(ILocacion locacion) {
        return this.locacion.puntajeLocacion(locacion);
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getTipoPuestoLaboral() {
        return tipoPuestoLaboral;
    }

    public int getRangoEtario() {
        return rangoEtario;
    }

    public int getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public int getEstudiosCursados() {
        return estudiosCursados;
    }

    //TO STRING
    @Override
    public String toString() {
        return  "   locacion: " + locacion.toString() +
                "   remuneracion: " + remuneracion +
                "   cargaHoraria: " + Puntajes.NOMBRES_FORM_BUSQUEDA[0][cargaHoraria] +
                "   tipoPuestoLaboral: " + Puntajes.NOMBRES_FORM_BUSQUEDA[1][tipoPuestoLaboral]+
                "   rangoEtario: " + Puntajes.NOMBRES_FORM_BUSQUEDA[2][rangoEtario] +
                "   experienciaPrevia: " + Puntajes.NOMBRES_FORM_BUSQUEDA[3][experienciaPrevia] +
                "   estudiosCursados: " + Puntajes.NOMBRES_FORM_BUSQUEDA[4][estudiosCursados];
    }
}