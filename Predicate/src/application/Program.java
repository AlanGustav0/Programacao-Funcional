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
		
		//Expressão Lambda Declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		//Exemplo de interface funcional passada por parâmetro, onde foi criada uma classe que implementa a interface Predicate
		list.removeIf(new ProductPredicate());
		
		list.forEach(System.out::println);
		System.out.println();
		
		//Exemplo de implementação através de Method Reference (Referência para método) com método estático que trabalha com arqumento passado por parêmetro.
		list.removeIf(Product::staticProductPredicate);

		list.forEach(System.out::println);
		System.out.println();
		
		//Exemplo de implementação através de Method Reference (Referência para método) com método não estático que trabalha com objeto da própria classe.
		list.removeIf(Product::nonstaticProductPredicate);

		list.forEach(System.out::println);
		System.out.println();
		
		//Exemplo de implementação com expressão Lambda declarada.
		list.removeIf(pred);

		list.forEach(System.out::println);
		System.out.println();
		
		//Exemplo de implementação com expressão Lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);

		list.forEach(System.out::println);

	}

}
