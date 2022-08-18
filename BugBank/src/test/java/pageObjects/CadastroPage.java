package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;

public class CadastroPage {

	public void queAcesseOSistema() {

	}

	public void euClicoNoBotaoRegistrar() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]")).click();

	}

	public void informarNomeEmailSenhaConfirmarSenha(String emailCad, String nome, String senha, String sign) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("cati.maria@gmail.com");
		driver.findElement(By.name("name")).sendKeys("Maria Catarina Gomes");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input")).sendKeys("catiMaria123");
		driver.findElement(By.name("passwordConfirmation")).sendKeys("catiMaria123");
	}

	public void acionarBotaoSaldo() {
		//driver.findElement(By.xpath("//*[@id=\"toggleAddBalance\"]")).click();
	}

	public void clicarNoBotaoCadastrar() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button")).click();
	}

	public void devoVerAMensagemDeContaCriadaComSucesso() {
		driver.findElement(By.id("btnCloseModal")).click();
	}

	@Dado("que eu informe email {string}, senha {string}")
	public void queEuInformeEmailSenha(String email, String senha) {
		driver.findElement(By.name("email")).sendKeys("cati.maria@gmail.com");
		driver.findElement(By.name("password")).sendKeys("catiMaria123");
	}

	public void clicarNoBotaoAcessar() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[1]")).click();
	}

	public void devoSerLogadoComSucesso() {

	}

}