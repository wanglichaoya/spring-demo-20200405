package com.javacode.demo04;

/**
 * describe:
 * PersonModel中有依赖于2个对象UserModel、CarModel，
 * 下面我们通过spring将UserModel和CarModel创建好，
 * 然后注入到PersonModel中，
 *
 * @author 王立朝
 * @date 2020/04/07
 */
public class PersonModel {

    private MenuModel menuModel;
    private UserModel userModel;

    public PersonModel() {
    }

    public PersonModel(MenuModel menuModel, UserModel userModel) {
        this.menuModel = menuModel;
        this.userModel = userModel;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "menuModel=" + menuModel +
                ", userModel=" + userModel +
                '}';
    }

    public MenuModel getMenuModel() {
        return menuModel;
    }

    public void setMenuModel(MenuModel menuModel) {
        this.menuModel = menuModel;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
