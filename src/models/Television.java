package models;

public class Television extends Electrodomestico{
    private int resolucion;
    private int sintonizadorTDT;

    private final int RESOLUCION=20;
    private boolean SONTONIZADOR_TDT=false;

    public Television(){}

    public Television(int precio, int peso){
        super(precio,peso);
        this.resolucion=RESOLUCION;
    }

    public Television(float precio, int peso, String consumoEnergetico, String color, int resolucion, int sintonizadorTDT) {
        super(precio, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }
    public int getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public int precioFinal() {
        int precio = super.precioFinal();

        if (resolucion>40){
            precio += (int) (precio*0.3);
        }
        return precio;
    }


}
