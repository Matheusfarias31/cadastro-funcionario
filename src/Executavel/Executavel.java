package Executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Classes.Auxiliar;
import Classes.Diretor;
import Classes.Gerente;
import Classes.Presidente;
import Classes.coordenador;

public class Executavel {
	public static void main(String[] args) {

		try {
			// loop
			String entrar = JOptionPane.showInputDialog("Digite:\n1- para entrar no sistema \n0 - sair do sistema");
			Integer entrar2 = Integer.valueOf(entrar);

			while (entrar2 != 0 && entrar2 == 1) {

				Presidente presidente = new Presidente();
				// interface
				presidente.msg();

				List<Auxiliar> auxiliar = new ArrayList<Auxiliar>();

				// collections
				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do auxiliar " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual a idade do funcionario? ");
					String registro = JOptionPane.showInputDialog("Qual o número de registro do funcionario?");

					Auxiliar aux1 = new Auxiliar();
					aux1.setNome(nome);
					aux1.setIdade(Integer.valueOf(idade));
					aux1.setRegistroFunc(Integer.valueOf(registro));

					auxiliar.add(aux1);

				}

				List<coordenador> coordenador = new ArrayList<coordenador>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do coordenador " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual a idade do funcionario? ");
					String registro = JOptionPane.showInputDialog("Qual o número de registro do funcionario?");

					coordenador coord1 = new coordenador();
					coord1.setNome(nome);
					coord1.setIdade(Integer.valueOf(idade));
					coord1.setRegistroFunc(Integer.valueOf(registro));

					coordenador.add(coord1);

				}

				List<Gerente> gerente = new ArrayList<Gerente>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do gerente " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual a idade do funcionario? ");
					String registro = JOptionPane.showInputDialog("Qual o número de registro do funcionario?");

					Gerente gerente1 = new Gerente();
					gerente1.setNome(nome);
					gerente1.setIdade(Integer.valueOf(idade));
					gerente1.setRegistroFunc(Integer.valueOf(registro));

					gerente.add(gerente1);

					System.out.println();

				}

				List<Diretor> diretor = new ArrayList<Diretor>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do diretor " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual a idade do funcionario? ");
					String registro = JOptionPane.showInputDialog("Qual o número de registro do funcionario?");

					Diretor dir1 = new Diretor();
					dir1.setNome(nome);
					dir1.setIdade(Integer.valueOf(idade));
					dir1.setRegistroFunc(Integer.valueOf(registro));
					dir1.salario();

					diretor.add(dir1);

					JOptionPane.showMessageDialog(null,
							"Suas informações:\n Nome: " + presidente.getNome() + "\nSálario: " + presidente.salario());

				}

				JOptionPane.showMessageDialog(null,
						"Lista de funcionarios\n----------------------------------\nCargo: Auxiliar\n" + auxiliar
								+ "\n----------------------------------\nCargo: Coordenador\n" + coordenador
								+ "\n----------------------------------\nCargo: Gerente\n" + gerente
								+ "\n----------------------------------\nCargo: Diretor\n" + diretor);
				System.exit(0);

			}

			if (entrar2 != 0 && entrar2 != 1) {
				JOptionPane.showMessageDialog(null, "Valor digitado não é valido, reiniciar o programa!");
			}

			// classe de exceção
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Mensagem de erro:\nNenhum campo pode ficar vazio.");

			e.printStackTrace();
		} finally {
			JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema!");
		}
	}
}
