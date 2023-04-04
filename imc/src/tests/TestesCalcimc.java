package tests;
import control.CalculadoraImc;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class TestesCalcimc{
	CalculadoraImc c;
	@Before
	public void setup() {
		c = new CalculadoraImc();
	}
	@Test
	public void testeAultoPesoBaixoMuitoGrave() {
		Assert.assertEquals("Baixo peso muito grave", c.calcularImc(1.7324, 48,20, "masculino"));
	}
	@Test
	public void testeAultoPesoBaixoMenor() {
		Assert.assertEquals("Baixo peso", c.calcularImc(1.732, 51, 20, "masculino"));
	}
	@Test
	public void testeAultoPesoBaixoMaior() {
		Assert.assertEquals("Baixo peso", c.calcularImc(1.709, 54, 20, "masculino"));
	}
	@Test
	
	public void testeAultoPesoBaixoGraveMenor() {
		Assert.assertEquals("Baixo peso grave", c.calcularImc(1.732, 48,20, "masculino"));
	}
	@Test
	public void testeAultoPesoBaixoGraveMaior() {
		Assert.assertEquals("Baixo peso grave", c.calcularImc(1.7328, 51,20, "masculino"));
	}
	@Test
	public void testeAultoPesoNormalMenor() {
		Assert.assertEquals("Peso normal", c.calcularImc(1.732, 60,20, "masculino"));
	}
	@Test
	public void testeAultoPesoNormalMaior() {
		Assert.assertEquals("Peso normal", c.calcularImc(1.7325, 75,20, "masculino"));
	}
	@Test
	public void testeAultoSobrepesoMenor() {
		Assert.assertEquals("Sobrepeso", c.calcularImc(1.732, 75,20, "masculino"));
	}
	@Test
	public void testeAultoSobrepesoMaior() {
		Assert.assertEquals("Sobrepeso", c.calcularImc(1.7322, 90,20, "masculino"));
	}
	@Test
	public void testeAultoObesidade1Menor() {
		Assert.assertEquals("Obesidade grau I", c.calcularImc(1.732, 90,20, "masculino"));
	}
	@Test
	public void testeAultoObesidade1Maior() {
		Assert.assertEquals("Obesidade grau I", c.calcularImc(1.7322, 105,20, "masculino"));
	}
	@Test
	public void testeAultoObesidade2Menor() {
		Assert.assertEquals("Obesidade grau II", c.calcularImc(1.732, 105,20, "masculino"));
	}
	@Test
	public void testeAultoObesidade2Maior() {
		Assert.assertEquals("Obesidade grau II", c.calcularImc(1.7322, 120,20, "masculino"));
	}
	@Test
	public void testeAultoObesidade3() {
		Assert.assertEquals("Obesidade grau III", c.calcularImc(1.732, 120,20, "masculino"));
	}
	@Test
	public void testeVelhoBaixoPeso() {
		Assert.assertEquals("Baixo peso", c.calcularImc(1.7325, 66, 66, "masculino"));
	}
	@Test
	public void testeVelhoPesoNormalMenor() {
		Assert.assertEquals("Peso normal", c.calcularImc(1.732, 66, 66, "masculino"));
	}
	@Test
	public void testeVelhoPesoNormalMaior() {
		Assert.assertEquals("Peso normal", c.calcularImc(1.7322, 81, 66, "masculino"));
	}
	@Test
	public void testeVelhoSobrepesoMenor() {
		Assert.assertEquals("Sobrepeso", c.calcularImc(1.7318, 81, 66, "masculino"));
	}
	@Test
	public void testeVelhoSobrepesolMaior() {
		Assert.assertEquals("Sobrepeso", c.calcularImc(1.7322, 90, 66, "masculino"));
	}
	@Test
	public void testeVelhoObesidade1Menor() {
		Assert.assertEquals("Obesidade grau I", c.calcularImc(1.7318, 90, 66, "masculino"));
	}
	@Test
	public void testeVelhoObesidade1Maior() {
		Assert.assertEquals("Obesidade grau I", c.calcularImc(1.7322, 105, 66, "masculino"));
	}
	@Test
	public void testeVelhoObesidade2Menor() {
		Assert.assertEquals("Obesidade grau II", c.calcularImc(1.7318, 105, 66, "masculino"));
	}
	@Test
	public void testeVelhoObesidade2Maior() {
		Assert.assertEquals("Obesidade grau II", c.calcularImc(1.7322, 120, 66, "masculino"));
	}
	@Test
	public void testeVelhoObesidade3() {
		Assert.assertEquals("Obesidade grau III", c.calcularImc(1.732, 120, 66, "masculino"));
	}
	@Test
	public void testeVelhaBaixoPeso() {
		Assert.assertEquals("Baixo peso", c.calcularImc(1.7325, 66, 66, "feminino"));
	}
	@Test
	public void testeVelhaPesoNormalMenor() {
		Assert.assertEquals("Peso normal", c.calcularImc(1.732, 66, 66, "feminino"));
	}
	@Test
	public void testeVelhaPesoNormalMaior() {
		Assert.assertEquals("Peso normal", c.calcularImc(1.7322, 81, 66, "feminino"));
	}
	@Test
	public void testeVelhaSobrepesoMenor() {
		Assert.assertEquals("Sobrepeso", c.calcularImc(1.7318, 81, 66, "feminino"));
	}
	@Test
	public void testeVelhaSobrepesolMaior() {
		Assert.assertEquals("Sobrepeso", c.calcularImc(1.7322, 96, 66, "feminino"));
	}
	@Test
	public void testeVelhaObesidade1Menor() {
		Assert.assertEquals("Obesidade grau I", c.calcularImc(1.7318, 96, 66, "feminino"));
	}
	@Test
	public void testeVelhaObesidade1Maior() {
		Assert.assertEquals("Obesidade grau I", c.calcularImc(1.7322, 111, 66, "feminino"));
	}
	@Test
	public void testeVelhaObesidade2Menor() {
		Assert.assertEquals("Obesidade grau II", c.calcularImc(1.7318, 111, 66, "feminino"));
	}
	@Test
	public void testeVelhaObesidade2Maior() {
		Assert.assertEquals("Obesidade grau II", c.calcularImc(1.7322, 126, 66, "feminino"));
	}
	@Test
	public void testeVelhaObesidade3() {
		Assert.assertEquals("Obesidade grau III", c.calcularImc(1.732, 126, 66, "feminino"));
	}
}