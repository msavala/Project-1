package com.examples.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	int oldVaue;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTextViewValueRandomlyOnButtonClick();
		changeTextOnce();
    }

	private void changeTextViewValueRandomlyOnButtonClick() {
		final String[] manyDifferentStrings = {"Johns's Andorid Studio Tutorials are bomb", "I love John's ANdroid Studio Tutorials", "John android Studio Tutoraisl are where its at", "John\'s ANdroid Studio Tutorials have helped me so much"}'
		
		final TextView changingText = (TextView) findViewById(R.id.text_to_change);
		Button changeTextButton = (Button) findViewById(R.id.change_text_button);
		
		changeTextButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v){
				int random = (int) (Math.random() * manyDifferentStrings.length);
				if (random == oldVaue) {
					random = (int) (Math.random() * manyDifferentStrings.length);
				}
				changingText.setText(manyDifferentStrings[random]);
				oldVaue = random;
			}
		});
	}
	
	public void changeTextOnce(){
		final TextView changingText = (TextView) findViewById(R.id.text_to_change);
		Button changeTextButton = (Button) findViewById(R.id.change_text_button);
		
		changeTextButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public vodi onClick(View v){
				changingText.setText("Hello");
			}
		});
	}
}
