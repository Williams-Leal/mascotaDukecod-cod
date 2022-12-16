package acciones;

import enumeradores.EntretenimientoEnum;
import modelos.Mascota;

public class Divertirse {
    public void entretenerceCon(EntretenimientoEnum entretenimiento, Mascota mascota) {
        if (mascota.isLive()){
            int nivelOriginal= mascota.getNivelAburrimiento();
            if (nivelOriginal!=0){
                mascota.setNivelAburrimiento(mascota.getNivelAburrimiento()-entretenimiento.getDesaburrimiento());
                System.out.println("Duke acaba de entretenerse son: "+entretenimiento+" y su aburrimiento que estaba en: "+nivelOriginal+" desendio a: "+mascota.getNivelAburrimiento());
            }else {
                System.out.println("Esta mascota no tiene la necesidad de entretenerse su nivel de aburrimiento es cero");
            }
        }else {
            System.out.println("Lo siento, esta mascota no se encuentra operativa desde: "+mascota.getFechaMuerte());
        }
    }
}
