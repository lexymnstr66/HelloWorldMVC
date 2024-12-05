package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Model implements IModel {
    @Override
    public String getMessages() {
        try(BufferedReader br=new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(Model.class.getResourceAsStream("message.txt")))
        ))
        {
            return br.readLine();
        } catch (IOException e){
            return "ERROR: "+e.getMessage();
        }
    }
}
