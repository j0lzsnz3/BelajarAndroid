package com.komitras.belajarngoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtWidth;
    private EditText edtHeight;
    private EditText edtLength;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtHeight = findViewById(R.id.edt_tinggi);
        edtWidth = findViewById(R.id.edt_lebar);
        edtLength = findViewById(R.id.edt_panjang);
        btnCalculate = findViewById(R.id.btn_hitung);
        tvResult = findViewById(R.id.btn_hasil);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.btn_hitung) {
                    String inputLength = edtLength.getText().toString().trim();
                    String inputWidth = edtWidth.getText().toString().trim();
                    String inputHeight = edtHeight.getText().toString().trim();

                    boolean isEmptyFields = false;

                    if (TextUtils.isEmpty(inputLength)){
                        isEmptyFields = true;
                        edtLength.setError("field ini tidak boleh kosong");
                    }

                    if (TextUtils.isEmpty(inputWidth)){
                        isEmptyFields = true;
                        edtWidth.setError("halaman ini tidak boleh kosng");

                    }

                    if (TextUtils.isEmpty(inputHeight)){
                        isEmptyFields = true;
                        edtHeight.setError("halaman ini tidak boleh kosong");
                    }
                    if (!isEmptyFields){
                        double volume = Double.valueOf(inputLength) * Double.valueOf(inputWidth) * Double.valueOf(inputHeight);
                        tvResult.setText(String.valueOf(volume));


                    }
                }
            }
        });


    }
}
