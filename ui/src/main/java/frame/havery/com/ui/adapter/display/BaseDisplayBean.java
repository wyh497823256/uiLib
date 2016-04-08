package frame.havery.com.ui.adapter.display;

import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import frame.havery.com.ui.adapter.viewholder.BaseRecyclerViewHolder;


/**
 * @author:YJJ
 * @date:2015/10/22
 * @email:yangjianjun@117go.com
 */
public abstract class BaseDisplayBean<VH extends BaseRecyclerViewHolder> implements DisplayBean<VH> {
    protected View getView(ViewGroup parent, @LayoutRes int layoutId) {
        return LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
    }
}
