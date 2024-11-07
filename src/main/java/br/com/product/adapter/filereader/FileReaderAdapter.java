package br.com.product.adapter.filereader;

public class FileReaderAdapter
{
    private FileReader fileReader;

    public FileReaderAdapter(FileReader fileReader){
        this.fileReader = fileReader;
    }

    public void readFile()
    {
        fileReader.readFile();
    }
}
