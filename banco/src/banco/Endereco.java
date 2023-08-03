package banco;
import java.util.ArrayList;
import java.util.List;

public class Endereco {
	private String rua, cidade;

	public Endereco(String rua, String cidade) {
		this.rua = rua;
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cidade=" + cidade + "]";
	}


}