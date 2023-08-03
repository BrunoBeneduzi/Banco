package banco;
import java.util.*;

public class Lista {
	private List<Conta> conta = new ArrayList<>();

	public List<Conta>getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta.add(conta);
	}

	@Override
	public String toString() {
		return "Lista [conta=" + conta + "]";
	}

	


	
	
}