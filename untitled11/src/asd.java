import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class asd extends JFrame{
    private JTextField txtfield;
    private JButton btn_0, btn_4, btn_1, btn_7, btn_div, btn_plus,btn_min, btn_res, btn_2, btn_5, btn_8, btn_umn, btn_6, btn_9, btn_clear, btn_3, btn_float, btn_back;
    private JPanel panek;


    public static void main(String[] args) {
        JFrame frame = new asd();
        frame.setVisible(true);
    }
    public asd() {
        super("calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panek);
        this.setResizable(true);
        this.setBounds(150, 100, 215, 220);
        txtfield.setFocusable(false);

        final int[] num_1 = {0};
        final float[] result = {0};
        final boolean[] resbool = {false};
        final int[] num_2 = {0};
        final String[] operatorClick = new String[1];
        operatorClick[0] = "0";
        txtfield.setText("0");
        btn_1.addActionListener(e -> {
            if (txtfield.getText().equals("0") || resbool[0] == true){
                txtfield.setText("1");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0] == true) {
                txtfield.setText(txtfield.getText() + "1");
                resbool[0] = false;
            }
        });
        btn_2.addActionListener(e -> {
            if (txtfield.getText().equals("0") || resbool[0] == true){
                txtfield.setText("2");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0] == true) {
                txtfield.setText(txtfield.getText() + "2");
                resbool[0] = false;
            }
        });
        btn_3.addActionListener(e -> {
            if (txtfield.getText().equals("0") ||resbool[0] == true){
                txtfield.setText("3");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0] == true) {
                txtfield.setText(txtfield.getText() + "3");
                resbool[0] = false;
            }
        });
        btn_4.addActionListener(e -> {
            if (txtfield.getText().equals("0") || resbool[0] == true){
                txtfield.setText("4");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0] == true) {
                txtfield.setText(txtfield.getText() + "4");
                resbool[0] = false;
            }
        });
        btn_5.addActionListener(e -> {
            if (txtfield.getText().equals("0") || resbool[0] == true){
                txtfield.setText("5");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0] == true) {
                txtfield.setText(txtfield.getText() + "5");
                resbool[0] = false;
            }
        });
        btn_6.addActionListener(e -> {
            if (txtfield.getText().equals("0") || resbool[0] == true){
                txtfield.setText("6");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0] == true) {
                txtfield.setText(txtfield.getText() + "6");
                resbool[0] = false;
            }
        });
        btn_7.addActionListener(e -> {
            if (txtfield.getText().equals("0") || resbool[0] == true){
                txtfield.setText("7");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0] == true) {
                txtfield.setText(txtfield.getText() + "7");
                resbool[0] = false;
            }
        });
        btn_8.addActionListener(e -> {
            if (txtfield.getText().equals("0") || resbool[0] == true){
                txtfield.setText("8");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0] == true) {
                txtfield.setText(txtfield.getText() + "8");
                resbool[0] = false;
            }
        });
        btn_9.addActionListener(e -> {
            if (txtfield.getText().equals("0") || resbool[0] == true){
                txtfield.setText("9");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0]) {
                txtfield.setText(txtfield.getText() + "9");
                resbool[0] = false;
            }
        });
        btn_0.addActionListener(e -> {
            if (txtfield.getText().equals("0") || resbool[0] == true){
                txtfield.setText("0");
                resbool[0] = false;
            }
            else if (!txtfield.getText().equals("0") || resbool[0] ) {
                txtfield.setText(txtfield.getText() + "0");
                resbool[0] = false;
            }
        });
        btn_div.addActionListener(e -> {
            if (operatorClick[0].equals("0")) {
                num_1[0] = Integer.parseInt(txtfield.getText());
                txtfield.setText("0");
                operatorClick[0] = "/";
            }
        });
        btn_plus.addActionListener(e -> {
            if (operatorClick[0].equals("0")) {
                num_1[0] = Integer.parseInt(txtfield.getText());
                txtfield.setText("0");
                operatorClick[0] = "+";
            }
        });
        btn_umn.addActionListener(e -> {
            if (operatorClick[0].equals("0")) {
                num_1[0] = Integer.parseInt(txtfield.getText());
                txtfield.setText("0");
                operatorClick[0] = "*";
            }
        });
        btn_clear.addActionListener(e -> {
            if (operatorClick[0].equals("0")) {
                num_1[0] = Integer.parseInt(txtfield.getText());
                txtfield.setText("0");
                operatorClick[0] = "%";
            }
        });
        btn_min.addActionListener(e -> {
            if (operatorClick[0].equals("0")) {
                num_1[0] = Integer.parseInt(txtfield.getText());
                txtfield.setText("0");
                operatorClick[0] = "-";
            }
        });
        btn_res.addActionListener(e -> {
            num_2[0] = Integer.parseInt(String.valueOf(txtfield.getText()));
            System.out.println(num_1[0]);
            System.out.println(num_2[0]);
            System.out.println(operatorClick[0]);

            if (operatorClick[0].equals("+")){
                result[0] = num_1[0] + num_2[0];
                System.out.println(result[0]);
            }
            if (operatorClick[0].equals("/")){
                result[0] = num_1[0] / num_2[0];
                System.out.println(result[0]);
            }
            if (operatorClick[0].equals("*")){
                result[0] = num_1[0] * num_2[0];
                System.out.println(result[0]);
            }
            if (operatorClick[0].equals("-")){
                result[0] = num_1[0] - num_2[0];
                System.out.println(result[0]);
            }

            txtfield.setText(String.valueOf(result[0]));

            num_1[0] = 0;
            num_2[0] = 0;
            operatorClick[0] = "0";
            resbool[0] = true;
        });
        btn_clear.addActionListener(e -> {
            txtfield.setText("0");
            operatorClick[0] = "0";
            num_1[0] = 0;
            num_2[0] = 0;
        });
        btn_back.addActionListener(e -> {
            if (operatorClick[0].equals("0")) {
                num_1[0] = Integer.parseInt(txtfield.getText());
                num_2[0] = Integer.parseInt(txtfield.getText());
                num_2[0] /= 10;
                num_1[0] /= 10;
                txtfield.setText(String.valueOf(num_1[0]));
            } else {
                txtfield.setText(String.valueOf(num_2[0]));
            }
        });
        btn_float.addActionListener(e -> {
            
        });
    }

}
