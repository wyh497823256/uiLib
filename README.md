**我的UI视图库**
-----------
**HaoRecyclerView的使用方式**

 
 1. 布局

        <LinearLayout
         xmlns:android="http://schemas.android.com/apk/res/android"
                android:orientation="vertical" android:layout_width="match_parent"
                android:layout_height="match_parent">
                 <android.support.v4.widget.SwipeRefreshLayout
                    android:id="@+id/swiperefresh"
                 android:layout_width="match_parent"
                   android:layout_height="match_parent">
                   <me.fangx.haorefresh.HaoRecyclerView
                     android:id="@+id/hao_recycleview"
                    android:layout_width="match_parent"
                       android:layout_height="match_parent" />
               </android.support.v4.widget.SwipeRefreshLayout>
       </LinearLayout>
    

 2. 主要代码
 

           HaoRecyclerView hao_recycleview;
                      hao_recycleview.setAdapter(homeListAdapter);
                         swiperefresh.setColorSchemeResources(R.color.textBlueDark,
					     R.color.textBlueDark, R.color.textBlueDark,


                            R.color.textBlueDark);
                    swiperefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                        @Override
                        public void onRefresh() {
                            page = 1;
                            homePresenter.loadList(page);
                        }
                    });
                    LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
                    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                    hao_recycleview.setLayoutManager(layoutManager);
                //设置自定义加载中和到底了效果
                ProgressView progressView = new ProgressView(mContext);
                progressView.setIndicatorId(ProgressView.BallPulse);
                progressView.setIndicatorColor(0xff69b3e0);
                hao_recycleview.setFootLoadingView(progressView);
                TextView textView = new TextView(mContext);
                textView.setText("已经到底啦~");
                hao_recycleview.setFootEndView(textView);
                hao_recycleview.setLoadMoreListener(new LoadMoreListener() {
                    @Override
                    public void onLoadMore() {
                        page++;
                        homePresenter.loadList(page);
                    }
                });

刷新结束

      hao_recycleview.refreshComplete();
      hao_recycleview.loadMoreComplete();
       swiperefresh.setRefreshing(false);

**BottomBar的使用方式**

      private BottomBar mBottomBar;
      mBottomBar = BottomBar.attach(this, savedInstanceState);  mBottomBar.setFragmentItems(getSupportFragmentManager(), R.id.fragmentContainer,
    new BottomBarFragment(SampleFragment.newInstance("Content for recents."), R.drawable.ic_recents, "Recents"),
                    new BottomBarFragment(SampleFragment.newInstance("Content for favorites."), R.drawable.ic_favorites, "Favorites"),
                    new BottomBarFragment(SampleFragment.newInstance("Content for nearby stuff."), R.drawable.ic_nearby, "Nearby"),
                    new BottomBarFragment(SampleFragment.newInstance("Content for friends."), R.drawable.ic_friends, "Friends"),
                    new BottomBarFragment(SampleFragment.newInstance("Content for food."), R.drawable.ic_restaurants, "Food")
            );
    
            // Setting colors for different tabs when there's more than three of them.
            // You can set colors for tabs in three different ways as shown below.
            mBottomBar.mapColorForTab(0, ContextCompat.getColor(this, R.color.colorAccent));
            mBottomBar.mapColorForTab(1, 0xFF5D4037);
            mBottomBar.mapColorForTab(2, "#7B1FA2");
            mBottomBar.mapColorForTab(3, "#FF5252");
            mBottomBar.mapColorForTab(4, "#FF9800");
    
            mBottomBar.makeBadgeForTabAt(0, "#7B1FA2",5);
        
    
        @Override
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
    
            // Necessary to restore the BottomBar's state, otherwise we would
            // lose the current tab on orientation change.
            mBottomBar.onSaveInstanceState(outState);
        } }

----------
**如何使用**
	Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.wyh497823256:uilib:1.0.7'
	}
Share this release:
**引用第三方**

 - 工具类：https://github.com/l123456789jy/Lazy
 - BottomBar: https://github.com/roughike/BottomBar
 - UI库: https://github.com/fangx/ZhiHuMVP
 - Recyclerview:https://github.com/fangx/HaoRefresh

