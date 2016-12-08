package com.deceax.masterdetail;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.ViewHolder> {

    public interface OnRecipeClickListener {
        void onClick(int index);
    }
        OnRecipeClickListener listener;
        RecipeList list;

        public RecipeListAdapter(RecipeList list, OnRecipeClickListener listener) {
            this.list = list;
            this.listener = listener;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public TextView title;

            public ViewHolder(LinearLayout view){
                super(view);
                this.title = (TextView) view.findViewById(R.id.content);
            }
        }

        @Override
        public RecipeListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LinearLayout view = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_list_content, parent, false);
            ViewHolder vh = new ViewHolder(view);
            return vh;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.title.setText(list.getResults().get(position).getTitle());
            final int i = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(i);
                }
            });
        }

        @Override
        public int getItemCount() {
            return list.getResults().size();
        }
}
