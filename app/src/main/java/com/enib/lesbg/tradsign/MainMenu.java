package com.enib.lesbg.tradsign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainMenu extends Activity {
    private Button translatButton = null;
    private Button gameButton = null;
    private Button paramButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_menu);

        translatButton = (Button)findViewById(R.id.TranslatButton);
        translatButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TranslateMenu.class));
            }
        });

        paramButton = (Button)findViewById(R.id.ParamButton);
        paramButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ParamMenu.class));
            }
        });
    }


}
