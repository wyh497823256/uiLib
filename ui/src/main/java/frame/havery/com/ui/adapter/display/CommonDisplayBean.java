package frame.havery.com.ui.adapter.display;

import android.view.ViewGroup;

import frame.havery.com.ui.adapter.viewholder.BaseRecyclerViewHolder;


/**
 * @author:YJJ
 * @date:2015/10/22
 * @email:yangjianjun@117go.com
 */
public class CommonDisplayBean extends BaseDisplayBean<BaseRecyclerViewHolder> {
    private int layoutId;

    public CommonDisplayBean(int layoutId) {
        this.layoutId = layoutId;
    }

    @Override
    public BaseRecyclerViewHolder createHolder(ViewGroup parent) {
        return new BaseRecyclerViewHolder(getView(parent, layoutId));
    }
}
