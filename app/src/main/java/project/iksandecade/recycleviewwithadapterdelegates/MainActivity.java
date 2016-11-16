package project.iksandecade.recycleviewwithadapterdelegates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMain = (RecyclerView) findViewById(R.id.rvMain);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        NationAdapter nationAdapter = new NationAdapter(this, getNationModelList());
        rvMain.setAdapter(nationAdapter);


    }

    private List<NationModel> getNationModelList(){
        List<NationModel> nationModelList  = new ArrayList<NationModel>();

        nationModelList.add(new NationModel(1, "Indonesia", true));
        nationModelList.add(new NationModel(2, "Malaysia", false));
        nationModelList.add(new NationModel(3, "Jepang", true));
        nationModelList.add(new NationModel(4, "Inggris", true));
        nationModelList.add(new NationModel(5, "Amerika", false));
        nationModelList.add(new NationModel(6, "Arab", false));
        nationModelList.add(new NationModel(7, "Korea", true));

        Collections.shuffle(nationModelList);

        return nationModelList;
    }
}
