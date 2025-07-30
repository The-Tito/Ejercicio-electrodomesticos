package models;

import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {

    protected final int PRECIO_BASE = 100;
    protected final String COLOR = "blanco";
    protected final String CONSUMO_ENERGETICO = "f";
    protected final int PESO_BASE = 5;

    protected float precio;
    protected int peso;
    protected String consumoEnergetico;
    protected String color;

    public Electrodomestico(){
        this.precio = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.color = COLOR;
    }

    public Electrodomestico(float precio, int peso) {
        this.precio = precio;
        this.peso = peso;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.color = COLOR;
    }

    public Electrodomestico(float precio, int peso, String consumoEnergetico, String color) {
        this.precio = precio;
        this.peso = peso;
        this.consumoEnergetico = this.comprobarConsumoEnergetico(consumoEnergetico);
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    private String comprobarConsumoEnergetico(String letra){
        String[] letras = {"a","b","c","d","e","f"};
        boolean flag = false;
        for(int i = 0; i < letras.length && flag; i++){
            if(letras[i] == letra){
                flag = true;
            }
        }
        return (flag) ? letra : CONSUMO_ENERGETICO;


    }

    private String comprobarColor(String color){
        String[] colores = {"blanco","negro","rojo","azul","gris"};
        boolean flag = false;
        for(int i = 0; i < colores.length && flag; i++){
            if(colores[i].contentEquals(color.toLowerCase())){
                flag = true;
            }
        }
        return (flag) ? color : COLOR;
    }

    public int precioFinal(){
        int c=0;
        Map<String, Integer> map = new HashMap <String, Integer>();
        map.put("a",100);
        map.put("b",80);
        map.put("c",60);
        map.put("d",50);
        map.put("e",30);
        map.put("f",10);
            if(map.containsKey(CONSUMO_ENERGETICO.toLowerCase())){
                c = map.get(CONSUMO_ENERGETICO.toLowerCase());
            }


        if(peso==0 && peso<=19){
            c += 10;
        }
        else if(peso>=20 && peso<=49){
            c += 50;
        }
        else if(peso>=50 && peso<=79){
            c += 80;
        }
        else{
            c += 100;
        }

        return PRECIO_BASE + c;
    }


}
