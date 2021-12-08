import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {		
		
		Estacionamento pessoa1 = new Estacionamento();
		pessoa1.SetEntrada(30);
		pessoa1.SetSaida(200);
		System.out.println(pessoa1.Preco());
	}
}