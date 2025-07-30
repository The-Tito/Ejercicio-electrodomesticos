import models.Electrodomestico;
import models.Lavadora;
import models.Television;

import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int totalElctrodomesticos = 0;
        int totalLavadoras= 0;
        int totalTelevisiones=0;
        int c=1;

        Electrodomestico[] e = new Electrodomestico[10];
        e[0] = new Television(200,5,"a","rojo",20,1);
        e[1] = new Television(300,5,"a","rojo",20,1);
        e[2] = new Television(400,5,"a","rojo",20,1);
        e[3] = new Television(500,5,"a","rojo",20,1);
        e[4] = new Television(600,5,"a","rojo",20,1);
        e[5] = new Television(800,5,"a","rojo",20,1);
        e[6] = new Lavadora(5,200,40, "a","blanco");
        e[7] = new Lavadora(5,300,40, "a","blanco");
        e[8] = new Lavadora(5,400,40, "a","blanco");
        e[9] = new Lavadora(5,500,40, "a","blanco");


        for (Electrodomestico elemento : e){
            int precio = elemento.precioFinal();
            totalElctrodomesticos += precio;

            if(elemento instanceof Television){
                totalTelevisiones+=precio;
                System.out.println("Television " + (c+=1) + "$ " +precio );
            }
            else if(elemento instanceof Lavadora){
                totalLavadoras+=precio;
                System.out.println("Lavadora " + (c+=1) + "$ " +precio );
            }
            else{
                System.out.println("Electrodomesticos " + (c+=1) + "$ " +precio );
            }
        }

        System.out.println("<------------------------------------------------->");
        System.out.println("Total lavadoras: " + totalLavadoras);
        System.out.println("Total televisiones: " + totalTelevisiones);
        System.out.println("Total Final: " + totalElctrodomesticos);



        /*
        Electrodomestico e = new Electrodomestico();
        Lavadora lavadora = new Lavadora();
        Television television = new Television();

        int peso = 0;
        int carga = 0;
        int resolucion = 0;
        boolean sintonizador;
        String consumoEnergetico;

        Scanner input = new Scanner(System.in);
        consumoEnergetico = input.nextLine();
        peso = input.nextInt();
        resolucion = input.nextInt();
        sintonizador = input.nextInt() == 1;
        System.out.println(television.precioFinal(consumoEnergetico, peso,resolucion,sintonizador));
        */

    }
}