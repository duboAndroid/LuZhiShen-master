package org.lvu.main.fragments.view_pager_content.text;

import org.lvu.R;
import org.lvu.adapters.BaseListAdapter;
import org.lvu.adapters.SubAdapters.text.Text5Adapter;
import org.lvu.models.Data;

import java.util.ArrayList;

/**
 * Created by wuyr on 1/10/17 10:15 PM.
 */

public class Text5Fragment extends Text1Fragment {
    @Override
    protected BaseListAdapter getAdapter() {
        return new Text5Adapter(getActivity(), R.layout.adapter_list_item, new ArrayList<Data>());
    }

    @Override
    public void saveAdapterData() {
        if (mAdapter == null) return;
        try {
            mAdapter.saveDataToStorage(openFileOutput(Text5Fragment.class.getSimpleName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void restoreAdapterData() {
        if (mAdapter == null) return;
        try {
            mAdapter.restoreDataFromStorage(openFileInput(Text5Fragment.class.getSimpleName()));
        } catch (Exception e) {
            mAdapter.syncData("");
        }
    }
}
