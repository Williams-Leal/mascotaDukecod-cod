
package utils.actas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import modelos.Mascota;

public class RegistroCivilMascotas {
    static FileInputStream input;
    static FileOutputStream output;
    private static final String RUTA = "src/main/java/utils/actas/";

    public RegistroCivilMascotas() {
    }

    public static void confeccionarActa(Mascota mascota) {
        String actaNacimiento;
        String actaDefuncion;
        if (!mascota.isLive()) {
            actaDefuncion = "ACTA DE DEFUNCION DE: " + mascota.getNombre() + "\nFECHA DE FALLECIMIENTO: " + mascota.getFechaMuerte().toLocalDate() + "\nA LA HORA: " + mascota.getFechaMuerte().toLocalTime().getHour() + ":" + mascota.getFechaMuerte().toLocalTime().getMinute() + "\nCAUSA DE MUERTE: " + mascota.getCausaDeMuerte().toString();
            mascota.setActaDefuncion(actaDefuncion);
            guardarActa(mascota);
        } else {
            actaNacimiento = "ACTA DE NACIMIENTO DE: " + mascota.getNombre() + "\nFECHA DE NACIMIENTO: " + mascota.getFechaNacimiento().toLocalDate() + "\nA LA HORA: " + mascota.getFechaNacimiento().toLocalTime().getHour() + ":" + mascota.getFechaNacimiento().toLocalTime().getMinute() + "\nSU FAMILIAR ES: " + mascota.getPropietario();
            mascota.setActaNacimiento(actaNacimiento);
           guardarActa(mascota);
        }
    }
    public static void guardarActa(Mascota mascota) {
        System.out.println();
        if (!mascota.isLive() && mascota.getActaDefuncion() != null) {
            try {
                output = new FileOutputStream("src/main/java/utils/actas/" + mascota.getNombre() + "Defuncion.txt");
                output.write(mascota.getActaDefuncion().getBytes());
                System.out.println("Acta de defunción archivada");
                output.close();
            } catch (IOException df) {
                throw new RuntimeException(df);
            }
        }else {
            try {
                output = new FileOutputStream("src/main/java/utils/actas/" + mascota.getNombre() + "Nacimiento.txt");
                output.write(mascota.getActaNacimiento().getBytes());
                System.out.println("Acta de Nacimiento archivada");
                output.close();
            } catch (IOException nc) {
                throw new RuntimeException(nc);
            }
        }
    }

    public static void leerActaNacimiento(Mascota mascota) {
        try {
            input = new FileInputStream("src/main/java/utils/actas/" + mascota.getNombre() + "Nacimiento.txt");

            for(int contenido = input.read(); contenido != -1; contenido = input.read()) {
                System.out.print((char)contenido);
            }

            input.close();
        } catch (FileNotFoundException var6) {
            System.out.println("No existe acta de nacimiento de la mascota " + mascota.getNombre());
        } catch (IOException var7) {
            System.out.println("No se ha podido leer");
        } finally {
            System.out.println("");
        }

    }

    public static void leerActaDefuncion(Mascota mascota) {
        if (!mascota.isLive()) {
            try {
                input = new FileInputStream("src/main/java/utils/actas/" + mascota.getNombre() + "Defuncion.txt");

                for(int contenido = input.read(); contenido != -1; contenido = input.read()) {
                    System.out.print((char)contenido);
                }

                input.close();
            } catch (FileNotFoundException var6) {
                System.out.println("No existe acta de defuncion de la mascota " + mascota.getNombre());
            } catch (IOException var7) {
                System.out.println("No se ha podido leer");
            } finally {
                System.out.println("");
            }
        }

    }
}
