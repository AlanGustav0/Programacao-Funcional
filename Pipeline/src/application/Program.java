package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		/*Aqui transformamos a lista em uma nova stream de dados, por�m mapeando os elementos e multiplicando todos por 10
			A opera��o utilizada aqui foi a opera��o intermedi�ria "map"
		*/
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//Opera��o que realiza o somat�rio da lista
		/*
		 * Reduce � uma opera��o terminal
		 */
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Sum = " + sum);
		
		//Aqui um exemplo de opera��o intermedi�ria "filter" e opera��o terminal "collect"
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0).map(x -> x * 10)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
