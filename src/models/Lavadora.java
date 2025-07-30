package models;

public class Lavadora extends Electrodomestico {

    private int carga;
    private final int CARGA=5;

    public Lavadora() {
    }

    public Lavadora(int precio, int peso){
        super(precio,peso);
        this.carga = CARGA;
    }

    public Lavadora(int carga, float precio, int peso, String consumoEnergetico, String color){
        super(precio, peso, consumoEnergetico, color);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal(){
        int precioFinal = super.precioFinal();

        if(carga>30){
            precioFinal+=50;
        }
        return precioFinal;
    }

}
