package acciones;

import modelos.Mascota;

public class Hacerpopo {
    public boolean tieneQueEvacuar(Mascota mascota){
        return mascota.getComidasIngeridas()>2;
    }
    public void evacuar(Mascota mascota){
        if (tieneQueEvacuar(mascota)){
            mascota.setComidasIngeridas(mascota.getComidasIngeridas()-1);
            mascota.setNivelHambre(mascota.getNivelHambre()+10);
        }
    }

}
