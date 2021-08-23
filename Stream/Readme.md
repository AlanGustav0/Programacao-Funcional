# Stream

É uma sequência de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
Podemos dizer que as fontes de dados são: coleções, arrays, funções de iteração e recursos de entrada e saída de dados.

## [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)

#### Características
• Declarativa (iteração interna)
O programador informa o que será feito e o processamento é feito internamente

#### Parallel-friendly (imutável -> thread safe)
• O objeto imutável pode ser paralelizável de forma segura

#### Sem efeitos colaterais
• Os dados são consumidos somente à medida que isso for necessário

#### Acesso sequencial
• Não há indices na stream

