import javafx.fxml.FXML;
// import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
// import javafx.fxml.FXMLLoader;

// import java.io.IOException;

// import javax.script.ScriptEngine;
// import javax.script.ScriptEngineManager;
// import javax.script.ScriptException;

import com.fathzer.soft.javaluator.DoubleEvaluator;

import javafx.event.*;


public class controller {
    
    // @FXML
    // ScriptEngineManager manager = new ScriptEngineManager();
    // ScriptEngine engine = manager.getEngineByName("js");
    DoubleEvaluator evaluator = new DoubleEvaluator();
    @FXML
    private Stage stage ;
    
    @FXML
    private Label lbl;
    
    private String s="";


    

    // public void calc(ActionEvent event ) throws IOException{
    //     root =FXMLLoader.load(getClass().getResource("calculator1.fxml"));
    //     stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    //     scene=new Scene(root);
    //     stage.setScene(scene);
    //     stage.show();
 
    public void action(ActionEvent event){
        Button btn=(Button)event.getSource();
        String id=btn.getId();
        if (id.contentEquals("del")){
            try {
                s=s.substring(0, s.length()-1);
                lbl.setText(s);
            } catch (Exception e) {
                // TODO: handle exception
                //Nothing to do
            }

        }
        else if (id.contentEquals("eq")){
            try {
                Double f=evaluator.evaluate(s);
                s=Double.toString(f);
                lbl.setText(s);

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                lbl.setText("Error");
            }
            
        }
        else{
            s+=btn.getText() ;
            lbl.setText(s);
        }
        
    

}
    

    
}
