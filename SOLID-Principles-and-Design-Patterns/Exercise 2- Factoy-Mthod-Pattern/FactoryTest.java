package FactoryMethodPatternExample;

import FactoryMethodPatternExample.concrete_factories.ExcelFactory;
import FactoryMethodPatternExample.concrete_factories.PdfFactory;
import FactoryMethodPatternExample.concrete_factories.WordFactory;

public class FactoryTest {
     public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        Document word = wordFactory.createDocument();
        word.open();
        word.close();

        System.out.println("---");

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();
        pdf.close();

        System.out.println("---");

        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
        excel.close();
    }    
}
