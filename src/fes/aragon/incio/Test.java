package fes.aragon.incio;

import fes.aragon.clases.*;

public class Test {

    public static void main(String[] args) {
        Computadora compu = new Computadora(new Monitor("Xzeal", 165, "1920x1080"), new Teclado("Logitech", "G915", 4000f), new Cpu("AMD", "Ryzen 5 3600", 12), new Mouse("Razer", "Basilisk Ultimate Wireless", 20000));
        System.out.println(compu.toString());
    }
    
}
