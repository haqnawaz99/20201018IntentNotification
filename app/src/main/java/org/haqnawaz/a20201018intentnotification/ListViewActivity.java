package org.haqnawaz.a20201018intentnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  ListViewActivity extends AppCompatActivity {

    Button btn_add;
    EditText et_value;
    ListView lv_names;

    List<String> names =  new ArrayList<String>();
    String [] nameList = {"Ali", "Asad", "Musa"};

    ArrayAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        btn_add = findViewById(R.id.btnListView);
        et_value = findViewById(R.id.et_listNames);
        lv_names = findViewById(R.id.lvNames);

        names =  new ArrayList<String>(Arrays.asList(nameList));
        ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,names );
        lv_names.setAdapter(ad);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newName =  et_value.getText().toString();

                names.add(newName);
                ad.notifyDataSetChanged();




            }
        });



    }
}
