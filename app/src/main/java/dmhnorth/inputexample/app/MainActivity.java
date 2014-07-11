package dmhnorth.inputexample.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

//    private Button yesButton, noButton;
    private EditText userNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Finding the buttons doesn't actually seem to be necessary
//        yesButton = (Button) findViewById(R.id.yesButton);
//        noButton = (Button) findViewById(R.id.noButton);
        userNameEditText = (EditText) findViewById(R.id.userName);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onYesClick(View view) {

        String userName = String.valueOf(userNameEditText.getText());

        String yesResponse = "That's good " + userName;

        Toast.makeText(this, yesResponse, Toast.LENGTH_SHORT).show();

    }

    public void onNoAnswer(View view) {

        String userName = String.valueOf(userNameEditText.getText());

        String noResponse = "That's not so good " + userName;

        Toast.makeText(this, noResponse, Toast.LENGTH_SHORT).show();

    }
}
