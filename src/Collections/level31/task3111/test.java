package Collections.level31.task3111;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class test {
    public static void main(String[] args) throws IOException {
//        Files.walkFileTree(Paths.get("C:\\prog\\SolutionTest"), new MyFileVisitor());
//        MyFileVisitor myFileVisitor = new MyFileVisitor();
//        myFileVisitor.setName("test1");
        Path directory  = Paths.get("C:\\prog\\SolutionTest");
        String fileNameToFind = "test1";

        try {
            Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
                    if (path.toFile().getName().contains(fileNameToFind)) {
                        System.out.println("Found: " + path.toString());
                        return FileVisitResult.TERMINATE;
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
    String fileNameToFind = "test1";

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toFile().getName().equals(fileNameToFind)) {
            System.out.println("Found: " + file.toString());
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }
}
