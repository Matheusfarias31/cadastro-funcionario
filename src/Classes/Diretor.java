package Classes;

public class Diretor extends Pessoa {

	private int registroFunc;

	public double salario() {
		return 4000;
	}

	public int getRegistroFunc() {
		return registroFunc;
	}

	public void setRegistroFunc(int registroFunc) {
		this.registroFunc = registroFunc;
	}

	@Override
	public String toString() {
		return "Diretor [registroFunc=" + registroFunc + ", nome=" + nome + ", idade=" + idade + "]";
	}

}
