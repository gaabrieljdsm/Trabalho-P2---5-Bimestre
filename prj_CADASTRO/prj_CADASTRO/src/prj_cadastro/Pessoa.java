
package prj_cadastro;


public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private String observacao;
    private String campus;
    private String rua;
    private String cidade;
    private String estado;
    private int salario;
    private int estadocivil;
    private int sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

 
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

  
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

  
    public String getObservacao() {
        return observacao;
    }


    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    public int getEstadocivil() {
        return estadocivil;
    }

  
    public void setEstadocivil(int estadocivil) {
        this.estadocivil = estadocivil;
    }

   
    public int getSexo() {
        return sexo;
    }

  
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

  
    public String getCampus() {
        return campus;
    }


    public void setCampus(String campus) {
        this.campus = campus;
    }

 
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

  
    public String getCidade() {
        return cidade;
    }

 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

 
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
