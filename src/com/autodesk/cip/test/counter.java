package com.autodesk.cip.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.FileReader;
import org.apache.avro.specific.SpecificDatumReader;

import com.autodesk.ws.avro.LogItem;


public class counter {
	
	static int countNum = 0;
	
	private static void count(File avroLogFile) {
		FileReader<LogItem> reader = null;
		
		try {
			reader = DataFileReader.openReader(avroLogFile, new SpecificDatumReader<LogItem>(LogItem.class));
			while (reader.hasNext()) {
				reader.next();
				countNum++;
			}
		} 
		catch (IOException e) {
			//e.printStackTrace();
			System.out.println(avroLogFile.getName());
		}
		finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	private static void filterFile (File dir) {
		File[] list = dir.listFiles();
		int avroFileCount = 0;
		if (list == null)
		{
			System.out.println("no file found!!");
			return;
		}
			
		for (int i = 0; i < list.length; i++) { 
			String fileName = list[i].toString();
			if(fileName.endsWith(".avro")) {
				System.out.println(fileName);
				count(list[i]);
				avroFileCount ++;
				
			}
		}

		System.out.println("There are " + avroFileCount +" avro log files in total in this folder.");
	}
	
	public static void main (String args[]){
		
		String path = null;
	
		if (args == null)
		{
			System.out.println("no args!");
			path = configReader.readValue("properties.pro", "Path");
		}
		else{
			System.out.println(args[0]);
			
			path = configReader.readValue(args[0], "Path");
			System.out.println(path);
			
			
			
		}
		
		File dir = new File (path);
		
		filterFile (dir);

		System.out.println("Total Count Numble is: " + countNum);
		
	}


	


static class configReader {
	
	public static String readValue(String filePath, String key) {
		
		String value = null;
		Properties props = new Properties();
		
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(filePath));
			props.load(in);
			value = props.getProperty(key);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}
}
}


