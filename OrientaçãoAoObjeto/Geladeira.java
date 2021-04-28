package OrientaçãoAoObjeto;

public class Geladeira {
    
    //atributos (qualificadores)
    private int litros;
    private int tensão;
    private int temperatura;
    private boolean degelo;
    
    
    
    //métodos (interações)
    public void ajustarLitros(int litros){
        this.litros = litros;
    }
  
  
    public void ajustarTensão(int tensão){
        this.tensão = tensão;
    }
  
  
    public void ajustarTemperatura(int temperatura){
        this.temperatura = temperatura;
    }
    
    public void Degelo(boolean degelo){
        this.degelo = degelo;
    }
  
  
    public void mostrarPainel(){
        System.out.println("Capacidade (litros): " + this.litros);
        System.out.println("Tensão (volts): " + this.tensão);
        System.out.println("Temperatura (celsius): " + this.temperatura + "º");
        
        if(this.degelo){
            System.out.println("Degelo ligado!");
        }else{
            System.out.println("Degelo desligado!");
        }
    }
    
    
}
