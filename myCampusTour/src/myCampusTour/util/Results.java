package myCampusTour.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
    public void write_error(String err, String err_args){
        try {
            FileWriter file = new FileWriter(err_args);
            BufferedWriter output = new BufferedWriter(file);
            output.write(err);
            output.close();
        }
        catch (IOException e) {
            System.out.println("exception occurred" + e);
        }
        finally{
            
        }
    }
	
}
