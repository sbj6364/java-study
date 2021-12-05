import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Pr13_6 {

	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("연습문제 13-6");
			this.setLayout(new FlowLayout());

			
			JTextArea txtArea = new JTextArea(5, 10);
			this.add(txtArea);
			this.add(new JScrollPane(txtArea));
//			txtArea.setEditable(false); 입력칸 수정 가능하게 할지 말지
			
			
			this.addMouseListener(new MouseListener() {

				public void mouseClicked(MouseEvent e) {
					txtArea.append(Integer.toString(e.getX()) + "," + Integer.toString(e.getY()) + "\n");
				}
				public void mousePressed(MouseEvent e) {
				}
				public void mouseReleased(MouseEvent e) {
				}
				public void mouseEntered(MouseEvent e) {
				}
				public void mouseExited(MouseEvent e) {
				}
				
			});
			
			setSize(500,200);
			setVisible(true);
			
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();

	}

}
