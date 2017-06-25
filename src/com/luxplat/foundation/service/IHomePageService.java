package com.luxplat.foundation.service;

import com.luxplat.core.query.support.IPageList;
import com.luxplat.core.query.support.IQueryObject;
import com.luxplat.foundation.domain.HomePage;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IHomePageService
{
  public abstract boolean save(HomePage paramHomePage);

  public abstract HomePage getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(HomePage paramHomePage);

  public abstract List<HomePage> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}


