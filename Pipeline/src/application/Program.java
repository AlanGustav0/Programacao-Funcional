package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		/*Aqui transformamos a lista em uma nova stream de dados, porém mapeando os elementos e multiplicando todos por 10
			A operação utilizada aqui foi a operação intermediária "map"
		*/
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//Operação que realiza o somatório da lista
		/*
		 * Reduce é uma operação terminal
		 */
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Sum = " + sum);
		
		//Aqui um exemplo de operação intermediária "filter" e operação terminal "collect"
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0).map(x -> x * 10)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
