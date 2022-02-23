package br.edu.ifsp.scl.ads.pdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import br.edu.ifsp.scl.ads.pdm.cadastro.model.EmailList;
import br.edu.ifsp.scl.ads.pdm.cadastro.model.Form;
import br.edu.ifsp.scl.ads.pdm.cadastro.model.Genre;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextPhone;
    private EditText editTextEmail;
    private EditText editTextCity;
    private CheckBox checkBoxAcceptAddListEmail;
    private RadioButton radioButtonGenreMale;
    private Spinner spinnerUF;
    private Button buttonClearFieldsForm;
    private Button buttonSaveForm;

    private ArrayList<Form> listFormsPerson = new ArrayList<>();
    private ArrayList<EmailList> emailList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextCity = findViewById(R.id.editTextCity);
        checkBoxAcceptAddListEmail = findViewById(R.id.checkboxAcceptAddListEmail);
        radioButtonGenreMale = findViewById(R.id.radioButtonMale);
        spinnerUF = findViewById(R.id.spinnerUF);


        buttonClearFieldsForm = findViewById(R.id.buttonClearForm);
        buttonSaveForm = findViewById(R.id.buttonSaveForm);

        buttonClearFieldsForm.setOnClickListener(view -> clearFields());
        buttonSaveForm.setOnClickListener(view -> saveForm());

    }

    private void saveForm() {
        if(editTextName != null){
            String name = editTextName.getText().toString();
            String phone = editTextPhone.getText().toString();
            String email = editTextEmail.getText().toString();
            boolean checkedMale = radioButtonGenreMale.isChecked();
            String city = editTextCity.getText().toString();
            String uf = ((TextView) spinnerUF.getSelectedView()).getText().toString();

            Form form = new Form(name, phone, email, checkedMale ? Genre.MALE: Genre.FEMALE, city, uf);

            String message = "";
            if(checkBoxAcceptAddListEmail.isChecked()){
                emailList.add(new EmailList(form));
                message = "\nAdicionado na lista de emails";
            } else{
                message = "\nO cadastro não foi vinculado na lista de emails";
            }

            Toast.makeText(this, form.toString() + message, Toast.LENGTH_SHORT).show();
            System.out.println(emailList);
        }
    }

    private void clearFields() {
        editTextPhone.setText("");
        editTextName.setText("");
        editTextEmail.setText("");
        editTextCity.setText("");
        checkBoxAcceptAddListEmail.setChecked(false);
        radioButtonGenreMale.setChecked(true);
        editTextName.requestFocus();
    }

}