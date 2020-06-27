/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result.convertor;
import p1.TxtToWord;
import p1.TxtToPDF;
import java.io.IOException;

/**
 *
 * @author user
 */
public class ResultConvertor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
	//result in doc file
TxtToWord obj1= new TxtToWord();
obj1.txtToWord();

	//result in pdf file
TxtToPDF obj2 = new TxtToPDF();
obj2.txtToPDF();

System.out.println("Sucessfullt Created....");

    }
    
}
