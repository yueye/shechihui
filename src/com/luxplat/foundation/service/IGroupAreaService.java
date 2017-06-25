package com.luxplat.foundation.service;

import com.luxplat.core.query.support.IPageList;
import com.luxplat.core.query.support.IQueryObject;
import com.luxplat.foundation.domain.GroupArea;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGroupAreaService
{
  public abstract boolean save(GroupArea paramGroupArea);

  public abstract GroupArea getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(GroupArea paramGroupArea);

  public abstract List<GroupArea> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}


