# Persistence

<h2 align=center>Cadastro de produtos e pedidos em um portal de e-commerce</h2>

*Sobre o projeto:*
<p>Para inicializar a infra do projeto</p>
Basta abrir o terminal na pasta do projeto, dar um docker-compose up para start dos container Mysql e Redis.

<p> Criamos um projeto com spring boot porque ele já utiliza uma infraestrutura para trabalhar com o banco de dados e o gerenciamento de dependências, além de tornar possível uma aplicação rodando em produção rapidamente com o esforço mínimo de configuração e implantação.</p>

<p>
    <li>My Sql - banco de dados relacional </li>
	<br>
	![print1](prints /BancoLoja.png)
	<br>
    <li>Redis - oferece um conjunto de estruturas versáteis de dados na memória que permite a fácil criação de várias aplicações personalizadas.</li>
    <li>Registro de cache para agilizar as buscas</li>
    <li>Swagger - usado para documentação e testes para validação do retorno dos métodos</li>
	<a href="http://localhost:8080/swagger-ui.html">Documentação Swagger aqui</a>
	<br>
	![print1](prints /Swagger.png)
</p>

*Funcionalidades:*
<p>
 <b>Cliente Controller</b> 
  <p>
    Possui uma lista de pedidos.
   	<br>
    Pode ter mais de um endereço cadastrado.
</p>
*Métodos:*
  	<li>getAllClientes - lista todos os clientes</li>
    <li>getClienteById - busca do cliente pelo id</li>
    <li>insertCliente - cadastro de novos clientes</li>
    <li>deleteCliente - excluír um cliente da base pelo id</li>
	<li>updateCliente - atualizar um cliente da base pelo id</li>
</p>

<p>
 <b>Produto Controller</b> 
  <p>
    Possui nome, quantidade e valor.
</p>
*Métodos:*
  	<li>getAllProdutos - lista todos os produtos</li>
    <li>getProdutoById - busca do produto pelo id</li>
    <li>addProduto - cadastro de novos produtos</li>
    <li>deleteArticle - excluír um produto da base pelo id</li>
	<li>updateProduto - atualizar um produto da base pelo id</li>
</p>

<p>
 <b>Pedido Controller</b> 
  <p>
    Possui uma lista de itens e foi criado um modelo para eles.
    <br>
    Possui uma data, um cliente associado ao pedido e uma lista de itens.
</p>
*Métodos:*
  	<li>getAllPedidos - lista todos os pedidos</li>
    <li>findPedido - busca do pedido pelo id</li>
    <li>addPedido - cadastro de novos pedidos</li>
    <li>deletePedido - excluír um pedido da base pelo id</li>
</p>
