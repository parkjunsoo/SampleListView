package multimedia.hansung.junpark.samplelistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016-07-21.
 */
public class MyListAdapter extends BaseAdapter{
    // List Adapter
    // 리스트 아이템을 자료구조로 관리하고, 리스트뷰에 아이템을 뿌려주는 역할.

    // 1. BaseAdapter를 상속받은 후, ctrl + i 로 unimplimented methods를 impliment

    // 2. 리스트 아이템을 관리할 자료구조 선언
    List<ListItem> items = new ArrayList<ListItem>();

    // 3. 선언한 자료구조에 친구를 추가할 함수
    public void add(String name, String message, int profileImage){
        ListItem item = new ListItem();
        item.name = name;
        item.message = message;
        item.profileImage = profileImage;

        // items에 새로 입력받은 item을 추가
        items.add(item);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = new ListItemView(parent.getContext());
        //이 뷰에 이름, 메시지, 프로필 이미지 설정

        ((ListItemView)view).setItem(items.get(position));


        return view;
    }




}
