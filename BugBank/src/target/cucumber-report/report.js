$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Cadastro.feature");
formatter.feature({
  "name": "Pesquisa de produto",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cadastro",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Cadastro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesse o sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroSteps.queAcesseOSistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao registrar",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroSteps.euClicoNoBotaoRegistrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar nome email \"cati.maria@gmail.com\",\"Maria Catarina Gomes\", senha \"catiMaria123\", sign \"catiMaria123\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.informarNomeEmailSenhaSign(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar botao Saldo",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.acionarBotaoSaldo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao Cadastrar",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.clicarNoBotaoCadastrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ver a mensagem de conta criada com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroSteps.devoVerAMensagemDeContaCriadaComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que eu informe email \"cati.maria@gmail.com\", senha \"catiMaria123\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroSteps.queEuInformeEmailSenha(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao Acessar",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.clicarNoBotaoAcessar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ser logado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroSteps.devoSerLogadoComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});