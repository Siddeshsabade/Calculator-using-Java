import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Calc {
 private JFrame frame;
 private JTextField textField;
 double int1;
 double int2;
 double total;
 String action;
 String answer;
 public static void main(String[] args) {
 EventQueue.invokeLater(new Runnable() {
 public void run() {
 try {
 Calc window = new Calc();
 window.frame.setVisible(true);
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
 });
 }
 public Calc() {
 initialize();
 }
 private void initialize() {
	 frame = new JFrame("Calculator");
	 frame.setBounds(100, 100, 699, 469);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.getContentPane().setLayout(null);

	 textField = new JTextField();
	 textField.setBounds(10, 10, 644, 63);
	 frame.getContentPane().add(textField);
	 textField.setColumns(10);

	 JButton btn1 = new JButton("1");
	 btn1.addActionListener(new ActionListener() {



	 public void actionPerformed(ActionEvent e) {
	 String number=textField.getText()+btn1.getText();
	 textField.setText(number);



	 }
	 });
	 btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	 btn1.setBounds(27, 103, 106, 44);
	 frame.getContentPane().add(btn1);

	 JButton btn2 = new JButton("2");
	 btn2.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 String number=textField.getText()+btn2.getText();
	 textField.setText(number);
	 }
	 });
	 btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	 btn2.setBounds(153, 103, 106, 44);
	 frame.getContentPane().add(btn2);

	 JButton btn3 = new JButton("3");
	 btn3.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 String number=textField.getText()+btn3.getText();
	 textField.setText(number);
	 }
	 
	 
	 });
	 btn3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	 btn3.setBounds(27, 182, 106, 44);
	 frame.getContentPane().add(btn3);

	 JButton btnPlu = new JButton("+");
	 btnPlu.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 int1=Double.parseDouble(textField.getText());
	 textField.setText("");
	 action="+";
	 }
	 });
	 btnPlu.setFont(new Font("Tahoma", Font.PLAIN, 14));
	 btnPlu.setBounds(457, 103, 106, 44);
	 frame.getContentPane().add(btnPlu);

	 JButton btnClr = new JButton("C");
	 btnClr.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 textField.setText(null);
	 }
	 });
	 btnClr.setFont(new Font("Tahoma", Font.PLAIN, 14));
	 btnClr.setBounds(296, 103, 106, 44);
	 frame.getContentPane().add(btnClr);

	 JButton btnEqu = new JButton("=");
	 btnEqu.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 int2=Double.parseDouble(textField.getText());
	 if (action=="+") {

	 total=int1+int2;
	 answer=String.format("%2f",total);
	 textField.setText(answer);


	 }
	 else if (action=="-") {
	 total=int1-int2;
	 answer=String.format("%2f",total);
	 textField.setText(answer);
	 }

	 else if (action=="X") {

	
	 total=int1*int2;
	 answer=String.format("%2f",total);
	 textField.setText(answer);

	 }

	 else if (action=="/") {

	 total=int1/int2;
	 answer=String.format("%2f",total);
	 textField.setText(answer);

	 }
	 }
	 });
	 btnEqu.setFont(new Font("Tahoma", Font.PLAIN, 14));
	 btnEqu.setBounds(296, 355, 106, 44);
	 frame.getContentPane().add(btnEqu);

	 JButton btnDot = new JButton(".");
	 btnDot.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 String
	number=textField.getText()+btnDot.getText();
	 textField.setText(number);

	 }
	 });
	 btnDot.setFont(new Font("Tahoma", Font.PLAIN, 14));
	 btnDot.setBounds(167, 355, 106, 44);
	 frame.getContentPane().add(btnDot);

	 JButton btnSub = new JButton("-");
	 btnSub.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 int1=Double.parseDouble(textField.getText());
	 textField.setText("");
	 action="-";
	 }
	 });
	 btnSub.setFont(new Font("Tahoma", Font.PLAIN, 14));
	 btnSub.setBounds(457, 169, 106, 44);
	 frame.getContentPane().add(btnSub);

	 JButton btnMul = new JButton("X");
	 btnMul.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
		 int1=Double.parseDouble(textField.getText());
		 textField.setText("");
		 action="X";
		 }
		 });
		 btnMul.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 btnMul.setBounds(457, 238, 106, 44);
		 frame.getContentPane().add(btnMul);

		 JButton btnDiv = new JButton("/");
		 btnDiv.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		 int1=Double.parseDouble(textField.getText());
		 textField.setText("");
		 action="/";
		 }
		 });
		 btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 btnDiv.setBounds(457, 323, 106, 44);
		 frame.getContentPane().add(btnDiv);
		 }
		}
	 