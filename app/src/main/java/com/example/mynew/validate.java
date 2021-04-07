package com.example.mynew;

import android.content.Context;
import android.widget.EditText;

public class validate {
    private Context context;

    public validate(Context context){
        this.context = context;
    }

    public boolean isInputEditTextFilled(EditText textInputEditText){
        String Value=textInputEditText.getText().toString().trim();
        if(Value.isEmpty()) {
            return false;
        }
        return true;
        }
    public boolean isInputEditTextEmail(EditText textInputEditText) {
        String Value=textInputEditText.getText().toString().trim();
        if(Value.isEmpty()||!android.util.Patterns.EMAIL_ADDRESS.matcher(Value).matches()) {
            return false;
        }
        return true;
    }
    public boolean isInputEditTextMatches(EditText textInputEditText1, EditText textInputEditText2) {
        String Value1=textInputEditText1.getText().toString().trim();
        String Value2=textInputEditText2.getText().toString().trim();
        if(!Value1.contentEquals(Value2)) {
            return false;
        }
        return true;
    }
    }

