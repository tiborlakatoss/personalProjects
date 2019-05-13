package com.sda.trestian.radiomusicdatabase.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

	 public static int readNumberOfSongsFromFile() throws IOException{
	        BufferedReader br = null;
	        FileReader fr = null;
	        List<String> linesFromFile = new ArrayList<String>();
	        try {
	            br = new BufferedReader(new FileReader("src/main/resources/songNumber.txt"));
	            String sCurrentLine;
	            while ((sCurrentLine = br.readLine()) != null) {
	                linesFromFile.add(sCurrentLine);
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
	 
	 public static String readSongFromFile(int songPosition) throws IOException{ // MODIFIED
	        BufferedReader br = null;
	        FileReader fr = null;
	        List<String> linesFromFile = new ArrayList<String>();
	        try {
	            br = new BufferedReader(new FileReader("src/main/resources/songs.txt"));
	            String sCurrentLine;
	            while ((sCurrentLine = br.readLine()) != null) {
	                linesFromFile.add(sCurrentLine);
	            }
	            return linesFromFile.get(songPosition); //MODIFIED
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
