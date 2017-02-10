package com.adenlie.adventureclub;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.ViewHolder> {
    private List<String> events;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameOfTheEvent;

        public ViewHolder(TextView v) {
            super(v);
            nameOfTheEvent = v;
        }
    }

    public EventListAdapter(List<String> events) {
        this.events = events;
    }

    @Override
    public EventListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView name = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_name, parent, false);

        ViewHolder vh = new ViewHolder(name);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nameOfTheEvent.setText(events.get(position));

    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}
