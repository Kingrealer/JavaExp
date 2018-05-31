import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

import util.FileUtil;

public class ApplicationEntry extends JFrame{
	
	private static final String APP_FRAME_TITLE = "NOTEBOOK";
	private static final int APP_FRAME_WIDTH = 600;
	private static final int APP_FRAME_HEIGHT = 800;
	private static final int APP_FRAME_X = 600;
	private static final int APP_FRAME_Y = 100;
	private static final int TEXT_AREA_WIDTH = APP_FRAME_WIDTH;
	private static final int TEXT_AREA_HEIGHT = (int) (APP_FRAME_HEIGHT * 0.618);
	
	private static final String LOAD_BUTTON_TITLE = "OPEN";
	private static final String SAVE_BUTTON_TITLE = "SAVE";
	
	private static final String FILE_CHOOSER_TITLE = "Ñ¡ÔñÎÄ¼þ";
	
	private static final String TEXT_FONT_FAMILY_NAME = "Î¢ÈíÑÅºÚ";
	private static final int TEXT_FONT_SIZE = 16;
	
	private JScrollPane mNorthPane;
	private JPanel mSouthPane;
	private JTextArea mJTextArea;
	private JButton mLoadButton;
	private JButton mSaveButton;
	
	private File mCurrentFile;
	
	public ApplicationEntry(String title) {
		super(title);
		
		//Init UI
		
		mJTextArea = new JTextArea(TEXT_AREA_WIDTH, TEXT_AREA_HEIGHT);
		mLoadButton = new JButton(LOAD_BUTTON_TITLE);
		mSaveButton = new JButton(SAVE_BUTTON_TITLE);
		
		mJTextArea.setLineWrap(true);
		mJTextArea.setWrapStyleWord(true); 
		Font font = new Font(TEXT_FONT_FAMILY_NAME, Font.PLAIN, TEXT_FONT_SIZE);
		mJTextArea.setFont(font);
		
		this.setLayout(new BorderLayout(8, 8));
		
		mSouthPane = new JPanel();
		mNorthPane = new JScrollPane(mJTextArea);
		mSouthPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		mSouthPane.add(mLoadButton);
		mSouthPane.add(mSaveButton);

		this.getContentPane().add(mNorthPane, BorderLayout.CENTER);
		this.getContentPane().add(mSouthPane, BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.setSize(APP_FRAME_WIDTH, APP_FRAME_HEIGHT);
		this.setLocation(APP_FRAME_X, APP_FRAME_Y);
		
		mSaveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				saveNote();
			}
			
		});
		
		mLoadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				loadNote();
			}
			
		});
	}

	private File launchFileChooser(String title) {
		JFileChooser jFileChooser = new JFileChooser();  
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );  
        jFileChooser.showDialog(new JLabel(), title);
        return jFileChooser.getSelectedFile();
	}
	
	private boolean loadNote() {
        mCurrentFile = launchFileChooser(FILE_CHOOSER_TITLE);
        if (mCurrentFile != null && mCurrentFile.isFile()) {
        	try {
            	mJTextArea.setText(FileUtil.readNote(mCurrentFile));
            	this.setTitle(APP_FRAME_TITLE + " - " + mCurrentFile.getName());
            	return true;
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			return false;
    		}
        } else return false;
	}
	
	private boolean saveNote() {
		try {
			if (!(mCurrentFile != null && mCurrentFile.isFile())) {
				mCurrentFile = launchFileChooser(FILE_CHOOSER_TITLE);
				this.setTitle(APP_FRAME_TITLE + " - " + mCurrentFile.getName());
			}
			FileUtil.writeNote(mJTextArea.getText(), mCurrentFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		ApplicationEntry app = new ApplicationEntry(APP_FRAME_TITLE);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
