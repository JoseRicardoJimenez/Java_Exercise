package tecatevirus;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tecatevirus {

    public float tasa_recuperacion(int r, int tp) {
        float tr = 0, aux = 0;
        aux = r * 100;
        tr = aux / tp;
        return tr;
    }

    public float tasa_letalidad(int f, int tp) {
        float tl = 0, aux = 0;
        aux = f * 100;
        tl = aux / tp;
        return tl;
    }

    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        Tecatevirus obj1 = new Tecatevirus();
        int r, tp, f;
        float tr, tl;
        int opc;

        do {

            /*System.out.println("1.-Tasa de recuperacion\n "
                    + "2.-Tasa de letalidad\n"
                    + "3.-");
            opc = ing.nextInt();*/
            String[] opciones = {"Ingresar datos", " SALIR"};
            opc = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

            switch (opc) {
                case 0:
                    r = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de recuperados al momento: "));
                    f = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de fallecidos al momento: "));
                    tp = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de positivos al momento: "));
                    tr = obj1.tasa_recuperacion(r, tp);
                    tl = obj1.tasa_letalidad(f, tp);
                    JOptionPane.showMessageDialog(null, "La tasa de recuperacion es de: " + tr + "%"+"\n"+"La tasa de letalidad es del: "+tl+"%");
                    /*System.out.println("Ingresa el total de recuperados al momento: ");
                    r = ing.nextInt();
                    System.out.println("Ingresa el total de positivos al momento: ");
                    tp = ing.nextInt();
                    tr = obj1.tasa_recuperacion(r, tp);
                    System.out.println("La tasa de recueperacion es del: " + tr + "%");*/
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "SELECCIONO SALIR");
                    /*System.out.println("Ingresa el total de fallecidos al momento: ");
                    f = ing.nextInt();
                    System.out.println("Ingresa el total de positivos al momento: ");
                    tp = ing.nextInt();
                    tl = obj1.tasa_letalidad(f, tp);
                    System.out.println("La tasa de letalidad es del: " + tl + "%");*/
                    break;
            }
        } while (opc != 1);
    }

}
