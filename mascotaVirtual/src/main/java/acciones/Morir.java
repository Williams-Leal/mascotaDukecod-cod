package acciones;

import modelos.Mascota;

import java.time.LocalDateTime;

public class Morir {
    public static void checkStatusGeneral(Mascota mascota){
        if (mascota.getNivelEnergia()<=0||mascota.getComidasIngeridas()>9){
            mascota.setLive(false);
            mascota.setFechaMuerte(LocalDateTime.now());
            mascota.setActaDefuncion(mascota.getActaDefuncion());
            if (mascota.getCausaDeMuerte().isEmpty()){
                determinarCausaDeMuerte(mascota);
            }
            System.out.println("La mascota ha fallecido en la fecha: "+mascota.getFechaMuerte().toLocalDate());
            System.out.println("La causa de muerte fue: "+(mascota.getCausaDeMuerte()));
        }
    }
    private static void determinarCausaDeMuerte(Mascota mascota){
        if (mascota.getNivelAburrimiento()==100){
            mascota.setCausaDeMuerte("Aburrimiento");

        }
        if (mascota.getNivelHambre()==100){
            mascota.setCausaDeMuerte("Hambre");
        }
        if (mascota.getNivelCansancio()==100){
            mascota.setCausaDeMuerte("Cansancio");
        }
        if (mascota.getNivelFelicidad()==0){
            mascota.setCausaDeMuerte("Tristeza");
        }
        if (mascota.getComidasIngeridas()>6){
            mascota.setCausaDeMuerte("Constipado");
        }
    }
}
