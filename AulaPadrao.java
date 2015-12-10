
public class AulaPadrao implements Aula{

	
	private String aluno;
	private String professor;
	private String arCondicionado;
	private String cadeira;
	private String mesa;
	@Override
	public void getConsteudo() {
		System.out.println("Introdução");
		
	}
	@Override
	public void getArCondicionado() {
		System.out.println("o Ar Não Funcionou");
		
	}
	@Override
	public void getAndamentoAula() {
		System.out.println("Andamento Normal");
		
	}
	@Override
	public void getAlunos() {
		System.out.println("15 Alunos");
		
	}
}
