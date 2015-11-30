package homesquad.homesquad;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;


public class Shopping extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shopping, menu);
        return true;
    }

    public void buttonOnClick(View v){
        Button button = (Button)v;
        RelativeLayout rLayout = (RelativeLayout) findViewById(R.id.checkbox);
        RelativeLayout.LayoutParams layprams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        View newView = null;
        CheckBox checkbox = (CheckBox)newView;
       // CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        checkbox = new CheckBox(this);
        checkbox.setLayoutParams(layprams);
        checkbox.setText("Apples");
        checkbox.getEditableText();
        rLayout.addView(checkbox);
                        //((Button)v).setText("Hi");
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
}
