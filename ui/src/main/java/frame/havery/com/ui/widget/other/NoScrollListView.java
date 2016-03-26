package frame.havery.com.ui.widget.other;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * com.xiaoduo.mydagong.mywork.view.view.widget/wodedagong3.0-20150715-harvey
 * 作者：Harvey on 2016/3/26 14:51
 * 邮箱：497823256@qq.com
 * 说明：
 * 修改：
 * 修改说明：
 */
public class NoScrollListView extends ListView {
    public NoScrollListView(Context context) {
        super(context);
    }

    public NoScrollListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoScrollListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int newHeightSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, newHeightSpec);
    }
}
