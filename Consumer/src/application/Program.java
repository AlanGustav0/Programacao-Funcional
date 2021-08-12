package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double factor = 1.1;

		Consumer<Product> consumer = p -> {
			p.setPrice(p.getPrice() * factor);
		};

		// O foreach é um Default method que recebe um consumer como argumento
		// Nesta ação o foreach passará pela lista aplicando a atualização do valor em
		// cada elemento da lista
		list.forEach(new PriceUpdate());

		// Reference Method para impressão dos produtos da lista
		System.out.println("Valores com 10% de aumento recebendo um consumer como argumento:");
		list.forEach(System.out::println);
		System.out.println();

		// Atualizando dados a partir de um método estático
		list.forEach(Product::staticPriceUpdate);
		System.out.println("Valores com 10% de aumento a partir de método estático:");
		list.forEach(System.out::println);
		System.out.println();

		// Atualizando dados a partir de um método não estático
		list.forEach(Product::nonStaticPriceUpdate);
		System.out.println("Valores com 10% de aumento a partir de método não estático:");
		list.forEach(System.out::println);
		System.out.println();

		// Atualizando dados a partir de uma expressão lambda declarada
		list.forEach(consumer);
		System.out.println("Valores com 10% de aumento a partir de uma expressão lambda declarada:");
		list.forEach(System.out::println);
		System.out.println();

		// Atualizando dados a partir de uma expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		System.out.println("Valores com 10% de aumento a partir de uma expressão lambda inline:");
		list.forEach(System.out::println);
		System.out.println();

	}

}
