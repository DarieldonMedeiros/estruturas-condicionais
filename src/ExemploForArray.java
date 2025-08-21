public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // for
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }
        // for each
        for (String aluno :  alunos){
            System.out.println("Aluno atual: " + aluno);
        }
    }
}
