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
		
		/*Aqui Declaramos uma função anônima seguida de uma arrow function para utuilzar a interface Comparator
		 * Onde "comp" é uma função que está recebendo 2 arqumentos (p1 e p2).
		 */
		Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());	
	
		//Aqui ordemos a lista passando a função que já foi comparada
		list.sort(comp);
		
		//E para deixar o códico ainda mais limpo, é possível fazermos conforme o exemplo abaixo,
		//Passando uma expressão Lambda como parâmetro
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		//Aqui fazemos a impressão da lista utilizando o foreach com Method Reference 
		list.forEach(System.out::println);
	}

}
