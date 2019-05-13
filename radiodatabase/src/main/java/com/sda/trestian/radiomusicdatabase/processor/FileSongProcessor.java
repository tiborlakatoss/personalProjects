package com.sda.trestian.radiomusicdatabase.processor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSongProcessor implements IProcessor{

	@Override
	public int readNumberOfSongs() {
		BufferedReader br = null;
        FileReader fr = null;
        List<String> linesFromFile = new ArrayList<String>();
        try {
            try {
				br = new BufferedReader(new FileReader("src/main/resources/songNumber.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            String sCurrentLine;
            try {
				while ((sCurrentLine = br.readLine()) != null) {
				    linesFromFile.add(sCurrentLine);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return Integer.parseInt(linesFromFile.get(0));
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } 
        }
	}

}
