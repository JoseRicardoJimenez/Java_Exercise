package Prueba;

import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class Ejercicio_Matrices {
    
    Scanner ing = new Scanner(System.in);
    
    public int prueba(){
        int matriz[][], nFil, nCol;
        
        nFil=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de filas"));
        nCol=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de columnas"));
        
        matriz = new int[nFil][nCol];
        
        for(int i=0; i<nFil; i++){
            for(int j=0; j<nCol; j++){
                System.out.println("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j]=ing.nextInt();
            }
        }
        
        System.out.println("La matriz es: ");
        for(int i=0; i<nFil; i++){
            for(int j=0; j<nCol; j++){
                System.out.println("Matriz ["+i+"] ["+j+"]: "+matriz[i][j]);
            }
        }
        
        return 0;
    }
    
}
