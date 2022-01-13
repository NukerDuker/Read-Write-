import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;

public class Solution {

    ArrayList<String> name = new ArrayList<>();

    public void collectAndWrite() throws IOException {
        // write your code here
        File directory = new File("D:\\Java SkillFactory\\Workbook\\files");
        File elderFile = new File("D:\\Java SkillFactory\\Workbook\\src\\elderFile.txt");
        FileWriter fw = new FileWriter(elderFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        listFilesFolder(directory);
        for (int i = 0; i < name.size(); i++){
            File file = new File(directory.getPath() + "\\" + name.get(i));
            System.out.println(Files.readString(Paths.get(file.toURI())));
            bw.write(Files.readString(Paths.get(file.toURI())) + "\n");
        }
        bw.flush();
        bw.close();
        }

        public void listFilesFolder (final File folder){
        for(final File fileEntry : folder.listFiles()){
            if (fileEntry.isDirectory()){
                listFilesFolder(fileEntry);
            } else {
                name.add(fileEntry.getName());
            }
        }
        }



    }


