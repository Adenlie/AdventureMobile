package com.adenlie.adventureclub.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.adenlie.adventureclub.R;
import com.adenlie.adventureclub.model.Event;

import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.MyViewHolder> {
    private List<Event> eventList;

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, description, price;

        MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.event_name);
            description = (TextView) view.findViewById(R.id.event_description);
            price = (TextView) view.findViewById(R.id.price);
        }
    }

    public EventsAdapter(List<Event> eventList) {
        this.eventList = eventList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Event event = eventList.get(position);
        holder.name.setText(event.getName());
        holder.description.setText(event.getDescription());
        holder.price.setText(event.getPrice().toString());
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}
