package Classes;

public class Gerente extends Pessoa {

	private int registroFunc;

	public double salario() {
		return 3000;
	}

	public int getRegistroFunc() {
		return registroFunc;
	}

	public void setRegistroFunc(int registroFunc) {
		this.registroFunc = registroFunc;
	}

	@Override
	public String toString() {
		return "Gerente [registroFunc=" + registroFunc + ", nome=" + nome + ", idade=" + idade + "]";
	}

}
