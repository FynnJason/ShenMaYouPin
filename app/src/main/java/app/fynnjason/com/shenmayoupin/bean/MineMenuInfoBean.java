package app.fynnjason.com.shenmayoupin.bean;

public class MineMenuInfoBean {
    public MineMenuInfoBean(String menuName, int menuImg) {
        this.menuName = menuName;
        this.menuImg = menuImg;
    }

    private String menuName;
    private int menuImg;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuImg() {
        return menuImg;
    }

    public void setMenuImg(int menuImg) {
        this.menuImg = menuImg;
    }
}
