package frame.havery.com.ui.widget.other;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * com.xiaoduo.mydagong.mywork.view.view.widget/wodedagong3.0-20150715-harvey
 * 作者：Harvey on 2016/3/21 10:54
 * 邮箱：497823256@qq.com
 * 说明：
 * 修改：
 * 修改说明：
 */
public class NoScrollGridView extends GridView {

    public NoScrollGridView(Context context) {
        super(context);

    }

    public NoScrollGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}