/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chacreator;

import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Suolapurkki
 */
public class ChaCreator {
    
    public static XmlReader reader;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     */
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        reader = new XmlReader();
        EnumHandler.state current = EnumHandler.state.wait;
        Scanner lineReader = new Scanner(System.in);;
        
        String input = "";
        
        while(current != EnumHandler.state.exit){
            //Runtime.getRuntime().exec("cls");
            Print("header");
            
            System.out.println("Please select what you want to do");
            input = args[0];
            
            switch(input){
                case "exit":
                    current = EnumHandler.state.exit;
                    Print("exit");
                    break;
                case "create":
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void Print(String target){
        String printable = reader.getItem(target);
        System.out.println(printable);
    }
}
