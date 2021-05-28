package Prueba;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_Condicionales {

    Scanner ing = new Scanner(System.in);

    public int Ejercicio_1() {
        int numero, residuo;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        residuo = numero % 10;
        System.out.println(residuo);
        if (residuo == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "No es un numero multiplo de 10");
        }
        return 0;
    }

    public int Ejercicio_2() {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nunmero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nunmero 2"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El numero " + num1 + " Es mayor");
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "El numero " + num2 + " Es el mayor");
        } else {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        }

        return 0;
    }

    public int Ejercicio_3() {
        char LetraMinus;

        LetraMinus = JOptionPane.showInputDialog("Ingrese un caracter").charAt(0);

        if (Character.isUpperCase(LetraMinus)) {
            JOptionPane.showMessageDialog(null, "La letra ingresada es Mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "La letra ingresada es Minuscula");
        }

        return 0;
    }

    public int Ejercicio_4() {
        double total, compra, desc;

        compra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de la compra"));

        if (compra > 300) {
            desc = compra * .20;
            total = compra - desc;
            JOptionPane.showMessageDialog(null, "Su compra tendra un descuento de: $" + desc + " y el total de su compra es: $" + total);
        } else {
            JOptionPane.showMessageDialog(null, "No alcana descuento, su compra es un total de: $" + compra);
        }
        return 0;
    }

    public int Ejercicio_5() {
        int HorasT, Salario, Hextras;

        HorasT = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas: "));

        if (HorasT <= 40) {
            Salario = HorasT * 16;
            JOptionPane.showMessageDialog(null, "El salario del trabajador es: " + Salario);
        } else {
            Hextras = HorasT - 40;
            Salario = 40 * 16 + (Hextras * 20);
            JOptionPane.showMessageDialog(null, "El salario del trabajador es: " + Salario);
        }

        return 0;
    }

    public int Ejercicio_6() {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero: "));

        if ((num1 % 2 == 1) && (num2 % 2 == 1)) {
            JOptionPane.showMessageDialog(null, "Los numeros son impares");
        } else if ((num1 % 2 == 1 && num2 % 2 == 0) || (num1 % 2 == 0 && num2 % 2 == 1)) {
            JOptionPane.showMessageDialog(null, "Un numero es impar y el otro es par");
        } else {
            JOptionPane.showMessageDialog(null, "Los numeros son Pares");
        }

        return 0;
    }

    public int Ejercicio_7() {
        int num1, num2, num3, aux;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (num2 > num1) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (num3 > num1) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        if (num3 > num2) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        JOptionPane.showMessageDialog(null, "Numero mayor ----> menor " + num1 + " " + num2 + " " + num3);

        return 0;
    }

    public int Ejercicio_8() {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero entre 0 - 99 999"));
        if (numero >= 0 && numero <= 9) {
            JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
        }
        if (numero >= 10 && numero <= 99) {
            JOptionPane.showMessageDialog(null, "El numero tiene 2 cifras");
        }
        if (numero >= 100 && numero <= 999) {
            JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
        }
        if (numero >= 1000 && numero <= 9999) {
            JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras");
        }
        if (numero >= 10000 && numero <= 99999) {
            JOptionPane.showMessageDialog(null, "El numero tiene 5 cifras");
        }
        return 0;
    }

    public int Ejercicio_9() {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dia del mes"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un mes del año "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un año "));

        if (dia <= 30 && dia >= 1) {
            if (mes <= 12 && mes >= 1) {
                if (año <= 2021 && año >= 1920) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + dia + "/" + mes + "/" + año);
                } else {
                    JOptionPane.showMessageDialog(null, "El año ingresado esta fuera de rango");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes que ingreso no es correcto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El dia que ingreso no es correcto.");
        }
        return 0;
    }

    public int Ejercicio_10() {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dia del mes"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un mes del año "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un año "));

        if (mes <= 12 && mes >= 1) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia <= 31 && dia >= 1) {
                    if (año <= 2021 && año >= 1920) {
                        JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta: " + dia + "/" + mes + "/" + año);
                    } else {
                        JOptionPane.showMessageDialog(null, "El año ingresado esta fuera de rango");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El dia ingresado esta fuera de rango");
                }
            } else if (mes == 2) {
                if (dia <= 28 && dia >= 1) {
                    if (año <= 2021 && año >= 1920) {
                        JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta: " + dia + "/" + mes + "/" + año);
                    } else {
                        JOptionPane.showMessageDialog(null, "El año ingresado esta fuera de rango");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El dia ingresado esta fuera de rango");
                }
            } else {
                if(dia<=30 && dia>=1){
                    if(año<=2021 && año>=1920){
                        JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta: "+dia+"/"+mes+"/"+año);
                    }else{
                        JOptionPane.showMessageDialog(null, "El año ingresado esta fuera de rango");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El dia ingresado esta fuera de rango");
                }

            }
        }
        return 0;
    }
    
    public int Ejercicio_11(){
        char opc;
        int num1,num2;
        opc = JOptionPane.showInputDialog("Ingresa la opcion Deseada \nS.suma \nR.resta \nP.producto \nD.division ").charAt(0);
        if(Character.isLowerCase(opc)){
            opc = Character.toUpperCase(opc);
        }
        
        switch(opc){
            case 'S': 
                    int suma;
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                    suma = num1+num2;
                    JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                break;
            case 'R':
                    int resta;
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                    resta = num1-num2;
                    JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                break;
            case 'P':
                    int mult;
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                    mult = num1*num2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: "+mult);
                break;
            case 'D':    
                    double div;
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                    div = num1/num2;
                    JOptionPane.showMessageDialog(null, "La division es: "+div);
                break;
            default:
                    JOptionPane.showMessageDialog(null, "Letra ingresada no es valida");
        }
        
        return 0;
    }
    
    public int Ejercicio_12(){
        int opc;
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion "));
        
        switch(opc){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null, "La calificacion es INSUFICIENTE");
                break;
            case 7: 
                JOptionPane.showMessageDialog(null, "La calificacion es SUFICIENTE");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "La calificacion es BUENA");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "La calificacion es NOTABLE");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "La calificacion es SOBRESALIENTE");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero fuera de rango o no valido");
        }
        
        return 0;
    }
    
    public int Ejercicio_13(){
        int opc, Dinicial = 1000;
        
        do{
        
        opc=Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion. \n1. Ingresar dinero a la cuenta. \n2. Retirar dinero de la cuenta. \n3.Salir"));
                
        switch(opc){
            case 1: 
                    int Ddeposito;
                    Ddeposito=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero"));
                    Dinicial = Dinicial+Ddeposito;
                    JOptionPane.showMessageDialog(null, "Tiene un total de: "+Dinicial);
                break;
            case 2:
                    int Dretiro;
                    Dretiro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a retirar"));
                    if(Dinicial>Dretiro){
                        Dinicial = Dinicial-Dretiro;
                        JOptionPane.showMessageDialog(null, "El total de su saldo es: "+Dinicial);
                    }else{
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente. Ingrese otra cantidad");
                    }                    
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Usted seleccionó SALIR");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Debe teclar unna de las 3 opciones");
        } 
        }while(opc!=3);      
        return 0;
    }
    
    public int Ejercicio_14(){
        float medida;
        int opc;
        
        medida=Float.parseFloat(JOptionPane.showInputDialog("Ingresa una medida"));
        opc=Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion. \n"
                + "1. hectogramos. \n2. decagramo \n3. gramo \n4. decigramo \n5. centigramo \n6. miligramo"));
        
        switch(opc){
            case 1:
                    medida *= 10;
                    JOptionPane.showMessageDialog(null, "La nueva medida Hecto es: "+ medida);
                break;
            case 2:
                    medida *= 100;
                    JOptionPane.showMessageDialog(null, "La nueva medida Deca es: "+ medida);
                break;
            case 3: 
                    medida *= 1000;
                    JOptionPane.showMessageDialog(null, "La nueva medida Gramo es: "+ medida);
                break;
            case 4: 
                    medida *= 10000;
                    JOptionPane.showMessageDialog(null, "La nueva medida Deci es: "+ medida);
                break;
            case 5: 
                    medida *= 100000;
                    JOptionPane.showMessageDialog(null, "La nueva medida Centi es: "+ medida);
                break;
            case 6: 
                    medida *= 1000000;
                    JOptionPane.showMessageDialog(null, "La nueva medida Mili es: "+ medida);
                break;    
            default:
                JOptionPane.showMessageDialog(null, "Error, seleccione una opcion del menú");
                
        }
        return 0;
    }

}
