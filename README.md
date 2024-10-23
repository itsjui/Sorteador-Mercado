Problema e conceito do Projeto:

Sorteamento de itens de um Atacado baseado em popularidade e
recomendações.

Como será?

Vamos por partes:
 A ideia é fazer um sistema simples de atacado com referências em promoções baseadas
em recomendações, teremos então os departamentos:

Interface:
 Atacado seria nossa 1° interface.
 distribuição seria nossa 2° Interface.

Classes Abstratas:
 Departamentos.

Dentro deste escopo teriamos que então criar heranças entre Departamentos e criar as
classes que definem cada Departamento:
 DptBebida
 DptComida
 DptLivros
 DptRoupas
 DptSaude
 DptTecnologia

 O que eles pegarão de Departamento? Regras de negócio. (Funções comuns como
promoções e etc.
 Então cada Departamento terá a lista de objetos que possuem e métodos como verificar,
comprar, guardar, somar o valor de todos os produtos de diversos departamentos.

A ideia é um carrinho de compras que verifica a data ou um pré requisito que vem no
começo do loop que indica a promoção a ser aplicada

 Aqui está um exemplo:
 “Bem vindo! Hoje é <Data>, a Promoção de hoje é em Frutas!
 1: Acessar setor de frutas
 2: Acessar setor de saude
 3: Acessar setor de livros
 4: Acessar setor de tecnologia
 5: Acessar setor de massas
 6: Acessar setor de bebidas
 .
 .
 .
 X: Verificar qual dia é promoção do que (mostra o dia que cada setor é definido)
 X²: Acessar o seu carrinho (tem guardado toda a soma de produtos realizado em cada
dept
 X³: Sair

 Dentro de cada departamento teremos uma lista de itens também selecionáveis

 Exemplo, apertei 1 no menu principal, logo entramos em um segundo menu:

 “Setor de Frutas:
 <Frutas aqui em forma de Switch/Case>
 ao escolher 1 frutas é enviado um comando:
 “deseja adicionar esta fruta ao carrinho?”
 (Preço da fruta já com desconto SE TIVER)
 Y/N
 Ao apertar Y ou N, o carrinho atualiza e o preço é somado
 retornando ao
“Setor de Frutas:
 <Frutas aqui em forma de Switch/Case>
 X: Retornar ao menu principal
 X²: Acessar o seu carrinho
 Ao pressionar para voltar pro menu principal, voltamos ao menu anterior, mas com os
itens em mão, verificáveis pela opção de acessar o carrinho.
