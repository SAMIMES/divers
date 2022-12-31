package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FileImporter {

    public static void main(String[] args) throws IOException {
        FileImporter importer = new FileImporter();
        importer.importFiles("C:\\Users\\FS\\Documents\\Tuto\\Mbx\\data\\Offre");

    }


    public void importFiles(String aDirectoryPath)  {

        // Get the configured path for the files to import
        Optional<Path> path = getInputPathIfValid(aDirectoryPath);

        List<File> filesToProcess = null;

        if (path.isPresent()) {

            File pathDirectory = path.get().toFile();
            //File[] files = pathDirectory.listFiles();

            List<Path> xmlFilePaths = new ArrayList<>();
            // TODO sera  modifié pour les cas d'arborescence complexes

            try (Stream<Path> xmlFiles = Files.walk(pathDirectory.toPath())
                    .filter(apath -> apath.toString().endsWith(".xml"))) {

                xmlFiles.forEach(f-> System.out.println(f.getFileName()));

            } catch(IOException e){
                System.err.println("error: "+ e.getMessage());
            }

            filesToProcess = new ArrayList<>();

            /** for (File file : files) {
                System.out.println(file.getName());
            } **/

        }



        }

    private Optional<Path> getInputPathIfValid(final String givenPath){
        try {
            final Path directoryPath = Paths.get(givenPath);
            if (directoryPath.toFile().isDirectory()) {
                if (isValidNetexFolder(directoryPath)) {
                    return Optional.of(directoryPath);
                } else {
                    System.err.println("givenPath = " + givenPath);
                }
            } else {
                System.err.println("Invalid {} parameter. {} is not a directory!");
            }
        } catch (InvalidPathException | IOException ex) {
            System.err.println("The input folder [{}] is invalid! Cause: {} ex");
        }
        return Optional.empty();
    }

    /**
     * Check if some xml files are present in the folder
     *
     * @param directory Folder to check
     * @return Boolean certifying the presence of xml files
     */
    protected boolean isValidNetexFolder(Path directory) throws IOException {

            Stream<Path> files = Files.list(directory);
            return files.anyMatch(p -> p.getFileName().toString()
                    .toLowerCase().endsWith(".xml"));

    }

}
