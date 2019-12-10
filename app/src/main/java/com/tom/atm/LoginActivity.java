package com.tom.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login (View view){   // 假的判斷登入(平常由後台判斷)
        EditText edUsername = findViewById(R.id.username);
        EditText edPassword = findViewById(R.id.password);
        String username = edUsername.getText().toString();
        String password = edPassword.getText().toString();
        if ("Simon".equals(username) && "123456".equals(password)){  //.equals()用於字串比較
            setResult(RESULT_OK);
            finish();  // "Simon".equals(username) 若username為空 = false 因為Simon不等於空字串   ;   username.equals("Simon") 若username為空 = 出錯  因為空字串不能.equals()
        }else {
            new AlertDialog.Builder(this)
                    .setTitle("登入訊息")
                    .setMessage("登入失敗")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }
}
