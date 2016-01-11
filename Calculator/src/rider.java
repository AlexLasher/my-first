import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rider extends JFrame{
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
	JLabel l1, l2, l3;
	JTextField t1, t2;
	
	int i, k, l;
	String a, b;
	eHandler handler = new eHandler();
	
	public rider(String s){
		super(s);
		setLayout(null);
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b13 = new JButton("0");
		b10= new JButton("C");	
		b11= new JButton("=");
		b12= new JButton("+");
		l1 = new JLabel("¬ведите первое число:");
		l2 = new JLabel("¬ведите второе число:");
		l3 = new JLabel("");
		t1 = new JTextField(25);
		b10.setBackground(new Color(237,146,148));
		b1.setBounds(40,60,45,35);
		b2.setBounds(90,60,45,35);
		b3.setBounds(140,60,45,35);
		b4.setBounds(40,100,45,35);
		b5.setBounds(90,100,45,35);
		b6.setBounds(140,100,45,35);
		b7.setBounds(40,140,45,35);
		b8.setBounds(90,140,45,35);
		b9.setBounds(140,140,45,35);
		b13.setBounds(90,180,45,35);
		b12.setBounds(215,60,45,35);
		b10.setBounds(215,220,45,35);
		b11.setBounds(215,180,45,35);
		t1.setBounds(40, 10, 220, 30);
		add(l1);
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b13);
		add(b10);
		add(b11);
		add(b12);
		add(l3);
		b2.addActionListener(handler);
		b1.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b10.addActionListener(handler);
		b11.addActionListener(handler);
		b12.addActionListener(handler);
		b13.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1){
					if(i==0){
						t1.setText("1");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"1");
					i = Integer.parseInt(t1.getText());
				}	
				if(e.getSource()==b2){
					if(i==0){
						t1.setText("2");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"2");
					i = Integer.parseInt(t1.getText());				
				}
				if(e.getSource()==b3){
					if(i==0){
						t1.setText("3");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"3");
					i = Integer.parseInt(t1.getText());
				}if(e.getSource()==b4){
					if(i==0){
						t1.setText("4");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"4");
					i = Integer.parseInt(t1.getText());
				}if(e.getSource()==b5){
					if(i==0){
						t1.setText("5");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"5");
					i = Integer.parseInt(t1.getText());
				}if(e.getSource()==b6){
					if(i==0){
						t1.setText("6");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"6");
					i = Integer.parseInt(t1.getText());
				}if(e.getSource()==b7){
					if(i==0){
						t1.setText("7");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"7");
					i = Integer.parseInt(t1.getText());
				}
				if(e.getSource()==b8){
					if(i==0){
						t1.setText("8");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"8");
					i = Integer.parseInt(t1.getText());
				}
				if(e.getSource()==b9){
					if(i==0){
						t1.setText("9");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"9");
					i = Integer.parseInt(t1.getText());
				}
				if(e.getSource()==b13){
					if(i==0){
						t1.setText("0");
						i = Integer.parseInt(t1.getText());
					}else
					t1.setText(i+"0");
					i = Integer.parseInt(t1.getText());
				}
				if(e.getSource()==b10){
					i = i-i;
					t1.setText("0");
					
				}
				if(e.getSource()==b12){
					k = i;
					i=i-i;
					t1.setText("0");
				}
				if(e.getSource()==b11){
					l=i+k;
					
					t1.setText(""+l);
				}
		}
		
	}
}