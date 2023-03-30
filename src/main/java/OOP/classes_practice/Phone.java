package OOP.classes_practice;

public class Phone {
    private String brand;
    private boolean isTouchScreen;
    private boolean isSmartPhone;

    public Phone(String brand, boolean isTouchScreen, boolean isSmartPhone) {
        this.brand = brand;
        this.isTouchScreen = isTouchScreen;
        this.isSmartPhone = isSmartPhone;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    public boolean isSmartPhone() {
        return isSmartPhone;
    }

    public void setSmartPhone(boolean smartPhone) {
        isSmartPhone = smartPhone;
    }

    public void ringTone(){
        if (isSmartPhone) {
            System.out.println("ring ring ring");
        }
    }

    public void protectionPlan(){
        if(brand != "apple"){
            System.out.println(false);
        }
    }


}
