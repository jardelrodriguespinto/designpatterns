package br.com.product.adapter.filereader;

public class XmlFileReader implements FileReader
{
    public XmlFileReader(){}
    @Override
    public void readFile() {
        System.out.println("Reading Xml file");
    }
}
