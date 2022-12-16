package modelos;

public class DukeMascota extends Mascota{

    public DukeMascota(String nombre, String propietario) {
        super(nombre, propietario);
    }

    @Override
    public String toString() {
        return "Mascota de nombre: " + nombre+'\n'+
                "Nacio el dia: "+
                fechaNacimiento.getDayOfWeek()+", "+
                fechaNacimiento.getDayOfMonth()+" de "+
                fechaNacimiento.getMonth()+" del año "+
        fechaNacimiento.getYear()+'\n'+
                "A la hora: "+fechaNacimiento.getHour()+':'+
                fechaNacimiento.getMinute()+'\n'+
                "Actualmente se encuentra "+((isLive)? "vivo\n":"muerto\n")+
                "El nivel de energia es el: "+nivelEnergia+"%\n"+
                "El nivel de hambre es el: "+nivelHambre+"%\n"+
                "El nivel de cansancio es el: "+nivelCansancio+"%\n"+
                "El nivel de felicidad es el: "+nivelFelicidad+"%\n"+
                "El nivel de aburrimiento es el: "+nivelAburrimiento+"%\n"+
                "y su propietario es: "+propietario;
    }
}
