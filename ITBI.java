import javax.swing.JOptionPane;

public class ITBI {
    
    public static void main(String[] args) {
        try {
            double valorpago = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do imóvel R$ :")); //Valor imóvel
            double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal :")); //Valor Venal
            double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do ITBI % ?")); // Porcentagem ITBI

            //Calculando maior valor e imposto
            double maiorValor = (valorpago > valorVenal) ? valorpago : valorVenal;
            double impostoITBI = maiorValor * (porcentagem / 100);

            //Resultado
            JOptionPane.showMessageDialog(null,
            "Maior valor R$: " + maiorValor +
            "\n imposto R$: " + impostoITBI,
            "Calculo final", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e ) {

            JOptionPane.showMessageDialog(null, "Erro, somente valores numéricos.","Erro", JOptionPane.ERROR_MESSAGE ); //Caso digite letras

            
        }

        }

    }
