# Estruturas Condicionais e Laços de Repetição em Java

Este projeto contém exemplos práticos de estruturas condicionais e laços de repetição em Java, demonstrando como usar `if-else`, operador ternário, `switch` tradicional e `switch` com expressões (Java 14+), além de laços `for`, `while`, `do-while` e `for-each`.

## 📁 Estrutura do Projeto

```cmd
src/
├── CaixaEletronico.java      # Exemplo de if-else simples
├── PlanoOperadora.java       # Exemplo de switch tradicional
├── ResultadoEscolar.java     # Exemplo de operador ternário
├── SistemaMedida.java        # Exemplo de switch com expressões
├── ExemploBreakContinue.java # Exemplo de break e continue em laços
├── ExemploDoWhile.java       # Exemplo de do-while com tentativa de ligação
├── ExemploFor.java           # Exemplo de for simples (contagem)
├── ExemploForArray.java      # Exemplo de for e for-each em arrays
└── ExemploWhile.java         # Exemplo de while com gastos de mesada
```

## 🚀 Exemplos Implementados

### 1. CaixaEletronico.java

Demonstra o uso de **if-else** para verificar saldo bancário:

- Verifica se o valor solicitado é menor que o saldo disponível
- Executa a operação de saque se houver saldo suficiente
- Exibe mensagem de erro caso contrário

**Características:**

- Uso de `if-else` simples
- Operações matemáticas com variáveis `double`
- Saída condicional baseada em comparação

### 2. PlanoOperadora.java

Ilustra o uso de **switch tradicional** para planos de operadora:

- Implementa fall-through (sem `break` statements)
- Demonstra a execução em cascata dos casos
- Ordem decrescente de grandeza dos planos

**Características:**

- Switch statement clássico
- Fall-through behavior
- Múltiplos casos executando sequencialmente

### 3. ResultadoEscolar.java

Exemplifica o uso de **operador ternário aninhado**:

- Avalia notas escolares usando operador ternário
- Implementa lógica de aprovação, recuperação e reprovação
- Demonstra operador ternário com múltiplas condições

**Características:**

- Operador ternário (`? :`)
- Lógica condicional aninhada
- Avaliação de múltiplas faixas de notas

### 4. SistemaMedida.java

Mostra o uso de **switch com expressões** (Java 14+):

- Utiliza switch expression com arrow syntax
- Retorna valores diretamente do switch
- Inclui caso default para valores não mapeados

**Características:**

- Switch expression moderno
- Arrow syntax (`->`)
- Retorno direto de valores

### 5. ExemploBreakContinue.java

Demonstra o uso de **break** e **continue** em laços `for`:

- Interrompe o laço ao encontrar um valor específico com `break`
- Pula uma iteração específica usando `continue`
- Exibe a diferença prática entre interromper e apenas ignorar a iteração

**Características:**

- Palavras-chave `break` e `continue`
- Controle de fluxo dentro de laços
- Condicional `if` dentro do `for`

### 6. ExemploDoWhile.java

Exemplo de **do-while** que simula tentativas de ligação até alguém atender:

- Garante execução do bloco ao menos uma vez (`do-while`)
- Usa `java.util.Random` para simular a aleatoriedade do atendimento
- Continua repetindo enquanto ninguém atender

**Características:**

- Estrutura `do { ... } while (condição)`
- Função auxiliar que retorna `boolean`
- Saída no console indicando o fluxo de execução

### 7. ExemploFor.java

Demonstra um laço **for** simples de contagem:

- Conta de 1 até 20 imprimindo cada valor
- Exibe mensagem final após a conclusão do laço

**Características:**

- Laço `for` com inicialização, condição e incremento
- Impressão sequencial

### 8. ExemploForArray.java

Mostra como iterar arrays com **for** tradicional e **for-each**:

- Itera por índices e acessa elementos do array
- Itera diretamente pelos valores com `for-each`
- Exibe o índice atual e o valor correspondente

**Características:**

- Manipulação de arrays de `String`
- Diferença entre `for` e `for-each`
- Uso de `alunos.length`

### 9. ExemploWhile.java

Simula compras de doces com **while** até a mesada acabar:

- Gera valores aleatórios para o preço do doce
- Garante que a compra não ultrapasse a mesada restante
- Imprime cada compra e o término da mesada

**Características:**

- Laço `while` com condição de parada
- Uso de `ThreadLocalRandom` para números aleatórios
- Operações aritméticas e atualização de estado

## 🛠️ Como Executar

### Pré-requisitos

- Java JDK 11 ou superior (para switch expressions)
- Compilador Java

## 📚 Conceitos Demonstrados

- **Estruturas de Controle**: if-else, switch
- **Estruturas de Repetição**: for, while, do-while
- **Operadores Condicionais**: ternário, comparação
- **Fall-through**: comportamento do switch sem break
- **Switch Expressions**: sintaxe moderna do Java
- **Lógica Condicional**: múltiplas condições e aninhamento
- **Iteração sobre Arrays**: for tradicional e for-each
- **Controle de Fluxo em Laços**: break e continue
- **Aleatoriedade**: uso de `Random` e `ThreadLocalRandom`

## 🎯 Objetivos de Aprendizado

Este projeto visa demonstrar:

1. Diferentes formas de implementar lógica condicional
2. Vantagens e desvantagens de cada abordagem
3. Boas práticas na implementação de estruturas condicionais
4. Evolução da sintaxe do Java para estruturas de controle

## 📝 Observações

- O projeto `PlanoOperadora` demonstra o comportamento de fall-through do switch
- `SistemaMedida` utiliza recursos do Java 14+ (switch expressions)
- Todos os exemplos são autocontidos e podem ser executados independentemente
- Os valores das variáveis podem ser modificados para testar diferentes cenários
- Os exemplos `ExemploFor`, `ExemploWhile`, `ExemploDoWhile`, `ExemploForArray` e `ExemploBreakContinue` demonstram laços de repetição e controle de fluxo

## 🔗 Recursos Adicionais

- [Documentação oficial do Java](https://docs.oracle.com/en/java/)
- [Tutorial de estruturas de controle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Switch expressions (Java 14)](https://openjdk.java.net/jeps/361)
