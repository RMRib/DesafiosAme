#language: pt
@login
Funcionalidade: Realizar Login
  Como consumidor
  Eu quero fazer login no site da loja
  Para realizar compras

  Contexto: 
    Dado que eu acessei o site da loja
    E cliquei em Sign in

  @basico
  Cenário: realizar login com sucesso
    Quando eu preencher o campo Email address com "rico.amr@gmail.com"
    E preencher o campo Password com "teste"
    E clicar no botão Sign in
    Então o acesso ao site é concedido
    E a página "MY ACCOUNT" é exibida

  @exceção
  Esquema do Cenário: realizar login com <scenario>
    Quando eu preencher o campo Email address com "<email>"
    E preencher o campo Password com "<password>"
    E clicar no botão Sign in
    Então o acesso a conta é negado
    E a mensagem "<mensagem>" é exibida

    Exemplos: 
      | scenario           | email        | password | mensagem                   |
      | Login negado       | zzzz@zzz.com | aabcd    | Authentication failed.     |
      | Email inválido     | zzzz         |     1234 | Invalid email address.     |
      | Email em branco    |              |          | An email address required. |
      | Password em branco | zzzz@zzz.com |          | Password is required.      |
