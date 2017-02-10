package com.adenlie.adventureclub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EventListActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.adenlie.adventureclub.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);
    }

    public void showDetails(View view) {
        Intent intent = new Intent(this, EventDetailsActivity.class);
//        EditText editText = (EditText) findViewById(R.id.search_keyword);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
