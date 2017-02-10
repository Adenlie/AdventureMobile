package com.adenlie.adventureclub;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class EventListAdapter extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_events_list);

        Cursor mCursor = this.getContentResolver().query(Contacts.People.CONTENT_URI, null, null, null, null);
        startManagingCursor(mCursor);

        ListAdapter adapter = new SimpleCursorAdapter(
                this,
                android.R.layout.two_line_list_item,
                mCursor,
                new String[]{Contacts.People.NAME, Contacts.People.NUMBER},
                new int[]{android.R.id.text1, android.R.id.text2});

        setListAdapter(adapter);
    }
}
