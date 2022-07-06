import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class AwtKeyboardEvent implements KeyListener{
	Label lb1, lbl2, lb;
	TextField tf1;
	Frame fr;
	String s;
	AwtKeyboardEvent(){
		fr = new Frame("AWT Keyboard Events");
		lb1= new Label("Enter any character(s) in the Text Box", Label.CENTER);
		lbl2= new Label();
		lb= new Label();
		tf1 = new TextField(20);
		fr.setLayout(new FlowLayout());
		fr.add(lb1);
		fr.add(tf1);
		fr.add(lbl2);
		tf1.addKeyListener(this);
		fr.setSize(660,450);
		fr.setVisible(true);
	}
	public void keyPressed(KeyEvent ev){
		lbl2.setText("Key Pressed");
	}
	public void keyReleased(KeyEvent ev){
		lbl2.setText("Key Released");
	}
	public void keyTyped(KeyEvent ev){
		lbl2.setText("Key is Typed");
		fr.setVisible(true);
	}
	public static void main(String[] args){
		new AwtKeyboardEvent();
	}
}
