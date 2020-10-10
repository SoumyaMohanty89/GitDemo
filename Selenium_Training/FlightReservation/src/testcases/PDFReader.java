package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFReader {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		// TODO Auto-generated method stub
		  PDDocument pd;
		  pd = PDDocument.load(new File("C:\\Users\\Soumya\\Downloads\\Selenium_Documentation.pdf"));
		  System.out.println("Total Number Of pages :"+pd.getNumberOfPages());
		  
		  PDFTextStripper pdf = new PDFTextStripper();
		  String str = pdf.getText(pd);
		  System.out.println(str);
		  if(str.contains("This will deselect all OPTIONs from the first SELECT on the page")){
			  System.out.println("Status -- Passed | PDF documnet contains the expected text");
		  }else{
			  System.out.println("Status -- Failed | PDF documnet doesn't contain the expected text");
		  }
	}

}
