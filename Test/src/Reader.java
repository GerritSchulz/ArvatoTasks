import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    Reader(){
    }

    public void readList(String path){
        try{
            BufferedReader bfreader = new BufferedReader((new FileReader(path)));
            String line = bfreader.readLine();
            while (line != null){
                System.out.println(line);
                // read next line
                line = bfreader.readLine();
            }
            bfreader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
