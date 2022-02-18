package OrientacaoObjeto.Composicao.MuitoPraMuitos;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Lucas");
		Aluno aluno2 = new Aluno("João");
		Aluno aluno3 = new Aluno("Maria");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("React");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso2);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("curso 1: " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos); //todos os alunos do curso "0" onde o aluno 1 está matriculado
		
		
		for(Curso curso: aluno1.cursos) {
			System.out.println("aluno 1: " + curso.nome);
		}
		
		Curso cursoEncontrado = aluno2.obterCursoPorNome("Java");
		if(cursoEncontrado != null){
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
		
		
	}

}
