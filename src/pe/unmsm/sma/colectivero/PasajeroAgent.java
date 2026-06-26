package pe.unmsm.sma.colectivero;

import jade.core.Agent;

public class PasajeroAgent extends Agent {

    @Override
    protected void setup() {
        System.out.println("Pasajero listo para solicitar viaje.");
    }
}