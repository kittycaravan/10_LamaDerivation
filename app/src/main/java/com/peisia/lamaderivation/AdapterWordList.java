package com.peisia.lamaderivation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
/**
 * Created by 호양이 on 2019-08-17.
 */
public class AdapterWordList extends RecyclerView.Adapter<AdapterWordList.ItemViewHolder>{
    ArrayList<ItemWord> mItems;
    public AdapterWordList(ArrayList<ItemWord> items){
        mItems = items;
    }
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_word, parent, false);
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.word.setText(mItems.get(position).getWord());
        holder.meaning.setText(mItems.get(position).getMeaning());
        holder.exampleWord.setText(mItems.get(position).getExampleWord());
        holder.exampleWordMeaning.setText(mItems.get(position).getExampleWordMeaning());
    }
    @Override
    public int getItemCount() {
        return mItems.size();
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView word;
        private TextView meaning;
        private TextView exampleWord;
        private TextView exampleWordMeaning;
        public ItemViewHolder(View itemView) {
            super(itemView);
            word = itemView.findViewById(R.id.item_word);
            meaning = itemView.findViewById(R.id.item_meaning);
            exampleWord = itemView.findViewById(R.id.item_example_word);
            exampleWordMeaning = itemView.findViewById(R.id.item_example_word_meaning);
        }
    }
}
