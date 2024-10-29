import javax.swing.*;

public class MainForm {


    private JTextField textField1;

    private JButton validarButton;

    private JLabel txtResultado;

    private JLabel txtNome;

    private JPanel mainPanel;

    public static void main(String[] args) {

        //Cria a minha tela (TV)
        JFrame frame = new JFrame("Minha primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setSize(500, 500);
        //Ligar a Tv
        frame.setVisible((true));

    }

}
