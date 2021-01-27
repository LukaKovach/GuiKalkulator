import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JTextField textFieldRezultat;
    private JPanel panelMain;
    private JButton btnSqrt;
    private JButton btnSedam;
    private JButton btnOsam;
    private JButton btnDevet;
    private JButton btnZbrajanje;
    private JButton btnCetiri;
    private JButton btnPet;
    private JButton btnSest;
    private JButton btnTri;
    private JButton btnZamjena;
    private JButton btnJednako;
    private JButton btnDijeljenje;
    private JButton btnMnozenje;
    private JButton btnOduzimanje;
    private JButton btnJedan;
    private JButton btnDva;
    private JButton btnBack;
    private JButton btnClear;
    private JButton btnPow;
    private JButton btnNula;
    private double broj1 = 0;
    private double broj2 = 0;
    private double broj3 = 0;
    private String broj = "";
    private String operacija = "";

    public Main() {
        btnJedan.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"1"));
        btnDva.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"2"));
        btnTri.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"3"));
        btnCetiri.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"4"));
        btnPet.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"5"));
        btnSest.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"6"));
        btnSedam.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"7"));
        btnOsam.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"8"));
        btnDevet.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"9"));
        btnNula.addActionListener(e -> textFieldRezultat.setText(textFieldRezultat.getText()+"0"));


        btnClear.addActionListener(e -> {
            broj1=0;
            broj2=0;
            textFieldRezultat.setText("");
        });
        btnZbrajanje.addActionListener(e -> {
            broj1 = Double.parseDouble(textFieldRezultat.getText());
            operacija = "+";
            textFieldRezultat.setText("");
        });
        btnOduzimanje.addActionListener(e -> {
            broj1 = Double.parseDouble(textFieldRezultat.getText());
            operacija = "-";
            textFieldRezultat.setText("");
        });
        btnMnozenje.addActionListener(e -> {
            broj1 = Double.parseDouble(textFieldRezultat.getText());
            operacija = "*";
            textFieldRezultat.setText("");
        });
        btnDijeljenje.addActionListener(e -> {
            broj1 = Double.parseDouble(textFieldRezultat.getText());
            operacija = "/";
            textFieldRezultat.setText("");
        });
        btnPow.addActionListener(e -> {
            broj1 = Double.parseDouble(textFieldRezultat.getText());
            operacija = "pow";
            textFieldRezultat.setText("");
        });
        btnSqrt.addActionListener(e -> {
            broj1 = Double.parseDouble(textFieldRezultat.getText());
            textFieldRezultat.setText(String.valueOf(Math.sqrt(broj1)));
        });
        btnBack.addActionListener(e -> {
            broj = textFieldRezultat.getText();
            textFieldRezultat.setText(broj.substring(0, broj.length() - 1));
        });
        btnZamjena.addActionListener(e -> {
            broj3 = Double.parseDouble(textFieldRezultat.getText());
            textFieldRezultat.setText(String.valueOf(-broj3));
        });

        btnJednako.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                broj2 = Double.parseDouble(textFieldRezultat.getText());
                switch (operacija) {
                    case "+" -> textFieldRezultat.setText(String.valueOf(broj1 + broj2));
                    case "-" -> textFieldRezultat.setText(String.valueOf(broj1 - broj2));
                    case "*" -> textFieldRezultat.setText(String.valueOf(broj1 * broj2));
                    case "/" -> textFieldRezultat.setText(String.valueOf(broj1 / broj2));
                    case "pow" -> textFieldRezultat.setText(String.valueOf(Math.pow(broj1, broj2)));
                    default -> System.out.println("NOOB");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setPreferredSize(new Dimension(400,400));
        frame.setContentPane(new Main().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
