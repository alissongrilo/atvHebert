public class Pessoa {

	private String nome;
	private Float altura;
	private int AnoNascimento;

	public void SetNome(String nome) {
		this.nome = nome;
	}

	public void SetAltura(Float altura) {
		this.altura = altura;
	}

	public void SetNascimento(int nasc) {
		this.AnoNascimento = nasc;
	}

	public String GetNome() {
		return (nome);
	}

	public Float GetAltura() {
		return (altura);
	}

	public int GetNascimento() {
		return (AnoNascimento);
	}

	public void Imprimir() {
		System.out.println(this.nome);
		System.out.println(Float.toString(this.altura));
		System.out.println(String.valueOf(this.AnoNascimento));
	}

	public int CalcularIdade() {
		return (2021 - this.AnoNascimento);
	}
}