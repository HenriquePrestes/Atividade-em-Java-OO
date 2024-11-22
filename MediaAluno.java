import javax.swing.JOptionPane;

public class MediaAluno { 
    
    public static void main (String [] args) {
        try {

            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da prova 1 ? ")); //Nota 1
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da prova 2 ?")); //Nota 2 
            double trabalho1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota do trabalho ?")); //Nota trabalho 

            double media = (nota1 + nota2 + trabalho1) / 3;       //Calculo da media
            
            if (media >= 6.0) {                                   //Condição para aluno ser aprovado ou reprovado!
                JOptionPane.showMessageDialog(null, " Aprovado");              
            } else {
                JOptionPane.showMessageDialog(null, "Reprovado");
            }  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Inserir somente números válidos.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }
