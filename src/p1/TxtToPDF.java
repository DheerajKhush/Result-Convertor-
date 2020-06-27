package p1;
import java.io.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class TxtToPDF
{
public static void txtToPDF() throws IOException
{
//Read the txt file
String fileName ="C:/Users/user/Documents/dialogbox.txt";
File file = new File(fileName);
FileInputStream fis= new FileInputStream(file);
InputStreamReader isr =new InputStreamReader(fis);
BufferedReader br =new BufferedReader(isr);
String line;

//PDF Code
PDDocument doc= new PDDocument();
PDPage blankPage= new PDPage();
doc.addPage(blankPage);
PDPageContentStream cntStm = new PDPageContentStream(doc,blankPage);
cntStm.beginText();
cntStm.setFont(PDType1Font.TIMES_ROMAN,12);
cntStm.newLineAtOffset(1,750);
cntStm.setLeading(14.5f);

while((line= br.readLine()) !=null)
	{
	cntStm.showText(line);
	
	cntStm.newLine();
	}

br.close();
cntStm.endText();
cntStm.close();
doc.save(new File("ResultPDF.pdf"));
System.out.println("PDF created successfully");
doc.close();

}
}
