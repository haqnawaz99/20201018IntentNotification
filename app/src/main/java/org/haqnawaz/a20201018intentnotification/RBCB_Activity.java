package org.haqnawaz.a20201018intentnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RBCB_Activity extends AppCompatActivity {

    RadioGroup rG1;// = findViewById(R.id.RadioGroup1);
    RadioGroup rG2;// = findViewById(R.id.radioGroup2);
    RadioButton rB1;
    RadioButton rB2;
    TextView tvResult;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rbcb);
        rG1 = findViewById(R.id.RadioGroup1);
        rG2 = findViewById(R.id.radioGroup2);
        tvResult = findViewById(R.id.textViewResult);

        spinner = findViewById(R.id.spinnerCountries);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.countries_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


    }

    public void GetValues(View view) {
        int groupOneRadioId = rG1.getCheckedRadioButtonId();
        int groupTwoRadioId = rG2.getCheckedRadioButtonId();
        rB1 = findViewById(groupOneRadioId);
        rB2 = findViewById(groupTwoRadioId);
        tvResult.setText(rB1.getText() + " Second " + rB2.getText());
    }



    public void ShowMessage (int pos){
        Toast.makeText(this, "Select country is " + pos, Toast.LENGTH_SHORT).show();
    }


}
