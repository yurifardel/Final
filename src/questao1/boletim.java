package src.questao1;

class boletim extends aluno{
  private double nota_um;
  private double nota_dois;
  private double media;

  public boletim(String nome, String matricula, String curso, double nota_um, double nota_dois){
    super(nome, matricula, curso);
    this.nota_um = nota_um;
    this.nota_dois = nota_dois;
  }

  public double getNotaUm(){
    return nota_um;
  }

  public void setNotaUm(double nota_um){
    this.nota_um = nota_um;
  }

  public double getNotaDois(){
    return nota_dois;
  }

  public void setNotaDois(double nota_dois){
    this.nota_dois = nota_dois;
  }

  public double getMedia(){
    return media;
  }

  public void setMedia(double media){
    this.media = media;
  }

  @Override
  public String toString(){
    double calculo = nota_um + nota_dois;
    this.media = calculo / 2;

    return (
      "nome: " + getNome() + "\n" +
      "curso: " + getCurso() + "\n" +
      "media: "  + media 
    );
  }
  
}
