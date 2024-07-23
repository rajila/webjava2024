/**
 * 
 */
package webjava2024.rdajila;

import java.util.ArrayList;

import webjava2024.rdajila.poo.Circulo;
import webjava2024.rdajila.poo.Figura;
import webjava2024.rdajila.poo.Triangulo;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola desde Java 2024!!\n");
		
		ArrayList<Figura> figuraList = new ArrayList<>();
		figuraList.add(new Circulo(3.5));
		figuraList.add(new Triangulo(3, 5));
		figuraList.add(new Circulo(5.5));
		figuraList.add(new Triangulo(3.5, 9));
		
		for (Figura _figura : figuraList) {
			System.out.println(_figura.Area());
		}
	}
}