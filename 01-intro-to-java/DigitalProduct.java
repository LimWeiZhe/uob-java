public class DigitalProduct extends Product{
    private String fileFormat;
    private String fileName;
    private int fileSize;

    public DigitalProduct(){
        super();
        fileFormat = "N/A";
        fileName = "N/A";
    }

    public DigitalProduct(String fileFormat, String fileName, int fileSize) {
        this.fileFormat = fileFormat;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public DigitalProduct(String name, String sku, double price, String fileFormat, String fileName, int fileSize) {
        super(name, sku, price);
        this.fileFormat = fileFormat;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
    
    @Override
    public double  calculateTotalPrice(){
        return price + (fileSize/1024) * 0.01;
    }
}   

