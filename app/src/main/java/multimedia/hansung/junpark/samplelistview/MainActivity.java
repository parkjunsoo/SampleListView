package multimedia.hansung.junpark.samplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View Initiallize

        listView = (ListView) findViewById(R.id.listView);

        // Adapter Initiallize
        mAdapter = new MyListAdapter();

        // ListView에게 Adapter를 할당
        listView.setAdapter(mAdapter);

        // item 넣어주기
        for(int i = 0 ; i < 100; i++){
            mAdapter.add("박준수"+i,"상태메시지"+i,R.mipmap.ic_launcher);
        }
    }
}
