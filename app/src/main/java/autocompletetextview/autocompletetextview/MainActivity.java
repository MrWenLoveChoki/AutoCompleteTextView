package autocompletetextview.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autocompleteviewById;
    private static final String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autocompleteviewById = findViewById(R.id.edittext);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,COUNTRIES);
        autocompleteviewById.setThreshold(1);
        autocompleteviewById.setAdapter(adapter);
    }
}
