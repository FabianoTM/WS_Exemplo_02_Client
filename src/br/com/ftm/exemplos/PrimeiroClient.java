package br.com.ftm.exemplos;

public class PrimeiroClient {

	public static void main(String[] args) {
		PrimeiroPortTypeProxy ws = new PrimeiroPortTypeProxy();
		
		try {
			System.out.println(ws.ola("Fabiano"));
		} catch (Exception e) {
			System.out.println("Erro ao chamar o WS.");
		}

	}

}
