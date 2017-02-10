package com.adenlie.adventureclub.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.adenlie.adventureclub.R;
import com.adenlie.adventureclub.adapter.EventsAdapter;
import com.adenlie.adventureclub.listner.RecyclerTouchListener;
import com.adenlie.adventureclub.model.Event;

import java.util.List;

import static java.util.Arrays.asList;

public class EventListActivity extends AppCompatActivity {
    private RecyclerView eventsRecyclerView;
    private EventsAdapter eventsAdapter;
    private List<Event> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);
        eventList = getDummyData();
        eventsRecyclerView = (RecyclerView) findViewById(R.id.events_recycler_view);

        LinearLayoutManager eventsLayoutManager = new LinearLayoutManager(this);
        eventsRecyclerView.setLayoutManager(eventsLayoutManager);
        eventsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        eventsRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        eventsRecyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), eventsRecyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Event movie = eventList.get(position);
                Toast.makeText(getApplicationContext(), movie.getName() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        eventsAdapter = new EventsAdapter(eventList);
        eventsRecyclerView.setAdapter(eventsAdapter);
    }

    @NonNull
    private List<Event> getDummyData() {
        return asList(
                new Event("Magical Kodai", "Escape into the psychedelic jungle", 1999L),
                new Event("Mesmerising Munnar", "The land of tea", 1999L),
                new Event("Majestic Idukki", "Let the gold take you for a trip", 1999L),
                new Event("Magical Kodai", "Escape into the psychedelic jungle", 1999L),
                new Event("Magical Kodai", "Escape into the psychedelic jungle", 1999L),
                new Event("Magical Kodai", "Escape into the psychedelic jungle", 1999L)
        );
    }
}
