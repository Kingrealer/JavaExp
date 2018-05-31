import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class PaneApplication extends JFrame implements ActionListener{
	private static final int BUTTONS_NUM = 9;
	private static final int COLOR_VALUE[] = {
			0x2196F3,	//Blue
			0x00BCD4,	//Cyan
			0x4CAF50,	//Green
			0xE040FB,	//Magenta
			0xFF5722,	//Orange
			0xE91E63,	//Pink
			0xF44336,	//Red
			0xFFFFFF,	//White
			0xFFEB3B	//Yellow
			};
	
	private static final String COLOR_NAME[] = {
			"Blue",
			"Cyan",
			"Green",
			"Magenta",
			"Orange",
			"Pink",
			"Red",
			"White",
			"Yellow"
			};
	
	private JButton[] mJButtons;
	private boolean[] isShown;
	
	private Map<String, Integer> mColorMap;
	
	public PaneApplication() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(512, 512);
		
		getContentPane().setLayout(new GridLayout(3, 3, 10, 10));
		
		mJButtons = new JButton[BUTTONS_NUM];
		isShown = new boolean[BUTTONS_NUM];
		mColorMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < BUTTONS_NUM; i++) {
			mJButtons[i] = new JButton(COLOR_NAME[i]);
			mJButtons[i].addActionListener(this);
			isShown[i] = false;
			mColorMap.put(COLOR_NAME[i], COLOR_VALUE[i]);
			getContentPane().add(mJButtons[i]);
		}
		
	}
	
	public static void main(String[] args) {
		PaneApplication app = new PaneApplication();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		for (int i = 0; i < BUTTONS_NUM; i++) {
			if (event.getSource() == mJButtons[i]) {
				if (isShown[i]) {
					mJButtons[i].setBackground(getBackground());
					isShown[i] = false;
				} else {
					mJButtons[i].setBackground(
							new Color(mColorMap.get(COLOR_NAME[i])));
					isShown[i] = true;
				}
				break;
			}
		}
		
	}
	
	
}
