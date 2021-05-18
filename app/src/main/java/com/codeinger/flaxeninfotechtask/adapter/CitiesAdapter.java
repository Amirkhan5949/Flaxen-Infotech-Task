package com.codeinger.flaxeninfotechtask.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codeinger.flaxeninfotechtask.R;
import com.codeinger.flaxeninfotechtask.network.model.PlacesItem;

import java.util.List;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CitiesAdapter_View> {
   private List<PlacesItem> places;
   public CitiesAdapter(List<PlacesItem> places) {
      this.places=places;
   }

   @NonNull
   @Override
   public CitiesAdapter_View onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
      View view = layoutInflater.inflate(R.layout.cities, parent, false);
      return new CitiesAdapter_View(view);
   }

   @Override
   public void onBindViewHolder(@NonNull CitiesAdapter_View holder, int position) {

      holder.tv_abbreviation.setText(places.get(position).getStateAbbreviation());
      holder.tv_latitude.setText(places.get(position).getLatitude());
      holder.tv_longitude.setText(places.get(position).getLongitude());
      holder.tv_pnme.setText(places.get(position).getPlaceName());
      holder.tv_state.setText(places.get(position).getState());
   }

   @Override
   public int getItemCount() {
      return places.size();
   }

   public class CitiesAdapter_View  extends RecyclerView.ViewHolder {

      private TextView tv_pnme,tv_longitude,tv_state,tv_abbreviation,tv_latitude;
      public CitiesAdapter_View(@NonNull View itemView) {
         super(itemView);
         tv_abbreviation=itemView.findViewById(R.id.tv_abbreviation);
         tv_pnme=itemView.findViewById(R.id.tv_pnme);
         tv_longitude=itemView.findViewById(R.id.tv_longitude);
         tv_state=itemView.findViewById(R.id.tv_state);
         tv_latitude=itemView.findViewById(R.id.tv_latitude);
      }
   }
}
