#language: pt
@cadastro
Funcionalidade: Realizar cadastro
  Como consumidor
  Eu quero me cadastrar no site da loja
  Para realizar compras

  Contexto: 
    Dado que eu acessei o site da loja
    E cliquei em Sign In
    E preenchi o campo Email address com "email"
    E cliquei noã botão Create an account


  Cenário: realizar login com sucesso
    Quando na ãsesso YOUR INFORMATION eu selecionar o Title "Mr."
    E preencher o campo First name com "teste"
    E preencher o campo Last name com 
    E preencher o campo Email com 
    E preencher o campo Password name com 
    E selecionar no campo day de date of Birth a opção
    E selecionar no campo mouth de date of Birth a opção 
    E selecionar no campo year de date of Birth a opção
    E marcar a opção Sign up for our newsletter 
    E na sessão YOUR ADDRESS preencher o campo First name com 
    E preencher o campo Last name com 
    E preencher o campo Address com 
    E preencher o campo City com 
    E selecionar no campo State ãa opço
    E preencher o Zip/PostalCode com
    E selecionar no campo Country ãa opço
    E preencher o Mobile Phone com
    E preencher o Assign an address alias for future reference c
    E clicar em Register 