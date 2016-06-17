package POO_Aula5;

/**
 * @author Felipe Rodrigues Gil - 248543
 */
public class CalculoIMC {
    public  double Peso, Altura;
    private double IMC = 0;
    
    public double calcular() {
        this.IMC = (Peso / Math.pow(Altura, 2));
        return this.IMC;
    }
    
    public String mensagem(boolean isMasculino) {        
        String sMessage;

        if (isMasculino) sMessage = new String(this.IMC + " - Homem ");            
        else        sMessage = new String(this.IMC + " - Mulher ");
        
        if (this.IMC < 16.0)      sMessage += "com magreza grave.";
        else if (this.IMC < 17.0) sMessage += "com magreza controlada.";
        else if (this.IMC < 18.5) sMessage += "com magreza leve.";
        else if (this.IMC < 25.0) sMessage += "saudável.";
        else if (this.IMC < 30.0) sMessage += "com sobrepeso.";
        else if (this.IMC < 35.0) sMessage += "com obesidade grau I.";
        else if (this.IMC < 40.0) sMessage += "com obesidade grau II (severa).";
        else                      sMessage += "com obesidade mórbida.";
      
        return sMessage;
    }
}
