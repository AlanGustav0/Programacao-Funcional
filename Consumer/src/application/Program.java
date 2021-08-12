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

		// O foreach � um Default method que recebe um consumer como argumento
		// Nesta a��o o foreach passar� pela lista aplicando a atualiza��o do valor em
		// cada elemento da lista
		list.forEach(new PriceUpdate());

		// Reference Method para impress�o dos produtos da lista
		System.out.println("Valores com 10% de aumento recebendo um consumer como argumento:");
		list.forEach(System.out::println);
		System.out.println();

		// Atualizando dados a partir de um m�todo est�tico
		list.forEach(Product::staticPriceUpdate);
		System.out.println("Valores com 10% de aumento a partir de m�todo est�tico:");
		list.forEach(System.out::println);
		System.out.println();

		// Atualizando dados a partir de um m�todo n�o est�tico
		list.forEach(Product::nonStaticPriceUpdate);
		System.out.println("Valores com 10% de aumento a partir de m�todo n�o est�tico:");
		list.forEach(System.out::println);
		System.out.println();

		// Atualizando dados a partir de uma express�o lambda declarada
		list.forEach(consumer);
		System.out.println("Valores com 10% de aumento a partir de uma express�o lambda declarada:");
		list.forEach(System.out::println);
		System.out.println();

		// Atualizando dados a partir de uma express�o lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		System.out.println("Valores com 10% de aumento a partir de uma express�o lambda inline:");
		list.forEach(System.out::println);
		System.out.println();

	}

}
