package src.questao1;


class Aluno{
  private String nome;
  private String matricula;
  private String curso;

  public Aluno(String nome, String matricula, String curso){
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getMatricula(){
    return matricula;
  }

  public void setMatricula(String matricula){
    this.matricula = matricula;
  }

  public String getCurso(){
    return curso;
  }

  public void setCurso(String curso){
    this.nome = curso;
  }

  @Override
  public String toString(){
    return(
      getNome() + "\n" +
      getMatricula() + "\n" +
      getCurso()
    );
  }
}