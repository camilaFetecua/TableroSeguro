package co.edu.escuelaing.InteractiveBlackBoardLife.repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Clase donde implementamos la memoria para el ticket y el numero de la memoria
 */
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

    public boolean checkTicket(String NumerodeMemoria){
        boolean isValid = false;
        if (memorialist.contains(NumerodeMemoria)) {
            isValid = true;
        }
        return isValid;
    }
}
