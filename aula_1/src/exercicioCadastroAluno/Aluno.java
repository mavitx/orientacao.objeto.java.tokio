package exercicioCadastroAluno;

public abstract class Aluno implements Calculavel {

	private String nome, matricula;
	private static double nota;
	private static double nota2;

	public Aluno(String nome, String matricula, double nota, double nota2) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public static double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public static double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public boolean verificarAprovacao() {
		return false;
	}

	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Media: " + nota);

	}

	@Override
	public double calcularMedia(double nota, double nota2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
