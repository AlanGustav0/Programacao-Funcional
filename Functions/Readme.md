# Functions e Predicate

Neste exemplo, foram realizados 2 commits, o rpimeiro possui a classe ProductService realizando o filtro dos produtos com a letra 'T', porém a classe não estava fechada pára alteração.

No segundo exemplo, passados uma função lambda por parâmetro, e a função criada na classe ProductService recebendo um Predicate, com isso, podemos alterar a função passada por parâmetro sem precisar realizar a manutenção na classe Productservice


# Problema Exemplo

##### Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços somente dos produtos cujo nome
começa com "T".
