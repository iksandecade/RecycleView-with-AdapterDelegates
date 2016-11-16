package project.iksandecade.recycleviewwithadapterdelegates;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hannesdorfmann.adapterdelegates3.AdapterDelegate;

import java.util.List;

/**
 * Created by
 * Name         : Ihksan Sukmawan
 * Email        : iksandecade@gmail.com
 * Company      : Meridian.Id
 * Date         : 16/11/16
 * Project      : RecycleViewwithAdapterDelegates
 */

public class BlackAdapter extends AdapterDelegate<List<NationModel>> {
    private LayoutInflater layoutInflater;

    public BlackAdapter(Activity activity) {
        this.layoutInflater = activity.getLayoutInflater();
    }

    @Override
    protected boolean isForViewType(@NonNull List<NationModel> items, int position) {
        boolean status = false;
        if(items.get(position).isBlack){
            status = true;
        }
        return status;
    }

    @NonNull
    @Override
    protected RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new BlackViewHolder(layoutInflater.inflate(R.layout.item_black, parent, false));
    }

    @Override
    protected void onBindViewHolder(@NonNull List<NationModel> items, int position, @NonNull RecyclerView.ViewHolder holder, @NonNull List<Object> payloads) {
        boolean isBlack = items.get(position).getBlack();
        BlackViewHolder blackViewHolder = (BlackViewHolder) holder;
        if (isBlack)
            blackViewHolder.tvBlack.setText(items.get(position).getMessage());
    }

    static class BlackViewHolder extends RecyclerView.ViewHolder {
        public TextView tvBlack;

        public BlackViewHolder(View itemView) {
            super(itemView);
            tvBlack = (TextView) itemView.findViewById(R.id.tvItemBlack);
        }
    }
}
