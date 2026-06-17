package FactoryMethodPatternExample.concrete_factories;

import FactoryMethodPatternExample.Document;
import FactoryMethodPatternExample.DocumentFactory;
import FactoryMethodPatternExample.concrete_classes.ExcelDocument;

public class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}