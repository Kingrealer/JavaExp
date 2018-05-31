package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileUtil {
	public static String readNote(File file) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String s;
		StringBuilder sb = new StringBuilder();
		while ((s = br.readLine()) != null) {
			sb.append(s);
			sb.append("\n");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		br.close();
		return sb.toString();
	}
	
	public static boolean writeNote(String note, File file) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(note.replace("\n", "\r\n"));
		bw.flush();
		bw.close();
		return true;
	}
}
