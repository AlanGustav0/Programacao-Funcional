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
		 * Aqui temos que converter a lista para um stream (Sequ�ncia de dados) e em
		 * seguida utilizar a fun��o "map" (que aplica uma fun��o a cada elemento da
		 * stream, gerando uma nova stream com os elementos transformados. O map recebe
		 * como arqumento um function, neste caso ser� a classe UpperCaseName e
		 * retornar� uma lista de String atrav�s do collect(Collectors.toList())
		 */
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		System.out.println("Impress�o dos nomes em caixa alta passando fun��o como par�metro:");
		names.forEach(System.out::println);
		System.out.println();

		// Impress�o atrav�s de referencia de m�todo, utilizando m�todo est�tico
		List<String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		System.out.println("Impress�o dos nomes em caixa alta a partir de uma refer�ncia de m�todo est�tico:");
		names.forEach(System.out::println);
		System.out.println();

		// Impress�o atrav�s de referencia de m�todo, utilizando m�todo n�o est�tico
		List<String> names3 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		System.out.println("Impress�o dos nomes em caixa alta a partir de uma refer�ncia de m�todo n�o est�tico:");
		names.forEach(System.out::println);
		System.out.println();

		// Impress�o atrav�s de uma express�o lamda declarada
		List<String> names4 = list.stream().map(func).collect(Collectors.toList());
		System.out.println("Impress�o dos nomes em caixa alta a partir de uma express�o lambda declarada:");
		names.forEach(System.out::println);
		System.out.println();

		// Impress�o atrav�s de uma express�o lamda inline
		List<String> names5 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("Impress�o dos nomes em caixa alta a partir de uma express�o lambda inline:");
		names.forEach(System.out::println);
		System.out.println();

	}

}
