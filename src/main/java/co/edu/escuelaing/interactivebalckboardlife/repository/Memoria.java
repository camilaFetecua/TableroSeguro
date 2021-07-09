package co.edu.escuelaing.interactivebalckboardlife.repository;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
public class Memoria {
    private static final Memoria instance = new Memoria();
    private final List<String> memorialist;
    private String NumerodeMemoria;

    public Memoria(){
        memorialist = new CopyOnWriteArrayList<>();
        NumerodeMemoria = "";
    }

    public static Memoria getInstance(){
        return instance;
    }

    public synchronized String setNumerodeMemoria(String ipAddress){
        NumerodeMemoria += ipAddress + "password";
        memorialist.add(NumerodeMemoria);
        return NumerodeMemoria;
    }

    public boolean checkTicket(String ticketNumber){
        boolean isValid = false;
        if (memorialist.contains(ticketNumber)) {
            isValid = true;
        }
        return isValid;
    }
}
