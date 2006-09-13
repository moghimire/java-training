/**
 * 
 */
package biz.adaptivesoftware.examples.logging;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

/**Prints the number of words in a file.
 * The purpose of this example is to explain how to generate
 * log events from a class.
 * @author pshah
 *
 */
public class WordCount {
	//initialize a logger
	private static Logger logger = 
		Logger.getLogger(WordCount.class.getName());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//messages signifying that a method has been entered exited are
		//usually logged at the 'trace' level.
		logger.trace("entering main");
		WordCount wc = new WordCount();
		BufferedReader reader = 
			new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				wc.dispMenu();
				String fileName = reader.readLine();
				logger.debug("user selected file: " + fileName);
				if(fileName.equals("q")) {
					break;
				}
				wc.printWordCount(fileName);
			} catch(IOException ioe) {
				logger.error("Error reading from System concole", ioe);
			}
		}
	}

	/** Displays a menu to the user
	 */
	private void dispMenu() {
		logger.trace("entering dispMenu");
		System.out.println("This program prints the number " +
				"of words in a file");
		System.out.print("Please enter a file name: ");
	}
	
	/**Prints the number of words in the specified file
	 * @param fileName Name of the file
	 */
	private void printWordCount(String fileName) {
		logger.trace("entering countWords");
		BufferedReader bufferedReader=null;
		String line = null;
		int count = 0;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			logger.debug("read file " + fileName);
			while((line = bufferedReader.readLine()) != null) {
				StringTokenizer strTok = new StringTokenizer(line);
				count += strTok.countTokens();
			}
			System.out.println("Word Count for file " + 
					fileName + " is " + count);
		} catch(FileNotFoundException fnfe) {
			logger.error("Could not read file", fnfe);
		} catch(IOException ioe) {
			logger.error("Could not read file", ioe);
		}
	}
}