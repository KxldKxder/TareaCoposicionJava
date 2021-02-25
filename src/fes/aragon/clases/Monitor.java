package fes.aragon.clases;

public class Monitor {

    private String marca;
    private int herz;
    private String resolucion;

    public Monitor(String marca, int herz, String resolucion) {
        this.marca = marca;
        this.herz = herz;
        this.resolucion = resolucion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getHerz() {
        return herz;
    }

    public void setHerz(int herz) {
        this.herz = herz;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", herz=" + herz + ", resolucion=" + resolucion + '}';
    }

}
