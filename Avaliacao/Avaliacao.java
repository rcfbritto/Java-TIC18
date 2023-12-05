import java.util.List;
import java.util.ArrayList;

public class Medico{
	private String nome;
    private String especialidade;
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public Medico(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}
	 // Método para decidir aplicar procedimentos no paciente
	 public void aplicarProcedimento(Paciente paciente, Procedimento procedimento) {
    System.out.println(this.nome + " aplicou o procedimento " + procedimento.getNome() + " em " + paciente.getNome());
}
    
}
public class Enfermeiro {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Enfermeiro(String nome) {
		super();
		this.nome = nome;
	}
	
}
public class Paciente {
	private String nome;
    private int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Paciente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
    
}
public class Medicamento {
    private String nome;
    private int quantidadeDisponivel;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	public Medicamento(String nome, int quantidadeDisponivel) {
		super();
		this.nome = nome;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}  
}
public class Insumo {
	private String nome;
    private int quantidadeDisponivel;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	public Insumo(String nome, int quantidadeDisponivel) {
		super();
		this.nome = nome;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
}

public class Procedimento {
	private List<Medico> medicosEnvolvidos = new ArrayList<>();
    private List<Enfermeiro> enfermeirosEnvolvidos = new ArrayList<>();
    private List<Medicamento> medicamentosUtilizados = new ArrayList<>();
    private List<Insumo> insumosUtilizados = new ArrayList<>();
    private List<Procedimento> subProcedimentos = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Medico> getMedicosEnvolvidos() {
		return medicosEnvolvidos;
	}
	public void setMedicosEnvolvidos(List<Medico> medicosEnvolvidos) {
		this.medicosEnvolvidos = medicosEnvolvidos;
	}
	public List<Enfermeiro> getEnfermeirosEnvolvidos() {
		return enfermeirosEnvolvidos;
	}
	public void setEnfermeirosEnvolvidos(List<Enfermeiro> enfermeirosEnvolvidos) {
		this.enfermeirosEnvolvidos = enfermeirosEnvolvidos;
	}
	public List<Medicamento> getMedicamentosUtilizados() {
		return medicamentosUtilizados;
	}
	public void setMedicamentosUtilizados(List<Medicamento> medicamentosUtilizados) {
		this.medicamentosUtilizados = medicamentosUtilizados;
	}
	public List<Insumo> getInsumosUtilizados() {
		return insumosUtilizados;
	}
	public void setInsumosUtilizados(List<Insumo> insumosUtilizados) {
		this.insumosUtilizados = insumosUtilizados;
	}
	public List<Procedimento> getSubProcedimentos() {
		return subProcedimentos;
	}
	public void setSubProcedimentos(List<Procedimento> subProcedimentos) {
		this.subProcedimentos = subProcedimentos;
	}
	public Procedimento(String nome, List<Medico> medicosEnvolvidos, List<Enfermeiro> enfermeirosEnvolvidos,
			List<Medicamento> medicamentosUtilizados, List<Insumo> insumosUtilizados,
			List<Procedimento> subProcedimentos) {
		super();
		this.nome = nome;
		this.medicosEnvolvidos = medicosEnvolvidos;
		this.enfermeirosEnvolvidos = enfermeirosEnvolvidos;
		this.medicamentosUtilizados = medicamentosUtilizados;
		this.insumosUtilizados = insumosUtilizados;
		this.subProcedimentos = subProcedimentos;
	} 
}

public class Triagem {
	private List<Procedimento> procedimentosSugeridos = new ArrayList<>();
	 private Enfermeiro enfermeiroResponsavel;
	 private Paciente paciente;
	 private String tipoAtendimento;
	 private boolean urgencia;
	 private Medico medicoResponsavel;
	
