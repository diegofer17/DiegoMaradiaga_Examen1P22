package diegomaradiaga_examen1p2;
/**/
public class PClaptop extends PC{
    private String Marca;
    private String Pantalla;
    private boolean RGB;

    public PClaptop() {
        super();
    }

    public PClaptop(String Marca, String Pantalla, boolean RGB, String ip, String mascara, String host) {
        super(ip, mascara, host);
        this.Marca = Marca;
        this.Pantalla = Pantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return super.toString()+"PClaptop{" + "Marca: " + Marca + "\n"
                                            + "Pantalla: " + Pantalla + "\n"
                                            + "RGB: " + RGB + '}';
    }
    
    
}
