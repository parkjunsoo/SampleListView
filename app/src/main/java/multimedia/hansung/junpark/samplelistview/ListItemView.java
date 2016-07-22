package multimedia.hansung.junpark.samplelistview;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by hp on 2016-07-21.
 */
public class ListItemView extends LinearLayout{
    // Item View

    ImageView profileImageView;
    TextView nameView;
    TextView messageView;

    // ctrl+O로 생성자 Override
    public ListItemView(Context context) {
        super(context);

        init();
    }
    // Item View
    public void init(){
        // 1. xml Layout 지정
        inflate(getContext(), R.layout.item_view, this);                    //xml내의 오브젝트를 객체화하는 함수.
        // 2. view 초기화
        profileImageView = (ImageView) findViewById(R.id.profileImageView);
        nameView = (TextView) findViewById(R.id.nameView);
        messageView = (TextView) findViewById(R.id.messageView);

    }

    public void setItem(ListItem item){
        nameView.setText(item.name);
        messageView.setText(item.message);
        profileImageView.setImageResource(item.profileImage);

    }
}
