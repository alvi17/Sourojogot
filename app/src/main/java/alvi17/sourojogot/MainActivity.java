package alvi17.sourojogot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import at.markushi.ui.CircleButton;

public class MainActivity extends Activity implements View.OnClickListener{
    CircleButton b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(CircleButton)findViewById(R.id.button0);
        b2=(CircleButton)findViewById(R.id.button1);
        b3=(CircleButton)findViewById(R.id.button2);
        b4=(CircleButton)findViewById(R.id.button4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        Intent intent;
        switch (id)
        {
            case R.id.button0:
                intent=new Intent(MainActivity.this,First_Section.class);
                startActivity(intent);
                break;
            case R.id.button1:
                intent=new Intent(MainActivity.this,Second_Section.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent=new Intent(MainActivity.this,Third_Section.class);
                startActivity(intent);
                break;
            case R.id.button4:

                intent=new Intent(MainActivity.this,Fourth_Section.class);
                startActivity(intent);
                break;
        }

    }
}
