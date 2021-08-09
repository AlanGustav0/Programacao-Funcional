package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Mouse",50.00));
		list.add(new Product("Tablet",350.50));
		list.add(new Product("HD Case",80.90));
		
		//Express�o Lambda Declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		//Exemplo de interface funcional passada por par�metro, onde foi criada uma classe que implementa a interface Predicate
		list.removeIf(new ProductPredicate());
		
		list.forEach(System.out::println);
		System.out.println();
		
		//Exemplo de implementa��o atrav�s de Method Reference (Refer�ncia para m�todo) com m�todo est�tico que trabalha com arqumento passado por par�metro.
		list.removeIf(Product::staticProductPredicate);

		list.forEach(System.out::println);
		System.out.println();
		
		//Exemplo de implementa��o atrav�s de Method Reference (Refer�ncia para m�todo) com m�todo n�o est�tico que trabalha com objeto da pr�pria classe.
		list.removeIf(Product::nonstaticProductPredicate);

		list.forEach(System.out::println);
		System.out.println();
		
		//Exemplo de implementa��o com express�o Lambda declarada.
		list.removeIf(pred);

		list.forEach(System.out::println);
		System.out.println();
		
		//Exemplo de implementa��o com express�o Lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);

		list.forEach(System.out::println);

	}

}
