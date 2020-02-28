
public class Principal {
	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		
		Aluno a1 = new Aluno("Augusto","123456",18);
		Aluno a2 = new Aluno("Pedro","133769",19);
		Aluno a3 = new Aluno("Henrique","420690",170);
		
		vetor.adiciona(a1);
		vetor.adiciona(a2);
		vetor.adiciona(0,a3);
		
		int tamanho = vetor.tamanho();
		
		if(tamanho!=3) {
			System.out.println("tamanho errado");
		}
		
		if(!vetor.contem(a1)) {
			System.out.println("aluno nao encontrado");
		}
		
		vetor.remove(0);
		tamanho = vetor.tamanho();
		
		if(tamanho!=2) {
			System.out.println("tamanho errado");
		}
		
		if(vetor.contem(a3)) {
			System.out.println("um aluno nao deveria estar na lista");
		}
	}
}
