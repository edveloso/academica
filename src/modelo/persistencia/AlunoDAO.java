package modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import modelo.Aluno;

public class AlunoDAO {
	
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	public AlunoDAO() {
		con = new Conexao().getConection();
	}
	
	
	public boolean incluir(Aluno aluno){
		//comando sql enviada para o banco
		String sql = "insert into aluno (matricula, nome) values (?, ?) ";
		try {
			//prepara um comando com prepareStatement a partir de uma conex‹o
			pstm = con.prepareStatement(sql);
			
			//passa os parametros unindo cada caracter especial(?) com o seu indice de 
			//aparecimento na sql
			pstm.setInt(1, aluno.getMatricula());
			pstm.setString(2, aluno.getNome());

			//aqui est‡ executando o comando e retornando a quantidade de registros afetados 
			int result = pstm.executeUpdate();
			
			//true se afetou um ou mais registros
			return result > 0;
		} catch (Exception e) {
			System.out.println("Erro ao incluir aluno " + e.getMessage()); 
			return false;
		}
	}
	
	public boolean deletar(int matricula){
		return false;
	}
	
	public boolean alterar(Aluno aluno){
		return false;
	}
	
	public List<Aluno> listarTodos(){
		return null;
	}
	
	public Aluno getAlunoByMatricula(int matricula){
		return null;
	}
	

}





