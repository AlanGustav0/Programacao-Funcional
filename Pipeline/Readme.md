# Pipeline

### Pipeline são operações Stream que retornam novas streams de dados. Onde é possível criar uma cadeia de operações
(fluxos de processamento).

#### • Operações intermediárias e terminais

O pipeline é composto por zero ou mais elementos intermediários e uma terminal

### Operações intermediárias:

• Produzem uma nova stream (encadeamento)
• Só executam quando uma operação terminal é invocada (lazy evaluation)

### Operações terminais:

• Produzem um objeto não-stream (coleção ou outro)
• Determinam o fim do processamento stream

# Exemplos de operações intermediárias: 

• filter
• map
• flatmap
• peek
• distinct
• sorted
• skip
• limit (*)

# Exemplos de operações terminais:

• forEach
• forEachOrdered
• toArray
• reduce
• collect
• min
• max
• count
• anyMatch (*)
• allMatch (*)
• noneMatch (*)
• findFirst (*)
• findAny (*)

* [short-circuit](https://www.geeksforgeeks.org/short-circuiting-in-java-with-examples/)

