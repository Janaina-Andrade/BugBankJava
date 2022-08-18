#language: pt
# enconding:UTF-8

Funcionalidade: Pesquisa de produto

@Cadastro
Cenario: Cadastro
Dado que acesse o sistema
Quando eu clico no botao registrar
E informar nome email "cati.maria@gmail.com","Maria Catarina Gomes", senha "catiMaria123", sign "catiMaria123"
E acionar botao Saldo
E clicar no botao Cadastrar
Entao devo ver a mensagem de conta criada com sucesso
Dado que eu informe email "cati.maria@gmail.com", senha "catiMaria123"
E clicar no botao Acessar
Entao devo ser logado com sucesso
