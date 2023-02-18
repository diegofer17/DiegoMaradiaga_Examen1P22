package diegomaradiaga_examen1p2;

public class PCescritorio extends PC{
    private int capacidadRAm;
    private int capacidadA;
    private String almacenamiento;
    private boolean tgrafica;

    public PCescritorio() {
        super();
    }

    public PCescritorio(int capacidadRAm, int capacidadA, String almacenamiento, boolean tgrafica, String ip, String mascara, String host) {
        super(ip, mascara, host);
        this.capacidadRAm = capacidadRAm;
        this.capacidadA = capacidadA;
        this.almacenamiento = almacenamiento;
        this.tgrafica = tgrafica;
    }
    
    public int getCapacidadRAm() {
        return capacidadRAm;
    }

    public void setCapacidadRAm(int capacidadRAm) {
        this.capacidadRAm = capacidadRAm;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isTgrafica() {
        return tgrafica;
    }

    public void setTgrafica(boolean tgrafica) {
        this.tgrafica = tgrafica;
    }

    public int getCapacidadA() {
        return capacidadA;
    }

    public void setCapacidadA(int capacidadA) {
        this.capacidadA = capacidadA;
    }

    @Override
    public String toString() {
        return super.toString()+"PCescritorio{" + "Capacidad RAM: " + capacidadRAm + "\n"
                                                + "Cantidad de almacenamiento: " + capacidadA + "\n"
                                                + "Tipo de almacenamiento: " + almacenamiento + "\n"
                                                + "Tarjeta grafica: " + tgrafica + '}';
    }
    
    
}
