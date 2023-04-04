package control;

public class CalculadoraImc {
	public String calcularImc(double altura, double p, int idade, String sexo) {
		double imc = p/(altura*altura);
		if (idade < 20) {
			return("Idade invalida, A calculadora só opera com pessoas acima de 20 anos");
		}
		else if (idade <= 65) {
			if (imc < 16) return "Baixo peso muito grave";
			else if (imc < 17) return "Baixo peso grave";
			else if (imc < 18.5) return "Baixo peso";
			else if (imc < 25) return "Peso normal";
			else if (imc < 30) return "Sobrepeso";
			else if (imc < 35) return "Obesidade grau I";
			else if (imc < 40) return "Obesidade grau II";
			else return "Obesidade grau III";
		}
		else{
			if ("masculino".equals(sexo.toLowerCase())){
				if (imc < 22) return "Baixo peso";
				else if (imc <= 27) return "Peso normal";
				else if (imc <= 30) return "Sobrepeso";
				else if (imc <= 35) return "Obesidade grau I";
				else if (imc < 40) return "Obesidade grau II";
				else return "Obesidade grau III";
			}
			else if ("feminino".equals(sexo.toLowerCase())){
				imc = p/(altura*altura);
				if (imc < 22) return "Baixo peso";
				else if (imc <= 27) return "Peso normal";
				else if (imc <= 32) return "Sobrepeso";
				else if (imc <= 37) return "Obesidade grau I";
				else if (imc < 42) return "Obesidade grau II";
				else return "Obesidade grau III";
			}
			return "Sexo invalido";
		}
	}
}