package FactoryMethodPatternExample.concrete_factories;

import FactoryMethodPatternExample.Document;
import FactoryMethodPatternExample.DocumentFactory;
import FactoryMethodPatternExample.concrete_classes.PdfDocument;

public class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}