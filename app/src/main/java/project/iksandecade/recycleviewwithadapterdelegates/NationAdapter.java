package project.iksandecade.recycleviewwithadapterdelegates;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.hannesdorfmann.adapterdelegates3.AdapterDelegatesManager;

import java.util.List;

/**
 * Created by
 * Name         : Ihksan Sukmawan
 * Email        : iksandecade@gmail.com
 * Company      : Meridian.Id
 * Date         : 16/11/16
 * Project      : RecycleViewwithAdapterDelegates
 */

public class NationAdapter extends RecyclerView.Adapter {

    private AdapterDelegatesManager<List<NationModel>> listAdapterDelegatesManager;
    private List<NationModel> nationModels;

    public NationAdapter(Activity activity, List<NationModel> nationModels) {
        this.nationModels = nationModels;

        listAdapterDelegatesManager = new AdapterDelegatesManager<>();
        listAdapterDelegatesManager.addDelegate(new BlackAdapter(activity));
        listAdapterDelegatesManager.addDelegate(new WhiteAdapter(activity));
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return listAdapterDelegatesManager.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        listAdapterDelegatesManager.onBindViewHolder(nationModels, position, holder);
    }

    @Override
    public int getItemCount() {
        return nationModels.size();
    }

    @Override
    public int getItemViewType(int position) {
        return listAdapterDelegatesManager.getItemViewType(nationModels, position);
    }
}
