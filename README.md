Avaliação Prática 

Instruções Gerais:

Cada questão deve ser resolvida com código em Java.
O foco é na aplicação correta do padrão, não em bibliotecas externas ou interfaces gráficas. Não há necessidade de implementação de intefaces de usuário.
Documente seu código com comentários que expliquem as escolhas de projeto. Justifique a escolha do Padrão de Projeto implementado.
A avaliação é individual
A entrega deve ocorrer até o dia 06/10/2025, 23h59, impreterivelmente.
Entregue o link para o seu repositório de código.


Questão 1 
Uma empresa de logística precisa desenvolver um sistema de cálculo de tarifas para diferentes tipos de transporte: terrestre, aéreo e marítimo.

Cada modalidade tem regras próprias para determinar o valor da entrega (por exemplo, transporte terrestre leva em conta distância em quilômetros, enquanto aéreo utiliza peso da carga).

Implemente uma solução que permita tratar todos os tipos de transporte de forma genérica, mas que ao mesmo tempo respeite as regras específicas de cada modalidade.

Questão 2 
Uma plataforma de pagamentos deve permitir a integração com diferentes meios, como cartão de crédito, boleto bancário e PIX.

A escolha do meio de pagamento deve ser configurável e o sistema precisa instanciar dinamicamente o processador correspondente sem que o código principal da aplicação precise conhecer detalhes da criação de cada objeto.

Implemente uma solução que atenda a esse requisito.

Questão 3 
Um site de notícias deseja implementar um recurso onde os leitores podem se inscrever em determinados tópicos (política, esportes, tecnologia).

Sempre que uma nova notícia for publicada em um tópico, todos os leitores interessados devem receber uma notificação automática.

Implemente uma solução que suporte múltiplos tópicos e múltiplos leitores, sem exigir que o site mantenha manualmente o controle de quem deve ser notificado.

Questão 4 
Um sistema de pedidos online precisa gerar relatórios de vendas em diferentes formatos.

Inicialmente, o relatório contém apenas informações básicas (lista de pedidos).

Posteriormente, o gestor pode decidir adicionar funcionalidades adicionais, como estatísticas de faturamento, gráficos ou exportação em PDF.

Esses recursos devem ser opcionais e adicionados de forma flexível, sem alterar o código existente do relatório básico.

Implemente uma solução que permita essa extensão progressiva de funcionalidades.
