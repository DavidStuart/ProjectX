import javax.swing.JFrame;

public class GameViewer
{
	JFrame frame;
	TitleComponent titleScreen;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(1205, 928);
        frame.setTitle("ProjectX");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        TitleComponent titleScreen = new TitleComponent();
        frame.add(titleScreen);
        frame.addMouseListener(new MouseClicker());
        
        frame.setVisible(true);
    }
    
}
