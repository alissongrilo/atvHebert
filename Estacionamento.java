public class Estacionamento {
	private int Placa = 0;
	private String Modelo = "";
	private int HoraEntrada = 0;
	private int HoraSaida = 0;

	public void SetPlaca(int Num) {
		this.Placa = Num;
	}

	public void SetModelo(String Mod) {
		this.Modelo = Mod;
	}

	public void SetEntrada(int Entra) {
		this.HoraEntrada = Entra;
	}

	public void SetSaida(int Sai) {
		this.HoraSaida = Sai;
	}

	public int GetPlaca() {
		return (Placa);
	}

	public String GetModelo() {
		return (Modelo);
	}

	public int GetEntrada() {
		return (HoraEntrada);
	}

	public int GetSaida() {
		return (HoraSaida);
	}

	public void Imprimir() {
		System.out.println(this.Placa);
		System.out.println(this.Modelo);
		System.out.println(this.HoraEntrada);
		System.out.println(this.HoraSaida);
	}

	public float Preco() {
		return (float) ((HoraSaida - HoraEntrada) * 1.5);
	}
}