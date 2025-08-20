# Estruturas Condicionais em Java

Este projeto contém exemplos práticos de diferentes tipos de estruturas condicionais em Java, demonstrando como usar `if-else`, `switch` tradicional, `switch` com expressões (Java 14+) e operador ternário.

## 📁 Estrutura do Projeto

```cmd
src/
├── CaixaEletronico.java      # Exemplo de if-else simples
├── PlanoOperadora.java       # Exemplo de switch tradicional
├── ResultadoEscolar.java     # Exemplo de operador ternário
└── SistemaMedida.java        # Exemplo de switch com expressões
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

## 🛠️ Como Executar

### Pré-requisitos

- Java JDK 11 ou superior (para switch expressions)
- Compilador Java

## 📚 Conceitos Demonstrados

- **Estruturas de Controle**: if-else, switch
- **Operadores Condicionais**: ternário, comparação
- **Fall-through**: comportamento do switch sem break
- **Switch Expressions**: sintaxe moderna do Java
- **Lógica Condicional**: múltiplas condições e aninhamento

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

## 🔗 Recursos Adicionais

- [Documentação oficial do Java](https://docs.oracle.com/en/java/)
- [Tutorial de estruturas de controle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Switch expressions (Java 14)](https://openjdk.java.net/jeps/361)
