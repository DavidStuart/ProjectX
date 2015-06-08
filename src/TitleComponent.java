import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TitleComponent extends JComponent implements ActionListener 
{
	private Background titleBG;
	
	public TitleComponent()
	{this.titleBG = new Background("Title.png");}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		titleBG.draw(g2);	
	}
	class MouseClicker implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {}
        public void mousePressed(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
    }
	public void actionPerformed(ActionEvent e)
	{}
}
