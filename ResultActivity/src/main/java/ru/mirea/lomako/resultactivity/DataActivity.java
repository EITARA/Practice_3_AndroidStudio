package ru.mirea.lomako.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity {
    private EditText universityEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        universityEditText = findViewById(R.id.editText);
    }
    public void OnClickSend(View view)
    {
        Intent intent = new Intent();
        intent.putExtra("name", universityEditText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}