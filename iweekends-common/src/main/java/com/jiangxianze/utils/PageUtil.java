package com.jiangxianze.utils;

import java.io.Serializable;

/**
 * @author lixuechao
 */

public class PageUtil implements Serializable {

    public final static int START_PAGE = 0;
    public final static int END_PAGE = 10;

    public static final String START = "start";
    public static final String END = "end";
    public static final String PAGE_START = "pageStart";
    public static final String PAGE_ROWS = "pageRows";

    // 转换查询的分页参数 limit m,n /m=(pageIndex-1)*pageSize,n=pageSize

    public static int getStart(Page page) {
        return page.getPageIndex() == null ? START_PAGE : (page.getPageIndex() - 1) * page.getPageSize();
    }

    public static int getEnd(Page page) {
        return page.getPageSize() == null ? END_PAGE : page.getPageSize();
    }

}
