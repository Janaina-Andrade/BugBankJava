package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroPage;

import static utils.Utils.*;


public class CadastroSteps {
	CadastroPage cp = new CadastroPage();
	
	@Dado("que acesse o sistema")
	public void queAcesseOSistema() {
	    acessarSistema();
	}

	@Quando("eu clico no botao registrar")
	public void euClicoNoBotaoRegistrar() {
	    cp.euClicoNoBotaoRegistrar();
	}

	@Quando("informar nome email {string},{string}, senha {string}, sign {string}")
	public void informarNomeEmailSenhaSign(String emailCad, String nome, String senha, String sign) {
	    cp.informarNomeEmailSenhaConfirmarSenha(emailCad, nome, senha, sign);
	}

	@Quando("acionar botao Saldo")
	public void acionarBotaoSaldo() {
	   cp.acionarBotaoSaldo();
	}

	@Quando("clicar no botao Cadastrar")
	public void clicarNoBotaoCadastrar() {
	    cp.clicarNoBotaoCadastrar();
	}

	@Entao("devo ver a mensagem de conta criada com sucesso")
	public void devoVerAMensagemDeContaCriadaComSucesso() {
		cp.devoVerAMensagemDeContaCriadaComSucesso();
	    
	}

	@Dado("que eu informe email {string}, senha {string}")
	public void queEuInformeEmailSenha(String email, String senha) {
		cp.queEuInformeEmailSenha(email, senha);
	}

	@Quando("clicar no botao Acessar")
	public void clicarNoBotaoAcessar() {
	    cp.clicarNoBotaoAcessar();
	}

	@Entao("devo ser logado com sucesso")
	public void devoSerLogadoComSucesso() {
	    
	}


}
