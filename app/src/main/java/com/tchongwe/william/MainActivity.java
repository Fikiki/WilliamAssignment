package com.tchongwe.william;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.*;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button dublinBike;

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //william tchongwe
        //15922

       //  dublinBike= (Button) findViewById(R.id.dublinButton);
       // data = (TextView) findViewById(R.id.buttonText);



        dublinBike = (Button) findViewById(R.id.dublinButton);

        Button map = (Button) findViewById(R.id.mapButton);

        Button about = (Button) findViewById(R.id.aboutButton);


       dublinBike.setOnClickListener(new View.OnClickListener() {
            @Override
          public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);

            }
       });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Map1.class);
                startActivity(intent);


            }

        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);

            }
        });
    }
}
