/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO2 {
    
    /*Se desea eliminar todos los números duplicados de una lista o vector (array).
    4 7 11 4 9 5 11 7 3 5 ha de cambiarse a 4 7 11 9 5 3
    Escribir un método que elimine los elementos duplicados de un array.*/
    
    public static void main(String[] args)
	{
		String array[]={"4","7","11","4","9","5","11","7","3","5"};
 
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1;j++){
				if(i!=j){
					if(array[i]==array[j]){
						// eliminamos su valor
						array[i]="";
					}
				}
			}
		}
 
		// mostramos unicamente los que tienen valor
		int n=array.length;
		for (int k=0;k<=n-1;k++){
			if(array[k]!=""){
                        JOptionPane.showMessageDialog(null,array[k]);
			}
		}
	}
    
}
