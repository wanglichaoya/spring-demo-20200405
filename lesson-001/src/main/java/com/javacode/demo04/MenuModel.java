package com.javacode.demo04;

/**
 * describe:菜单类
 *
 * @author 王立朝
 * @date 2020/04/07
 */
public class MenuModel {

    //菜单名称
    private String label;
    //同级别排序
    private Integer theSort;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getTheSort() {
        return theSort;
    }

    public void setTheSort(Integer theSort) {
        this.theSort = theSort;
    }

    @Override
    public String toString() {
        return "MenuModel{" +
                "label='" + label + '\'' +
                ", theSort=" + theSort +
                '}';
    }
}
