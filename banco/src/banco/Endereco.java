package banco;
import java.util.ArrayList;
import java.util.List;
//teste
public class Endereco {
	private String rua, cidade;

	public Endereco(String rua, String cidade) {
		this.rua = rua;
		this.cidade = cidade;
	}
//teste
	public String getRua() {
		return rua;
	}
//teste
	public void setRua(String rua) {
		this.rua = rua;
	}
//teste
	public String getCidade() {
		return cidade;
	}
//teste
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
//aqui
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cidade=" + cidade + "]";
	}

//teste 
}
