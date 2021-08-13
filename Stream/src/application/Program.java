package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		// Exemplo de criação de uma Stream a partir de uma lista
		Stream<Integer> st1 = list.stream();

		// convertendo em um array
		System.out.println(Arrays.toString(st1.toArray()));
		System.out.println();

		// Exemplo de criação de uma Stream com a função map
		Stream<Integer> st2 = list.stream().map(x -> x * 10);

		// Impressão do array após a aplicação da função map
		System.out.println(Arrays.toString(st2.toArray()));
		System.out.println();

		// Criando Stream de Strings a partir de um StreamOf
		Stream<String> st3 = Stream.of("Maria", "Alex", "Pedro");

		System.out.println(Arrays.deepToString(st3.toArray()));
		System.out.println();

		// Aqui criamos uma Stream a partir de um iterate que seria potencialmente
		// infito de acordo com a condição informada
		Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);

		// Para realizar a impressão, foi utilizado o "limit" que possibilita inserir um
		// limite máximo à stream
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		System.out.println();

		// Criação de Stream que gera uma sequência de Fibonnacci
		Stream<Long> st5 = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);

		System.out.println(Arrays.deepToString(st5.limit(10).toArray()));

	}

}
