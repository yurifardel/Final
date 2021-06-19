package src.questao2;

import java.util.ArrayList;
import java.util.List;

public class list {
  public String nome;

  // public list(String nome){
    
  // }

  List<String> conjunto = new ArrayList<String>();

  public void adiciona(String nome){
    this.nome = nome;
    conjunto.add(this.nome);    
  }

  public String verificar(){
    if(conjunto.contains(this.nome)){
      return "contem no array";
    }else{
      return "não contem";
    }
  }

  public void novoConjunto(){
    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
   for(int i = 0; i < intArray.length; i++){
    System.out.println(intArray[i]);
   }
  }

  @Override
  public String toString(){
    // adiciona("yuri");
    
    return(
      "" + verificar()  
    );
  }
}
