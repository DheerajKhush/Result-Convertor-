package p1;
import java.io.*;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class TxtToWord
{
public void txtToWord() throws IOException
{

//Read the txt file
String fileName ="C:/Users/user/Documents/dialogbox.txt";
File file = new File(fileName);
FileInputStream fis= new FileInputStream(file);
InputStreamReader isr =new InputStreamReader(fis);
BufferedReader br =new BufferedReader(isr);
String line;

//word document code
XWPFDocument doc =new XWPFDocument();
FileOutputStream out= new FileOutputStream(new File("Result.docx"));
XWPFParagraph para = doc.createParagraph();
XWPFRun run = para.createRun();
run.setFontSize(12);

while((line= br.readLine()) !=null)
	{
	run.setText(line);
	run.addBreak();
	}
br.close();
doc.write(out);
out.close();
System.out.println("Result.docx generated successfully!!");
}
}
