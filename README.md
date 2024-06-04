## PROJETO CONTA-BANCO

Projeto feito para o bootcamp de java da dio.

## Estrutura do projeto

No projeto pede a criação de variáveis e usar a classe scanner para colocar valores nas variáveis de forma dinâmica.

- `Número`: Inserir o número da conta bancária.
- `Agência`: Inserir a agência bancária.
- `Nome`: Inserir o nome completo do usuário.
- `Saldo`: Inserir qual valor inicial para depósito na nova conta criada no banco.

Encontrei uma dificuldade em colocar o nome completo usando o next().

> System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = scanner.next();

  Dessa maneira eu pesquisei e aprendi que seria melhor usar o nextLine(), mas havia outro problema, pois o nextLine após inserir o valor da agência ele pulava a linha e deixava o nome em branco sem conteúdo.

  Por isso usei nextLine em todos os anteriores de nome completo, para que não houvesse erro. E deixei apenas o saldo que era posterior do nome completo, como nextDouble().

  >System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();
  
  >System.out.println("Por favor, qual o valor deseja depositar inicialmente: ");
        double saldo = scanner.nextDouble();      

## Projeto feito por Lucas Cunha Martins.