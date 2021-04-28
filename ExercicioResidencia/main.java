package ExercicioResidencia;

import OrientaçãoAoObjeto3.Pessoa;

public class main {
    public static void main(String args[]){
        
        //Geração do objeto
        residencia r = new residencia();
        
        // Alimentando os valores do objeto
        r.setTipoResidencia("Apartamento");
        r.setLogradouro("Avenida");
        r.setNomeLogradouro("Sargento Geraldo Sant'Ana");
        r.setNumero(660);
        r.setComplemento("173 A");
        r.setNumeroComodos(3);
        
        System.out.println("Tipo de residência: "+r.getTipoResidencia());
        System.out.println("Endereço: "+r.getLogradouro()+" "+r.getNomeLogradouro()+", "+r.getNumero()+"\nComplemento: "+r.getComplemento());
        System.out.println("Número de cômodos: "+r.getNumeroComodos());
        
    }
}
