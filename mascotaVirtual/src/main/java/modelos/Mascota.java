package modelos;

import acciones.Alimentarse;
import acciones.Divertirse;
import acciones.Dormir;
import acciones.Hacerpopo;
import enumeradores.AlmacenamientoEnum;
import enumeradores.EntretenimientoEnum;
import utils.actas.RegistroCivilMascotas;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Mascota {
    //atributos
    protected String nombre;
    protected LocalDateTime fechaNacimiento;
    protected LocalDateTime fechaMuerte;
    protected boolean isLive;
    protected int nivelEnergia;
    protected int nivelHambre;
    protected int nivelCansancio;
    protected int nivelFelicidad;
    protected int nivelAburrimiento;
    protected String propietario;
    protected Alimentarse alimentarse;
    protected Divertirse divertirse;
public static LocalDateTime ultimoDescanso;
protected Dormir descansar;
protected int comidasIngeridas;
protected Hacerpopo popo;
protected ArrayList<String> causaDeMuerte=new ArrayList<>();
protected String actaDefuncion;
protected String actaNacimiento;
//constructor
    public Mascota(String nombre, String propietario) {
        setNombre(nombre);
        setPropietario(propietario);
       setLive(true);
     setNivelEnergia(60);
        setNivelHambre((int) (Math.random()*100));
       setNivelCansancio((int) (Math.random()*100));
        setNivelFelicidad((int) (Math.random()*100));
        setNivelAburrimiento((int)(Math.random()*100));
        setFechaNacimiento(LocalDateTime.now());
        this.alimentarse=new Alimentarse();
        this.divertirse=new Divertirse();
        this.descansar=new Dormir();
        this.popo=new Hacerpopo();
    }
        // metodos
        public void comer(AlmacenamientoEnum alimento){
        alimentarse.ingerirAlimento(alimento,this);
    }
    public void dormir(LocalTime tiempo){
        descansar.hacerDormir(tiempo,this);
    }
    public void jugar(EntretenimientoEnum entretenimiento){
        divertirse.entretenerceCon(entretenimiento,this);

    }
    public void irAlBaño(){
        popo.evacuar(this);
    }
//gettes and setters
    public String getNombre() {
        return nombre;
    }

   private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    private void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDateTime getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(LocalDateTime fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public boolean isLive() {
        return isLive;
    }

   public void setLive(boolean live) {
        isLive = live;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        if (nivelEnergia<=100) {
            this.nivelEnergia = nivelEnergia;
        }

    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public void setNivelHambre(int nivelHambre) {
            this.nivelHambre = nivelHambre;

    }

    public int getNivelCansancio() {
        return nivelCansancio;
    }

    public void setNivelCansancio(int nivelCansancio) {
        this.nivelCansancio = nivelCansancio;
    }

    public int getNivelFelicidad() {
        return nivelFelicidad;
    }

    private void setNivelFelicidad(int nivelFelicidad) {
        this.nivelFelicidad = nivelFelicidad;
    }

    public int getNivelAburrimiento() {
        return nivelAburrimiento;
    }

    public void setNivelAburrimiento(int nivelAburrimiento) {
        if (nivelAburrimiento>0) {
            this.nivelAburrimiento = nivelAburrimiento;
        }
    }

    public String getPropietario() {
        return propietario;
    }

    private void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getComidasIngeridas() {
        return comidasIngeridas;
    }

    public void setComidasIngeridas(int comidasIngeridas) {
        this.comidasIngeridas = comidasIngeridas;
    }

    public Hacerpopo getPopo() {
        return popo;
    }

    public ArrayList<String> getCausaDeMuerte() {
        return causaDeMuerte;
    }

    public void setCausaDeMuerte(String causaDeMuerte) {
        this.causaDeMuerte.add(causaDeMuerte);
    }

    public String getActaNacimiento() {
        return actaNacimiento;
    }

    public void setActaNacimiento(String actaNacimiento) {
        this.actaNacimiento = actaNacimiento;
    }

    public String getActaDefuncion() {
        return actaDefuncion;
    }

    public void setActaDefuncion(String actaDefuncion) {
        this.actaDefuncion = actaDefuncion;
    }

}
