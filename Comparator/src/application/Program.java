package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Notebook",3000.00));
		list.add(new Product("Tablet",450.00));
		
		/*Aqui Declaramos uma fun��o an�nima seguida de uma arrow function para utuilzar a interface Comparator
		 * Onde "comp" � uma fun��o que est� recebendo 2 arqumentos (p1 e p2).
		 */
		Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());	
	
		//Aqui ordemos a lista passando a fun��o que j� foi comparada
		list.sort(comp);
		
		//E para deixar o c�dico ainda mais limpo, � poss�vel fazermos conforme o exemplo abaixo,
		//Passando uma express�o Lambda como par�metro
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		//Aqui fazemos a impress�o da lista utilizando o foreach com Method Reference 
		list.forEach(System.out::println);
	}

}
