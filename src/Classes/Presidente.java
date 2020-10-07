package Classes;

import javax.swing.JOptionPane;

import Interfaces.Mensagem;

public class Presidente extends Pessoa implements Mensagem {

	String nome = "Matheus Francisco Farias dos Santos";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double salario() {
		return 5000;
	}

	@Override
	public void msg() {
		JOptionPane.showMessageDialog(null, "Bem-vindo Sr. Presidente.");

	}

	@Override
	public String toString() {
		return "Presidente [nome=" + nome + ", idade=" + idade + "]";
	}
}
