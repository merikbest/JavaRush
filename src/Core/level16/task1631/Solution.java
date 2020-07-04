package Core.level16.task1631;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}

interface ImageReader {

}

class JpgReader implements ImageReader {

}

class PngReader implements ImageReader {

}

class BmpReader implements ImageReader {

}

class ImageReaderFactory {
    static ImageReader getImageReader(ImageTypes type) {
        if (type == ImageTypes.BMP) {
            return new BmpReader();
        } else if (type == ImageTypes.PNG) {
            return new PngReader();
        } else if (type == ImageTypes.JPG) {
            return new JpgReader();
        }else
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
}

enum ImageTypes {
    BMP,
    JPG,
    PNG
}