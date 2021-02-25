package fes.aragon.clases;

public class Computadora {

    private Monitor monitor;
    private Teclado teclado;
    private Cpu cpu;
    private Mouse mouse;

    public Computadora(Monitor monitor, Teclado teclado, Cpu cpu, Mouse mouse) {
        this.monitor = monitor;
        this.teclado = teclado;
        this.cpu = cpu;
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" + "monitor=" + monitor + ", teclado=" + teclado + ", cpu=" + cpu + ", mouse=" + mouse + '}';
    }

}
