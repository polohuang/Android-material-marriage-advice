package nsysu.paulhuang.helloworld;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText edtSex,edtAge;
    private Button confirm;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSex = (EditText) findViewById(R.id.editText);
        edtAge = (EditText) findViewById(R.id.editText2);
        confirm = (Button) findViewById(R.id.button);
        txt = (TextView) findViewById(R.id.textView3);

        confirm.setOnClickListener(btnOKOnClick);
    }

    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSex = edtSex.getText().toString();
            int iAge = Integer.parseInt(edtAge.getText().toString());

            String strSug = "建議：";
            if(strSex.equals("男"))
                if(iAge < 28)
                    strSug += "還不急。";
                else if(iAge > 33)
                    strSug += "趕快結婚！";
                else
                    strSug += "開始找對象。";
            else
                if(iAge < 25)
                    strSug += "還不急。";
                else if(iAge >30)
                    strSug += "趕快結婚！";
                else
                    strSug += "開始找對象。";
            txt.setText(strSug);
        }
    };

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
}
