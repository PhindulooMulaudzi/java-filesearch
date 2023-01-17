package net.mulaudzi.main;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

import org.apache.commons.io.filefilter.WildcardFileFilter;

public class MainApplicaiton {
	private static String directory = "C:\\Users\\OWen\\Documents\\workspace-spring-tool-suite\\locomotive-file-requestor\\downloads";

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		while (true) {

			System.out.println("enter a file name:");
			String filename = keyboard.next();

			/*
			 * file search works as per normal wild card specifications 
			 */
			
			File dir = new File(directory); // "sample*.java"
			FileFilter fileFilter = new WildcardFileFilter(filename);

			File[] files = dir.listFiles(fileFilter);
			
			System.out.println("printing results of file search");
			
			for (var f : files) {
				System.out.println(f.getName());
				System.out.println((double)f.length()/1024);
			}
			
			System.out.println("done!");
		}

	}

}
