package frame.havery.com.ui.adapter.display;

import android.view.ViewGroup;

import frame.havery.com.ui.adapter.viewholder.BaseRecyclerViewHolder;


/**
 * @author:YJJ
 * @date:2015/10/22
 * @email:yangjianjun@117go.com
 */
public interface DisplayBean<VH extends BaseRecyclerViewHolder> {

    VH createHolder(ViewGroup parent);
}
