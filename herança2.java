package heranca;

//Classe que tem os atributos compartilhados 
class DadosGerais {
 // Atributos compartilhados
 private String Nome;
 private String CPF;
 private String aniversario;
 
 // Construtor para inicializar os atributos
 public DadosGerais(String Nome, String CPF, String aniversario) {
     this.Nome = Nome;
     this.CPF = CPF;
     this.aniversario = aniversario;
 }
 
 // Métodos getter e setter para acessar e modificar os atributos
 public String getNome() {
     return Nome;
 }

 public void setNome(String Nome) {
     this.Nome = Nome;
 }

 public String getCPF() {
     return CPF;
 }

 public void setCPF(String CPF) {
     this.CPF = CPF;
 }

 public String getAniversario() {
     return aniversario;
 }

 public void setAniversario(String aniversario) {
     this.aniversario = aniversario;
 }

 // Método que retorna as informações
 public String exibir() {
     return " Nome: " + Nome + "\nNúmero do CPF: " + CPF + " \nDia que nasceu: " + aniversario;
 }
}

//Classe Gerente com atributos EXCLUSIVOS
class Gerente extends DadosGerais {
 // Atributos EXCLUSIVOS
 private String dataAdmissao;
 private float baseSalarial;
 private String setor;

 // Construtor para inicializar os atributos
 public Gerente(String Nome, String CPF, String aniversario, String dataAdmissao, float baseSalarial, String setor) {
     super(Nome, CPF, aniversario);
     this.dataAdmissao = dataAdmissao;
     this.baseSalarial = baseSalarial;
     this.setor = setor;
 }

 // Métodos getter e setter
 public String getDataAdmissao() {
     return dataAdmissao;
 }

 public void setDataAdmissao(String dataAdmissao) {
     this.dataAdmissao = dataAdmissao;
 }

 public float getBaseSalarial() {
     return baseSalarial;
 }

 public void setBaseSalarial(float baseSalarial) {
     this.baseSalarial = baseSalarial;
 }

 public String getSetor() {
     return setor;
 }

 public void setSetor(String setor) {
     this.setor = setor;
 }

 // Método para exibir as informações 
 public String exibir() {
     return super.exibir() + "\nDia que foi Admitido: " + dataAdmissao + "\nValor do Salário Base: " + baseSalarial + "\nSetor que trabalha: " + setor;
 }
}

//Classe Funcionario com atributos EXCLUSIVO
class Funcionario extends DadosGerais {
 // Atributos adicionais
 private String dataAdmissao;
 private float baseSalarial;
 private double comissao;

 // Construtor para inicializar os atributos
 public Funcionario(String Nome, String CPF, String aniversario, String dataAdmissao, float baseSalarial, double comissao) {
     super(Nome, CPF, aniversario);
     this.dataAdmissao = dataAdmissao;
     this.baseSalarial = baseSalarial;
     this.comissao = comissao;
 }

 // Métodos getter e setter
 public String getDataAdmissao() {
     return dataAdmissao;
 }

 public void setDataAdmissao(String dataAdmissao) {
     this.dataAdmissao = dataAdmissao;
 }

 public float getBaseSalarial() {
     return baseSalarial;
 }

 public void setBaseSalarial(float baseSalarial) {
     this.baseSalarial = baseSalarial;
 }

 public double getComissao() {
     return comissao;
 }

 public void setComissaoPercentual(double comissao) {
     this.comissao = comissao;
 }

 // Método para exibir as informações
 public String exibir() {
     return super.exibir() + "\nDia que foi Admitido: " + dataAdmissao + "\nValor do Salário Base: " + baseSalarial + "\nPercentual da Comissão: " + comissao + "%";
 }
}

//Classe Consumidor com atributos EXCLUSIVOS
class Consumidor extends DadosGerais {
 // Atributos exclusivos
 private String contato;
 private String cartao;
 private String telefone;

 // Construtor para inicializar os atributos
 public Consumidor(String Nome, String CPF, String aniversario, String contato, String cartao, String telefone) {
     super(Nome, CPF, aniversario);
     this.contato = contato;
     this.cartao = cartao;
     this.telefone = telefone;
 }

 // Métodos getter e setter
 public String getContato() {
     return contato;
 }

 public void setContato(String contato) {
     this.contato = contato;
 }

 public String getCartao() {
     return cartao;
 }

 public void setCartao(String cartao) {
     this.cartao = cartao;
 }

 public String getTelefone() {
     return telefone;
 }

 public void setTelefone(String telefone) {
     this.telefone = telefone;
 }

 // Método para exibir as informações
 public String exibir() {
     return super.exibir() + "\nEmail: " + contato + "\nNúmero do Cartão: " + cartao + " \nNúmero do Telefone: " + telefone;
 }
}

public class herança2 {
 public static void main(String[] args) {
     // Colocando objetos com valores atribuídos
     Funcionario f1 = new Funcionario("Carlos", "111.222.333-44", "05/03/1985", "15/04/2020", 3000f, 5);
     Gerente g1 = new Gerente("Alice", "555.666.777-88", "20/07/1978", "10/09/2018", 5000f, "Vendas");
     Consumidor c1 = new Consumidor("Roberto", "999.888.777-66", "25/12/1990", "roberto@gmail.com", "4567 8910 1234 5678", "9988-7766");
     
     // Exibindo as informações 
     System.out.println(f1.exibir());
     System.out.println("------------------");
     System.out.println(g1.exibir());
     System.out.println("------------------");
     System.out.println(c1.exibir());
 }
}