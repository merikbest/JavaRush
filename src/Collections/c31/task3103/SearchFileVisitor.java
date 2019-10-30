package Collections.c31.task3103;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;

    List<Path> foundFiles = new ArrayList<>();

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length

        if (file.toFile().getName().contains(partOfName)) {
            foundFiles.add(file);
            return FileVisitResult.CONTINUE;
        }

        else if (partOfContent != null) {
            try(BufferedReader reader = new BufferedReader(new FileReader(file.toFile()))) {
                String line;

                while ((line = reader.readLine()) != null){

                    if (line.equals(partOfContent))
                        foundFiles.add(file);
                    return FileVisitResult.TERMINATE;
                }

            }
        }



        return FileVisitResult.CONTINUE;
    }
}