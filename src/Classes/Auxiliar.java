package Classes;

public class Auxiliar extends Pessoa {

	private int registroFunc;

	public int getRegistroFunc() {
		return registroFunc;
	}

	public void setRegistroFunc(int registroFunc) {
		this.registroFunc = registroFunc;
	}

	@Override
	public String toString() {
		return "Auxiliar [registroFunc=" + registroFunc + ", nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1000;
	}

}
