# Sistema de Gerenciamento de Produtos (Java)

## Requisitos
- Java 11+

## Como Executar
1. Compile os arquivos com:
   ```sh
   javac modelo/*.java consoleapp/usecase/*.java
   ```

2. Crie uma classe main ou use testes para rodar o serviço.

## Estrutura
- `modelo/Produto.java`: entidade principal.
- `consoleapp/usecase/`: lógica da aplicação, incluindo interfaces, implementação do serviço e repositório em memória.