package enumeradores;

public enum EntretenimientoEnum {
    FUTBOL(25),NADAR(15),PASEAR(10),MIRARTELE(5),BAILAR(20),POKER(25);
    private int desaburrimiento;

    public int getDesaburrimiento() {
        return desaburrimiento;
    }

    EntretenimientoEnum(int desaburrimiento){
        this.desaburrimiento=desaburrimiento;

    }
}
