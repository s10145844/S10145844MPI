package edu.np.ece.mapg.s10145844mp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	int myNumber = 4;
	EditText etNumber;
	TextView textView1;
	Button btGuess;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etNumber = (EditText) this.findViewById(R.id.etNumber);
		textView1 = (TextView) this.findViewById(R.id.textView1);
		btGuess = (Button) this.findViewById(R.id.btGuess);
		btGuess.setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;


	}

	private View.OnClickListener listener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			String message = etNumber.getText().toString();
			textView1.setText(message);
			int num = Integer.parseInt(message);
			if(num == myNumber)
				message = "Bingo! Correct Number!";
			else
				message = "Wrong Number!";
			Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();
			
		}
	};

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
}
