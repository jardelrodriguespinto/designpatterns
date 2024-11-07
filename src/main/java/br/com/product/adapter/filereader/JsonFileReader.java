package br.com.product.adapter.filereader;

public class JsonFileReader implements FileReader
{
    public JsonFileReader(){}
    @Override
    public void readFile()
    {
        System.out.println("Reading Json File");
    }
}
