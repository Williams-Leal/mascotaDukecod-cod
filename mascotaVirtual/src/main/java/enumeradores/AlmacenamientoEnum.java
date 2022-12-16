package enumeradores;

public enum AlmacenamientoEnum {
    SOPA(15),ASADO(25),CHORIPAN(10),ENSALADA(20),POCHOCLOS(5),MILANESAS(15);
    private int energiaAportada;
    AlmacenamientoEnum(int energia){
        this.energiaAportada=energia;
    }

    public int getEnergiaAportada() {
        return energiaAportada;
    }
}
