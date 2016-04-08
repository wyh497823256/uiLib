/**
 *
 * Copyright 2014 Travo, Inc. All rights reserved.
 * IDataConsumer.java
 *
 */
package frame.havery.com.ui.adapter;

import java.util.List;

public interface IDataConsumer<T>
{
    void loadData(List<? extends T> data);
}
