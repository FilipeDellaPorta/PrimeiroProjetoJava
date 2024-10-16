# 💳 Projeto Conta Bancária

Este é um projeto simples de **Conta Bancária** desenvolvido em Java como parte de uma aula prática. O programa simula operações bancárias como consulta de saldo, recebimento e transferência de valores.

## 📜 Funcionalidades

O programa permite que o usuário realize as seguintes operações:
- **Consultar saldo**: Exibe o saldo atual da conta.
- **Receber valor**: Adiciona um valor informado pelo usuário ao saldo da conta.
- **Transferir valor**: Deduz um valor informado do saldo da conta, se houver saldo suficiente.
- **Sair**: Encerra o programa.

## 🛠️ Como o programa funciona

1. O usuário é saudado com uma tela inicial que exibe seu nome, tipo de conta e saldo atual.
2. Em seguida, é apresentada um menu de opções:
   - Consultar saldos
   - Receber valor
   - Transferir valor
   - Sair
3. Dependendo da escolha do usuário, o programa executa a operação correspondente. Caso uma entrada inválida seja detectada (como uma opção incorreta ou valores não numéricos), o programa orienta o usuário a inserir os dados corretos.
4. O programa usa a classe `Scanner` para capturar entradas do usuário e realizar as operações de leitura de dados.
