package Classes;

public class coordenador extends Pessoa {

	private int registroFunc;

	public double salario() {
		return 2000;
	}

	public int getRegistroFunc() {
		return registroFunc;
	}

	public void setRegistroFunc(int registroFunc) {
		this.registroFunc = registroFunc;
	}

	@Override
	public String toString() {
		return "coordenador [registroFunc=" + registroFunc + ", nome=" + nome + ", idade=" + idade + "]";
	}

}
