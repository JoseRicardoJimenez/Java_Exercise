package Prueba;

import java.util.Scanner;

public class Ejercicio_Operadores {

    Scanner ing = new Scanner(System.in);

    public float Ejercicio_2() {
        //Salario semanal de un empleado
        int Htrabajadas;
        float Shora, Stotal;

        System.out.println("Horas trabajadas por el empleado: ");
        Htrabajadas = ing.nextInt();
        System.out.println("Salario por hora del trabajador: ");
        Shora = ing.nextFloat();

        Stotal = Htrabajadas * Shora;

        System.out.println("El salario total del empleado es de: " + Stotal);
        return 0;
    }

    public int Ejercicio_3() {
        //Averiguar la cantidad de dinero
        float guillermo, luis, juan, tres;

        System.out.println("Ingresar Dinero de Guillermo");
        guillermo = ing.nextFloat();

        luis = guillermo / 2;

        juan = (luis + guillermo) / 2;

        tres = luis + guillermo + juan;

        System.out.println("Guillermo tiene: " + guillermo + " Luis tiene: " + luis + " Juan tiene: " + juan + " Total: " + tres);

        return 0;
    }
    
    public double Ejercicio_4(){
        //Salario mensual de un vendedor
        final int Smensual=1000;
        int Avendidos,Vauto;
        double Comision,Stotal;
        
        System.out.println("Autos vendidos: ");
        Avendidos = ing.nextInt();
        
        Comision = 150*Avendidos;
        
        for(int x=0; x<Avendidos; x++){
            System.out.println("Valor del auto "+x+1+": ");
            Vauto=ing.nextInt();
            Comision = Comision+(Vauto*.05); 
        }
        
        Stotal=Smensual+Comision;
        System.out.println("El salario total es de: "+Stotal);
        
        return 0;
    }
    
    public int Ejercicio_5(){
        //Calificacion final de un estudiante
        double Participacion, Eparcial1, Eparcial2, Efinal, Cfinal;
        System.out.println("Participacion: ");
        Participacion=ing.nextDouble();
        
        System.out.println("Examen Parcial 1: ");
        Eparcial1=ing.nextDouble();
        
        System.out.println("Examen parcial 2: ");
        Eparcial2=ing.nextDouble();
        
        System.out.println("Examen final: ");
        Efinal=ing.nextDouble();
        
        Participacion = Participacion*.10;
        Eparcial1 = Eparcial1*.25;
        Eparcial2 = Eparcial2*.25;
        Efinal = Efinal*.40;
        Cfinal = Participacion+Eparcial1+Eparcial2+Efinal;
        System.out.println("La calificacion final del estudiante es: "+Cfinal);
        
        return 0;
    }
    
    public int Ejercicio_6(){
        double a, b, resultado;
        
        System.out.println("Ingrese el valor de a: ");
        a=ing.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b=ing.nextDouble();
        
        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        
        System.out.println("El resultado es: "+resultado);
        return 0;
    }
    
    public int Ejercicio_7(){
        int Thoras,Semana,dia,hora;
        System.out.println("Ingrese una cantidad de horas: ");
        Thoras = ing.nextInt();
        Semana=Thoras/168;
        dia = Thoras%168/24;
        hora = Thoras%24;
        System.out.println("Semanas: "+Semana+" Días: "+dia+" Horas: "+hora);
        return 0;
    }
    
    public int Ejercicio_8(){
        double a,b,c,resultado1,resultado2;
        
        System.out.println("Dame el valor de a: ");
        a = ing.nextDouble();
        System.out.println("Dame el valor de b: ");
        b = ing.nextDouble();
        System.out.println("Dame el valor de c: ");
        c = ing.nextDouble();
        
        resultado1 = (-b+Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
        resultado2 = (-b-Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
        
        System.out.println("\nLa raiz 1 es: "+resultado1);
        System.out.println("\nLa raiz 2 es: "+resultado2);
        
        return 0;        
    }
    
}