	public Enfermeiro getEnfermeiroResponsavel() {
		return enfermeiroResponsavel;
	}
	public void setEnfermeiroResponsavel(Enfermeiro enfermeiroResponsavel) {
		this.enfermeiroResponsavel = enfermeiroResponsavel;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getTipoAtendimento() {
		return tipoAtendimento;
	}
	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}
	public boolean isUrgencia() {
		return urgencia;
	}
	public void setUrgencia(boolean urgencia) {
		this.urgencia = urgencia;
	}
	public Medico getMedicoResponsavel() {
		return medicoResponsavel;
	}
	public void setMedicoResponsavel(Medico medicoResponsavel) {
		this.medicoResponsavel = medicoResponsavel;
	}
	public List<Procedimento> getProcedimentosSugeridos() {
		return procedimentosSugeridos;
	}
	public void setProcedimentosSugeridos(List<Procedimento> procedimentosSugeridos) {
		this.procedimentosSugeridos = procedimentosSugeridos;
	}
	public Triagem(Enfermeiro enfermeiroResponsavel, Paciente paciente, String tipoAtendimento, boolean urgencia,
			Medico medicoResponsavel, List<Procedimento> procedimentosSugeridos) {
		super();
		this.enfermeiroResponsavel = enfermeiroResponsavel;
		this.paciente = paciente;
		this.tipoAtendimento = tipoAtendimento;
		this.urgencia = urgencia;
		this.medicoResponsavel = medicoResponsavel;
		this.procedimentosSugeridos = procedimentosSugeridos;
	} 
}
public class Atendimento{
	private Medico medicoResponsavel;
	private Paciente paciente;
    private Procedimento procedimentoRealizado;
	public Medico getMedicoResponsavel() {
		return medicoResponsavel;
	}
	public void setMedicoResponsavel(Medico medicoResponsavel) {
		this.medicoResponsavel = medicoResponsavel;
	}
	public Procedimento getProcedimentoRealizado() {
		return procedimentoRealizado;
	}
	public void setProcedimentoRealizado(Procedimento procedimentoRealizado) {
		this.procedimentoRealizado = procedimentoRealizado;
	}
	public Atendimento(Medico medicoResponsavel, Procedimento procedimentoRealizado) {
		super();
		this.medicoResponsavel = medicoResponsavel;
		this.procedimentoRealizado = procedimentoRealizado;
	}
    public void realizarAtendimento() {
        medicoResponsavel.aplicarProcedimento(paciente, procedimentoRealizado);
    }   
}
class Plantao {
	private List<Medico> medicosDePlantao = new ArrayList<>();

    public List<Medico> getMedicosDePlantao() {
		return medicosDePlantao;
	}
	public void setMedicosDePlantao(List<Medico> medicosDePlantao) {
		this.medicosDePlantao = medicosDePlantao;
	}
	// Método para adicionar médicos de plantão
    public void adicionarMedico(Medico medico) {
        medicosDePlantao.add(medico);
    }
}
public class SistemaHospital {

	public static void main(String[] args) {
	       
	        Paciente paciente = new Paciente("Maria", 30);
	        Enfermeiro enfermeiro = new Enfermeiro("João");
	        Medico medico = new Medico("Antonio", "obstreta");
	        Medicamento medicamento = new Medicamento("Paracetamol", 2);
	        Insumo insumo = new Insumo("agulha", 300);
	        Procedimento procedimento = new Procedimento();
	        Triagem triagem = new Triagem();
	        Atendimento atendimento = new Atendimento();
	        
	        triagem.setEnfermeiroResponsavel(enfermeiro);
	        triagem.setPaciente(paciente);
	        triagem.setTipoAtendimento("Clínica");
	        triagem.setUrgencia(true);

	        atendimento.setMedicoResponsavel(medico);
	        atendimento.setProcedimentoRealizado(procedimento);

	        procedimento.getMedicosEnvolvidos().add(medico);
	        procedimento.getInsumosUtilizados().add(insumo);
	        
	        System.out.println("Paciente: " + triagem.getPaciente().getNome());
	        System.out.println("Tipo de Atendimento: " + triagem.getTipoAtendimento());
	        System.out.println("É Urgência? " + (triagem.isUrgencia() ? "Sim" : "Não"));
	        System.out.println("Médico Responsável: " + atendimento.getMedicoResponsavel().getNome());
	        System.out.println("Procedimento Realizado: " + atendimento.getProcedimentoRealizado().getNome());
	 }
	 
}
