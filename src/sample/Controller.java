package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller
{
    @FXML
    private TextField inputField;
    @FXML
    private ListView<String> contacts;
    @FXML
    private ListView<String> messeges;

    ObservableList<String> wordList = FXCollections.observableArrayList();
    ObservableList<String> contactList = FXCollections.observableArrayList("Misha", "Kesha",
            "Gosha", "Moisha");

    @FXML
    public void initialize()
    {
        messeges.setItems(wordList);
        contacts.setItems(contactList);
    }

    @FXML
    public void addWordToList()
    {
        String word = inputField.getText();
        if (!word.isBlank())
        {
            messeges.getItems().add(word);
        }
        inputField.setText("");
    }

    @FXML
    public void addClearForm()
    {
        messeges.getItems().clear();
    }

    @FXML
    public void exit()
    {
        System.exit(0);
    }
    @FXML
    public void about() // без создания нового .fxml
    {
        Text text = new Text(100, 100, "about");
        text.setFont(new Font( 40));
        Scene scene = new Scene(new Group(text), 300, 200);
        Stage stage = new Stage(); stage.setScene(scene);
        stage.setTitle("About"); stage.show();
    }
}
