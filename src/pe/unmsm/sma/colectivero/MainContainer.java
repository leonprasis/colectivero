package pe.unmsm.sma.colectivero;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class MainContainer {

    public static void main(String[] args) {
        try {
            Runtime rt = Runtime.instance();
            Profile p = new ProfileImpl();
            p.setParameter(Profile.GUI, "true");

            ContainerController container = rt.createMainContainer(p);

            AgentController colectivero = container.createNewAgent(
                    "Colectivero",
                    "pe.unmsm.sma.colectivero.ColectiveroAgent",
                    null
            );
            colectivero.start();

            AgentController pasajero = container.createNewAgent(
                    "Pasajero",
                    "pe.unmsm.sma.colectivero.PasajeroAgent",
                    null
            );
            pasajero.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
