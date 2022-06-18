package modelo.usuarios;

import modelo.Sistema;
import modelo.constantes.Puntajes;
import modelo.tickets.Ticket;
import modelo.tickets.TicketSimplificado;
import modelo.tickets.Ticket_de_Busqueda_de_Empleado;
import modelo.tickets.Ticket_de_Busqueda_de_Empleo;

import java.util.ArrayList;

public class Agencia extends Usuario {
	
    private ArrayList <TicketSimplificado> bolsaDeTrabajo;

    public Agencia(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
        this.bolsaDeTrabajo=new ArrayList<>();
    }

    //FUNCIONALIDADES
    public void muestraEmpleadores() {
        System.out.println("Lista de empleadores: ");
        for (int i = 0;i < Sistema.getInstance().getEmpleadores().size();i++)
            System.out.println(Sistema.getInstance().getEmpleadores().get(i).toString());
    }

    public void muestraSolicitudesEmpleadores() {
        System.out.println("Lista de solicitudes de empleadores: ");
        for (Ticket_de_Busqueda_de_Empleado i : Sistema.getInstance().getTicketsDeEmpleadores().keySet())
            System.out.println(i.toString());
    }

    public void muestraEmpleadosPretensos() {
        System.out.println("Lista de empleados pretensos: ");
        for (int i = 0;i < Sistema.getInstance().getEmpleadosPretensos().size();i++)
            System.out.println(Sistema.getInstance().getEmpleadosPretensos().get(i).toString());
    }

    public void muestraSolicitudEmpleadosPretensos() {
        System.out.println("Lista de solicitudes de empleadores: ");
        for (Ticket_de_Busqueda_de_Empleo i : Sistema.getInstance().getTicketsDeEmpleadosPretensos().keySet())
            System.out.println(i.toString());
    }

    public void calculaComisiones() {
        double total = 0, aux;

        System.out.println("Comision a cobrar a cada Empleador: ");
        for (int i = 0;i < Sistema.getInstance().getContratos().size();i++) {
            aux = Sistema.getInstance().getContratos().get(i).getEmpleador().calculaComision(Sistema.getInstance().getContratos().get(i).getRemuneracion());
            System.out.println("\tUsuario: " + Sistema.getInstance().getEmpleadores().get(i).getNombreUsuario() + " ~ Comision = $" + aux);
            total += aux;
        }

        System.out.println("Comision a cobrar a cada Empleado pretenso: ");
        for (int i = 0;i < Sistema.getInstance().getEmpleadosPretensos().size();i++) {
            aux = Sistema.getInstance().getContratos().get(i).getEmpleado_pretenso().calculaComision(Sistema.getInstance().getContratos().get(i).getRemuneracion());
            System.out.println("\tUsuario: " + Sistema.getInstance().getEmpleadosPretensos().get(i).getNombreUsuario() + " ~ Comision = $" + aux);
            total += aux;
        }

        System.out.println("\nMonto total a cobrar = $" + total);
    }

    public void agregarTipoDeTrabajo(String trabajo) {
        Sistema.getInstance().agregaTiposDeTrabajo(trabajo);
    }

    public void confeccionarRangoEtario(int edad1, int edad2){
        // hay que ingresar los valores que van a ser usados para el rango de edad
        // se encuentra definido dentro de las constantes.
        Puntajes.setEdad2(edad2);
        Puntajes.setEdad1(edad1);
    }

    public void confeccionarTipoDePuesto(String puesto1, String puesto2, String puesto3){
        // hay que ingresar los valores que van a ser usados para v1 y v2 para el rango de edad
        // se encuentra definido dentro de las constantes.
        Puntajes.setPuesto1( puesto1 );
        Puntajes.setPuesto2( puesto2 );
        Puntajes.setPuesto3( puesto3 );
    }

    public TicketSimplificado coincidenciaTipoTrabajo(Ticket t) {
        int c = 0;
        TicketSimplificado aux, retorno = null;
        if (this.bolsaDeTrabajo.size()!= 0) {
            aux = this.bolsaDeTrabajo.get(c);
            c++;
            while (aux!=null && c<this.bolsaDeTrabajo.size() && retorno== null) {
                if (aux.getTipoDeTrabajo().equalsIgnoreCase(t.getTipoDeTrabajo()))
                    retorno = aux;
                aux = this.bolsaDeTrabajo.get(c);
                c++;

            }
        }
        return retorno;
    }


    public void agregarABolsaDeTrabajo(TicketSimplificado t){
        this.bolsaDeTrabajo.add(t);
    }
    public void eliminarABolsaDeTrabajo(TicketSimplificado t){
        this.bolsaDeTrabajo.remove(t);
    }

    ////METODOS SYNCHRONIZED
    public synchronized TicketSimplificado SacaBolsa(Ticket t, Empleado_Pretenso u)
    {
        TicketSimplificado aux=null;
        while (((aux = coincidenciaTipoTrabajo(t)) == null))
        {
            try
            {
            	System.out.println("El Empleado Pretenso "+ u.getNombreUsuario() + " Esperara a que haya En la bolsa de Trabajo algún trabajo de Su tipo Buscado");
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        this.eliminarABolsaDeTrabajo(aux);
        System.out.println("EL empleado "+u.getNombreUsuario()+" Saca de la Bolsa un trabajo para evaluar su Locacion");
        notifyAll();
        return aux;
    }

    public synchronized void PoneBolsa(TicketSimplificado t, UsuarioComun u){
        this.agregarABolsaDeTrabajo(t);
        System.out.println("El Usuario "+ u.getNombreUsuario() + " Puso un trabajo En la bolsa de Trabajo");
        notifyAll();
    }
}