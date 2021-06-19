package src.questao3;

public class pessoa {
  private String nome;
  private pessoa mae;
  private pessoa pai;

  public pessoa(String nome, String nomeMae, String nomePai) {
      this.nome = nome;
      this.mae = new pessoa(nomeMae);
      this.pai = new pessoa(nomePai);
  }

  public pessoa(String nome) {
      this.nome = nome;
      this.mae = null;
      this.pai = null;
  }

  public boolean isIgual(pessoa pessoa) {
      if (this.nome.equals(pessoa.getNome()) && this.getMae().getNome().equals(pessoa.getMae().getNome())) {
          return true;
      }

      return false;
  }

  public boolean isIrmaos(pessoa pessoa) {
      if (this.getPai().getNome().equals(pessoa.getPai().getNome()) && this.getMae().getNome().equals(pessoa.getMae().getNome())) {
          return true;
      }

      return false;
  }

  public boolean isAntecessor(pessoa pessoa) {
      if (((this.getPai() != null && this.getPai().getNome().equals(pessoa.getNome()))
              || (this.getMae() != null && this.getMae().getNome().equals(pessoa.getNome())))
              || ((this.getPai() != null && this.getPai().isAntecessor(pessoa.getPai()))
              || (this.getMae() != null && this.getMae().isAntecessor(pessoa.getMae())))) {
          return true;
      }

      return false;
  }

  /**
   * @return the nome
   */
  public String getNome() {
      return nome;
  }

  /**
   * @param nome
   *            the nome to set
   */
  public void setNome(String nome) {
      this.nome = nome;
  }

  /**
   * @return the mae
   */
  public pessoa getMae() {
      return mae;
  }

  /**
   * @param mae
   *            the mae to set
   */
  public void setMae(pessoa mae) {
      this.mae = mae;
  }

  /**
   * @return the pai
   */
  public pessoa getPai() {
      return pai;
  }

  /**
   * @param pai
   *            the pai to set
   */
  public void setPai(pessoa pai) {
      this.pai = pai;
  }

  @Override
  public String toString() {
      String str = "Nome: " + nome;

      if (this.getMae() != null) {
          str += " Mae: " + this.mae.getNome();
      }

      if (this.getPai() != null) {
          str += " Pai: " + this.pai.getNome();
      }

      return str;
  }
}
