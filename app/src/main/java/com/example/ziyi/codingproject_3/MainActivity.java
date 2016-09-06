package com.example.ziyi.codingproject_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView1;
    TextView textView2;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.bt);
        editText1 = (EditText)findViewById(R.id.edit1) ;
        editText2 = (EditText)findViewById(R.id.edit2) ;

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        editText1.setText("");
                        editText2.setText("");
                    }
                }
        );
    }


    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton)view).isChecked();
        editText1 = (EditText)findViewById(R.id.edit1) ;
        editText2 = (EditText)findViewById(R.id.edit2) ;

        switch (view.getId()){
            case R.id.rb_huawei:
                if(checked){
                    editText1.setText("华为");

                }
                break;
            case R.id.rb_meizu:
                if(checked){
                    editText1.setText("魅族");
                }
                break;
            case R.id.rb_32:
                if(checked){
                    editText2.setText("32G");
                }
                break;
            case R.id.rb_64:
                if(checked){
                    editText2.setText("64G");
                }
                break;

        }
    }


    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox)view).isChecked();
        textView1 = (TextView)findViewById(R.id.textview1);
        textView2 = (TextView)findViewById(R.id.textview2);

        switch (view.getId()){
            case R.id.cb:
                if(checked){
                    textView1.setTextSize(30);
                    textView2.setTextSize(30);
                }
                else {
                    textView1.setTextSize(20);
                    textView2.setTextSize(20);
                }
        }
    }

}
