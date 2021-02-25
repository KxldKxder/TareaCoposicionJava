package fes.aragon.clases;

public class Cpu {

    private String marca;
    private String modelo;
    private int nucleos;

    public Cpu(String marca, String modelo, int nucleos) {
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    @Override
    public String toString() {
        return "Cpu{" + "marca=" + marca + ", modelo=" + modelo + ", nucleos=" + nucleos + '}';
    }

}
