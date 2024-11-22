import javax.swing.JOptionPane;

public class Aposentadoria {
    
    public static void main(String[] args) {  
        try {
                                                                                                        //Dados do usuário
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade ? "));
        String sexo = JOptionPane.showInputDialog(null,"Digite seu sexo,  (M) Masculino ou (F) Feminino").toUpperCase();
        int contribuicao = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos de contribuição você tem :"));

        int idaddeminima = (sexo.equals("M")) ? 65 : 62 ;              //M : 65 anos F : 62 anos
        int contribuicaominima = (sexo.equals("M")) ? 35 : 30;         //M : 35, F: 30

        if (idade >= idaddeminima || contribuicao >= contribuicaominima) {
            JOptionPane.showMessageDialog(null, "Você pode se aposentar.");         //Condição para aposentar
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode se aposentar.");     
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Inserir números válidos", "ERRO", JOptionPane.ERROR_MESSAGE);
    }
    }
}
