package modelo.tickets.locaciones;

import modelo.interfaces.ILocacion;

public class LocacionFactory {

    public LocacionFactory(){
    }

    public ILocacion getLocacion(String tipo){

        if (tipo == null)
            return null;
        else
            if (tipo.equalsIgnoreCase("HOMEOFFICE"))
                return new LocacionHomeOffice();
            else
                if (tipo.equalsIgnoreCase("PRESENCIAL"))
                    return new LocacionPresencial();
                else
                    if (tipo.equalsIgnoreCase("INDISTINTO"))
                        return new LocacionIndistinto();
                    else
                        return null;
    }

    @Override
    public String toString() {
        return "Presencial";
    }
}
