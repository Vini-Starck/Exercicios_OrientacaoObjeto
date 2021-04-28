package OrientaçãoAoObjeto3;


public class Main {
    public static void main(String[] args) {
        
        //Geração do objeto
        Pessoa allison = new Pessoa();
        
        // Alimentando os valores do objeto
        allison.setNome("Allison");
        allison.setSobrenome("Alberto");
        allison.setSexo("Masculino");
        allison.setCpf("123.123.123-00");
        allison.setDataNascimento("25/10/1994");
        
        System.out.println("Nome Completo: " + allison.getNome() + " " + allison.getSobrenome());
        System.out.println("Sexo: " + allison.getSexo());
        System.out.println("CPF: " + allison.getCpf());
        System.out.println("Data de nascimento: " + allison.getDataNascimento());
    }
}
