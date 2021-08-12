package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		Function<Product, String> func = p -> p.getName().toUpperCase();

		/*
		 * Aqui temos que converter a lista para um stream (Sequência de dados) e em
		 * seguida utilizar a função "map" (que aplica uma função a cada elemento da
		 * stream, gerando uma nova stream com os elementos transformados. O map recebe
		 * como arqumento um function, neste caso será a classe UpperCaseName e
		 * retornará uma lista de String através do collect(Collectors.toList())
		 */
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		System.out.println("Impressão dos nomes em caixa alta passando função como parâmetro:");
		names.forEach(System.out::println);
		System.out.println();

		// Impressão através de referencia de método, utilizando método estático
		List<String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		System.out.println("Impressão dos nomes em caixa alta a partir de uma referência de método estático:");
		names.forEach(System.out::println);
		System.out.println();

		// Impressão através de referencia de método, utilizando método não estático
		List<String> names3 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		System.out.println("Impressão dos nomes em caixa alta a partir de uma referência de método não estático:");
		names.forEach(System.out::println);
		System.out.println();

		// Impressão através de uma expressão lamda declarada
		List<String> names4 = list.stream().map(func).collect(Collectors.toList());
		System.out.println("Impressão dos nomes em caixa alta a partir de uma expressão lambda declarada:");
		names.forEach(System.out::println);
		System.out.println();

		// Impressão através de uma expressão lamda inline
		List<String> names5 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("Impressão dos nomes em caixa alta a partir de uma expressão lambda inline:");
		names.forEach(System.out::println);
		System.out.println();

	}

}
