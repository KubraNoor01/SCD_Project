package TheSherry;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class calculatortask extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField etInput;
	private JButton btnDell;
	private JButton btnDivi;
	private JButton btnunderoot;
	private JButton btnsquare;
	private JButton btnSquare;
	private JButton btnhalf;
	private JButton btnminus;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnmultiply;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btnSum;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btnequal;
	private JButton btn0;
	private ButtonGroup buttonGroup;
	private JButton btnpoint;
	private JButton btnClear;
	private JLabel lbIndicator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatortask frame = new calculatortask();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculatortask() {
		setTitle("calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 651);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0,0,0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etInput = new JTextField();
		etInput.setBounds(72, 48, 440, 35);
		contentPane.add(etInput);
		etInput.setColumns(10);
		lbIndicator = new JLabel("Buttons are disabled. Please turn on the Calculator ");
		lbIndicator.setBounds(124, 246, 365, 32);
		contentPane.add(lbIndicator);
		JRadioButton ridOff = new JRadioButton("off");
		ridOff.setBackground(new Color(0,0,0));
		ridOff.setFont(new Font("Tahoma", Font.BOLD, 12));
		ridOff.setBounds(72, 157, 111, 23);
		contentPane.add(ridOff);
		
		JRadioButton ridOn = new JRadioButton("on");
		ridOn.setBackground(new Color(0,0,0));
		ridOn.setFont(new Font("Tahoma", Font.BOLD, 12));
		ridOn.setBounds(72, 120, 111, 23);
		contentPane.add(ridOn);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(348, 45, 0, 23);
		contentPane.add(tabbedPane);
		 
        

        buttonGroup = new ButtonGroup();
        buttonGroup.add(ridOff);
        buttonGroup.add(ridOn);

        lbIndicator.setVisible(false);
        etInput.setVisible(false);
        ridOff.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 etInput.setText("");
            	 setComponentsVisible(false);
        
            	
            }
        });

        ridOn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	etInput.setText("");
            	setComponentsVisible(true);
            }
        });
		
        btnDell = new JButton("DELL");
        btnDell.setBackground(new Color(0, 0, 0));
		

		
		btnminus = new JButton("-");
		btnminus.setBackground(new Color(0, 0, 0));
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnminus.setBounds(410, 213, 69, 35);
		contentPane.add(btnminus);
		
		btn7 = new JButton("   7");
		btn7.setForeground(new Color(0,0,0));
		btn7.setBackground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(114, 289, 69, 35);
		contentPane.add(btn7);
		
		btn8 = new JButton("    8");
		btn8.setForeground(new Color(0,0,0));
		btn8.setBackground(new Color(0, 0, 0));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(220, 289, 69, 35);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setForeground(new Color(0,0,0));
		btn9.setBackground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(314, 289, 69, 35);
		contentPane.add(btn9);
		
		btnmultiply = new JButton("  *");
		btnmultiply.setBackground(new Color(0, 0, 0));
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmultiply.setBounds(410, 289, 69, 35);
		contentPane.add(btnmultiply);
		
		btn6 = new JButton("    6");
		btn6.setForeground(new Color(0,0,0));
		btn6.setBackground(new Color(0, 0, 0));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(114, 378, 69, 35);
		contentPane.add(btn6);
		
		btn5 = new JButton("  5");
		btn5.setForeground(new Color(0,0,0));
		btn5.setBackground(new Color(0, 0, 0));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(220, 378, 69, 35);
		contentPane.add(btn5);
		
		btn4 = new JButton("4");
		btn4.setForeground(new Color(0,0,0));
		btn4.setBackground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(314, 378, 69, 35);
		contentPane.add(btn4);
		
		btnSum = new JButton("+");
		btnSum.setBackground(new Color(0, 0, 0));
		
		btnSum.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSum.setBounds(410, 378, 69, 35);
		contentPane.add(btnSum);
		
		btn3 = new JButton("3");
		btn3.setForeground(new Color(0,0,0));
		btn3.setBackground(new Color(0, 0, 0));
		btn0 = new JButton("          0");
		btn0.setForeground(new Color(0,0,0));
		btn0.setBackground(new Color(0, 0, 0));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(114, 539, 175, 35);
		contentPane.add(btn0);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(114, 462, 69, 35);
		contentPane.add(btn3);
		
		btn2 = new JButton("2");
		btn2.setForeground(new Color(0,0,0));
		btn2.setBackground(new Color(0, 0, 0));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(220, 462, 69, 35);
		contentPane.add(btn2);
		
		btn1 = new JButton("1");
		btn1.setForeground(new Color(0,0,0));
		btn1.setBackground(new Color(0, 0, 0));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(314, 462, 69, 35);
		contentPane.add(btn1);
		// my add

		btn0.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "0");
		    }
		});
		btn1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "1");
		    }
		});

		btn2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "2");
		    }
		});
		btn3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "3");
		    }
		});

		btn4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "4");
		    }
		});
		btn5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "5");
		    }
		});

		btn6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "6");
		    }
		});
		btn7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "7");
		    }
		});

		btn8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "8");
		    }
		});
		btnpoint = new JButton(".");
		btnpoint.setForeground(new Color(0,0,0));
		btnpoint.setBackground(new Color(0, 0, 0));
		btnpoint.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnpoint.setBounds(312, 539, 71, 35);
		contentPane.add(btnpoint);
		btnpoint.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + ".");
		    }
		});
		btn9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        etInput.setText(currentText + "9");
		    }
		});

		btnequal = new JButton("  =");
		btnequal.setBackground(new Color(0, 0, 0));
		
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnequal.setBounds(410, 462, 69, 126);
		contentPane.add(btnequal);
		
		
		
		
		btnClear = new JButton("C");
		btnClear.setBackground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBounds(201, 138, 86, 35);
		contentPane.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        etInput.setText("");
		    }
		});
		
		
		btnDell.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDell.setBounds(314, 138, 86, 35);
		contentPane.add(btnDell);
		
		btnDivi = new JButton("     /");
		btnDivi.setBackground(new Color(0, 0, 0));
		btnDivi.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDivi.setBounds(410, 138, 69, 35);
		contentPane.add(btnDivi);
		
		btnunderoot = new JButton("   √");
		btnunderoot.setBackground(new Color(0, 0, 0));
		
		btnunderoot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnunderoot.setBounds(114, 213, 69, 35);
		contentPane.add(btnunderoot);
		
		btnSquare = new JButton("    x*2");
		btnSquare.setBackground(new Color(0, 0, 0));
		btnSquare.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSquare.setBounds(220, 213, 84, 35);
		contentPane.add(btnSquare);
		
		btnhalf = new JButton("1/x");
		btnhalf.setBackground(new Color(0, 0, 0));
		btnhalf.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnhalf.setBounds(314, 213, 69, 35);
		contentPane.add(btnhalf);
		btnequal.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = etInput.getText().trim();

		        
		        if (!input.isEmpty()) {
		            
		            String[] parts = input.split(" ");

		            if (parts.length == 3) {
		                try {
		                    double num1 = Double.parseDouble(parts[0]);
		                    double num2 = Double.parseDouble(parts[2]);
		                    String operator = parts[1];
		                    double result = 0.0;

		                    // Perform the calculation based on the operator
		                    switch (operator) {
		                        case "+":
		                            result = num1 + num2;
		                            break;
		                        case "-":
		                            result = num1 - num2;
		                            break;
		                        case "*":
		                            result = num1 * num2;
		                            break;
		                        case "/":
		                            if (num2 != 0) {
		                                result = num1 / num2;
		                            } else {
		                                etInput.setText("Error: Division by zero");
		                                return;
		                            }
		                            break;
		                        default:
		                            etInput.setText("Error!");
		                            return;
		                    }

		                    // Display the result in the input field
		                    etInput.setText(Double.toString(result));

		                } catch (NumberFormatException ex) {
		                    etInput.setText("Error");
		                }
		            } else {
		                etInput.setText("Error (Just use 2 number at a time to perform the opration)");
		            }
		        }
		    }
		    
		});
		 btnDell.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String currentText = etInput.getText();
	                if (!currentText.isEmpty()) {
	                    etInput.setText(currentText.substring(0, currentText.length() - 1));
	                }
	            }
	        });
		btnSum.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        if (!currentText.isEmpty()) {
		            etInput.setText(currentText + " + ");
		        }
		    }
		});
		btnminus.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        if (!currentText.isEmpty()) {
		            etInput.setText(currentText + " - ");
		        }
		    }
		});
		 btnhalf.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double input = Double.parseDouble(etInput.getText());
	                    if (input != 0) {
	                        double result = 1 / input;
	                        etInput.setText(Double.toString(result));
	                    } else {
	                        etInput.setText("Error: Division by zero");
	                    }
	                } catch (NumberFormatException ex) {
	                    etInput.setText("Error");
	                }
	            }
	        });
		 btnSquare.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double input = Double.parseDouble(etInput.getText());
	                    double result = Math.pow(input, 2);
	                    etInput.setText(Double.toString(result));
	                } catch (NumberFormatException ex) {
	                    etInput.setText("Error");
	                }
	            }
	        });
		 btnunderoot.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double input = Double.parseDouble(etInput.getText());
	                    double result = Math.sqrt(input);
	                    etInput.setText(Double.toString(result));
	                } catch (NumberFormatException ex) {
	                    etInput.setText("Error");
	                }
	            }
	        });
		btnunderoot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnunderoot.setBounds(114, 213, 69, 35);
		contentPane.add(btnunderoot);
		
		btnmultiply.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        if (!currentText.isEmpty()) {
		            etInput.setText(currentText + " * ");
		        }
		    }
		});
		btnDivi.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = etInput.getText();
		        if (!currentText.isEmpty()) {
		            etInput.setText(currentText + " / ");
		        }
		    }
		});
		
	}
	
	private void setComponentsVisible(boolean visible) {
        etInput.setVisible(visible);
        btnDell.setVisible(visible);
        btnDivi.setVisible(visible);
        btnunderoot.setVisible(visible);
        btnSquare.setVisible(visible);
        btnhalf.setVisible(visible);
        btnminus.setVisible(visible);
        btn7.setVisible(visible);
        btn8.setVisible(visible);
        btn9.setVisible(visible);
        btnmultiply.setVisible(visible);
        btn6.setVisible(visible);
        btn5.setVisible(visible);
        btn4.setVisible(visible);
        btnSum.setVisible(visible);
        btn3.setVisible(visible);
        btn2.setVisible(visible);
        btn1.setVisible(visible);
        btnequal.setVisible(visible);
        btn0.setVisible(visible);
        btnpoint.setVisible(visible);
        btnClear.setVisible(visible);
        lbIndicator.setVisible(!visible); 
    }
}
