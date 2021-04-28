package OrientaçãoAoObjeto3;


public class Pessoa {
    int x = 0 ; 
    //atributos (privados)
    private String nome;
    private String sobrenome;
    private String sexo;
    private String cpf;
    private String dataNascimento;
    
    //getter do nome
    public String getNome(){
        return this.nome;
    }
    
    //setter do nome
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
  
}
