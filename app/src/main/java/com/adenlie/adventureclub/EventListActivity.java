package com.adenlie.adventureclub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import static java.util.Arrays.asList;

public class EventListActivity extends AppCompatActivity {
    private RecyclerView eventsRecyclerView;
    private RecyclerView.Adapter eventsAdapter;
    private RecyclerView.LayoutManager eventsLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);
        eventsRecyclerView = (RecyclerView) findViewById(R.id.events_recycler_view);

        eventsRecyclerView.setHasFixedSize(true);

        eventsLayoutManager = new LinearLayoutManager(this);
        eventsRecyclerView.setLayoutManager(eventsLayoutManager);

        List<String> events = asList("Magical Kodai", "Delicious Allappuzha", "Misty Munnar");
        // specify an adapter (see also next example)
        eventsAdapter = new EventListAdapter(events);
        eventsRecyclerView.setAdapter(eventsAdapter);
    }
}
