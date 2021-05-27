package Prueba;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_Bucles {

    Scanner ing = new Scanner(System.in);

    public int Ejercicio_1() {
        int num = 0, cuadrado;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        while (num >= 0) {

            cuadrado = (int) Math.pow(num, 2);
            JOptionPane.showMessageDialog(null, "El cuadrado del numero " + num + " es: " + cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        }
        return 0;
    }

    public int Ejercicio_2() {
        int num = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero positivo o negativo o un 0 para salir"));

        while (num != 0) {
            if (num < 0) {
                JOptionPane.showMessageDialog(null, "El numero " + num + " es NEGATIVO");
            } else {
                JOptionPane.showMessageDialog(null, "El numero " + num + " es POSITIVO");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero positivo o negativo o un 0 para salir"));
        }
        return 0;
    }

    public int Ejercicio_3() {
        int residuo, num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero o un 0 si desea salir"));
        while (num != 0) {
            residuo = num % 2;
            if (residuo == 0) {
                JOptionPane.showMessageDialog(null, "El numero " + num + " es PAR");
            } else {
                JOptionPane.showMessageDialog(null, "El numero " + num + " es IMPAR");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero o un 0 si desea salir"));
        }
        return 0;
    }

    public int Ejercicio_4() {
        int contador = 0, num = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        while (num >= 0) {
            contador++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        }
        JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " numeros");

        return 0;
    }

    public int Ejercicio_5() {
        Random rand = new Random();
        int ran, num, contador = 0;

        ran = (int) (rand.nextDouble() * 100 + 0);
        System.out.println(ran);
        num = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero que esta entre el 1 y el 100. \nIntroduce un numero para comenzar"));
        while (num != ran) {
            if (num > ran) {
                num = Integer.parseInt(JOptionPane.showInputDialog("PISTA: El numero es MENOR, sigue intentando. \nIntroduce un numero para continuar"));
            } else {
                num = Integer.parseInt(JOptionPane.showInputDialog("PISTA: El numero es MAYOR, sigue intentando. \nIntroduce un numero para continuar"));
            }
            contador++;
        }
        JOptionPane.showMessageDialog(null, "¡FELICIDADES! Acertaste el numero. \nnecesitaste de " + contador + " intentos!.");

        return 0;
    }

    public int Ejercicio_6() {
        int num, suma = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los numero que desees sumar. \n O un 0 si deseas salir"));

        while (num != 0) {
            suma += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los numero que desees sumar. \n O un 0 si deseas salir"));
        }
        JOptionPane.showMessageDialog(null, "La suma total de los numeros es: " + suma);

        return 0;
    }

    public int Ejercicio_7() {
        int num = 0, suma = 0, contador = 0;
        float prom;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (num >= 0) {
            contador++;
            suma += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
        if (contador == 0) {
            System.out.println("Hubo un error vuelve a intentarlo");
        } else {
            prom = (float) suma / contador;
            JOptionPane.showMessageDialog(null, "El promedio es: " + prom);
        }
        return 0;
    }

    public int Ejercicio_8() {
        int N, R = 0;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));

        do {
            R++;
            System.out.println(R);
        } while (R != N);
        return 0;
    }

    public int Ejercicio_9() {
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
        return 0;
    }

    public int Ejercicio_10() {
        int suma = 0, num;

        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Agregar un numero"));
            suma += num;
        }
        System.out.println("El total de la suma es: " + suma);
        return 0;
    }

    public int Ejercicio_11() {
        long producto = 1;

        for (int i = 1; i <= 20; i += 2) {
            producto *= i;
        }
        System.out.println("El producto es: " + producto);
        return 0;
    }

    public int Ejercicio_12() {
        int fact = 1, num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Numero a calcular: "));

        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("FACTORIAL: " + fact);
        return 0;
    }

    public int Ejercicio_13() {
        int num = 0, sumaP = 0, sumaN = 0, cont = 0, contN = 0, contP = 0;
        float medP, medN;
        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            if (num == 0) {
                cont++;
            } else if (num < 0) {
                sumaN += num;
                contN++;
            } else {
                sumaP += num;
                contP++;
            }
        }

        medN = (float) sumaN / contN;
        medP = (float) sumaP / contP;
        System.out.println("Promedio de numeros negativos: " + medN);
        System.out.println("Promedio de numeros positivos: " + medP);
        System.out.println("Cantidad de ceros ingresados: " + cont);
        return 0;
    }

    public int Ejercicio_14() {
        float sueldo, suma = 0;
        int cont = 0;

        for (int i = 1; i <= 10; i++) {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite un sueldo"));
            suma += sueldo;
            if (sueldo > 1000) {
                cont++;
            }
        }
        System.out.println("Total de los sueldos= $" + suma);
        System.out.println("Sueldo mayor a 1000 dolares: " + cont);
        return 0;
    }

    public int Ejercicio_15() {
        float altura, edadM = 0, alturaM = 0, sumaA = 0;
        int edad, cont = 0, sumaE = 0, contA = 0, contE = 0;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura"));
            sumaA += altura;
            sumaE += edad;
            cont++;
            if (edad > 18) {
                contE++;
            }
            if (altura > 1.75) {
                contA++;
            }
        }
        edadM = (float) sumaE / cont;
        alturaM = sumaA / cont;
        System.out.println("Edad media: " + edadM + " y Altura media: " + alturaM);
        System.out.println("Mayores de 18 años: " + contE + " y Mayores de 1.75: " + contA);
        return 0;
    }

    public int Ejercicio_16() {
        int num, res = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Elija un numero del 1 al 10"));
        if (num > 0 && num < 11) {
            for (int i = 1; i <= 10; i++) {
                res = num * i;
                System.out.println(num + "*" + i + "=" + res);
            }
        } else {
            JOptionPane.showMessageDialog(null, "oiga tiene que ser un numero del 1 al 10 >.<");
        }
        return 0;
    }

    public int Ejercicio_17() {
        int codA, cantidadV_L, precioL, factura = 0, total = 0, suma = 0, cont = 0;

        do {
            codA = Integer.parseInt(JOptionPane.showInputDialog("Codigo del Articulo"));
            cantidadV_L = Integer.parseInt(JOptionPane.showInputDialog("Cantidad vendida en litros"));
            if (codA == 1) {
                suma += cantidadV_L;
            }
            precioL = Integer.parseInt(JOptionPane.showInputDialog("Precio por litro"));
            if (precioL * cantidadV_L > 600) {
                cont++;
            }
            total = total + (precioL * cantidadV_L);
            factura++;
        } while (factura != 5);
        System.out.println("Facturacion total: " + total);
        System.out.println("\n" + suma);
        System.out.println("Facturas mayores a $600: " + cont);
        return 0;
    }

    public int Ejercicio_18() {
        int codA, cantidadV_L, factura = 0, suma = 0, cont = 0;
        float total = 0, precioL=0;
        do {
            codA = Integer.parseInt(JOptionPane.showInputDialog("Codigo del Articulo"));
            switch(codA){
                case 1: precioL=0.6f; break;
                case 2: precioL= 3f; break;
                case 3: precioL= 1.25f; break;
            }           
            cantidadV_L = Integer.parseInt(JOptionPane.showInputDialog("Cantidad vendida en litros"));
            total=(float)(total+(precioL*cantidadV_L));
            if(precioL*cantidadV_L>600){
                cont++;
            }
            if (codA == 1) {
                suma += cantidadV_L;
            }
            factura++;
        } while (factura != 5);
        
        System.out.println("Facturacion total: " + total);
        System.out.println("\n" + suma);
        System.out.println("Facturas mayores a $600: " + cont);
        return 0;
    }
    
    public int Ejercicio_19(){
        int aprobados=0, condi=0, suspensos=0;
        float prom;
        
        for(int i=0; i<6; i++){
            prom=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del estudiante"));
            if(prom<=10){
                if(prom<4){
                    suspensos++;
                }else{
                    if(prom<5){
                        condi++;
                    }else{
                        aprobados++;
                    }
                }
            }else{
                i=i-1;
                JOptionPane.showMessageDialog(null, "El dato ingresado no corresponde al rango de evaluacion");
            }            
        }
        System.out.println("La cantidad de aprobados es: "+aprobados);
        System.out.println("La cantidad de condicionados es: "+condi);
        System.out.println("La cantidad de suspensos es: "+suspensos);
        return 0;
    }
    
    public int Ejercicio_20(){
        int num=0, sueldo=0, sueldo_maximo=0;
            
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos que desea capturar"));
        
        for(int i=0; i<num; i++){
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Capturar sueldo"));
            if(sueldo>sueldo_maximo){
                sueldo_maximo=sueldo;
            }
        }
        System.out.println("El sueldo maximo es: "+sueldo_maximo);
        return 0;
    }
    
    public int Ejercicio_21(){
        int num;
        boolean negativo=false;
        
        for(int i=0; i<10; i++){
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if(num<0){
                negativo=true;
            }
        }   
        
        if(negativo == true){
            System.out.println("Hay numeros negativos");
        }else{
            System.out.println("No hay numeros negativos");
        }
        return 0; 
    }
    
    public int Ejercicio_22(){
        int calif;
        boolean suspenso=false;
        
        for(int i=0; i<5; i++){
            calif=Integer.parseInt(JOptionPane.showInputDialog("Calificacion de alumnos"));
            if(calif<10 && calif>0){
                if(calif<5){
                    suspenso=true;
                }
            }else{
                i=i-1;
                JOptionPane.showMessageDialog(null, "Ingresa una nota valida");
            }
        }
        if(suspenso==true){
            System.out.println("Hay al menos un alumno suspenso");
        }else{
            System.out.println("No hay ningun alumno suspenso");
        }
        return 0;
    }
}
