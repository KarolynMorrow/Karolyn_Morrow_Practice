package OOP.classes_labs;

public class Phone {
    private String brand;
    private boolean isTouchScreen;
    private boolean isSmartPhone;
    private double screenSize;
    private String cameraType;
    private String chargerType;

    public Phone(String brand, boolean isTouchScreen, boolean isSmartPhone, double screenSize, String cameraType, String chargerType) {
        this.brand = brand;
        this.isTouchScreen = isTouchScreen;
        this.isSmartPhone = isSmartPhone;
        this.screenSize = screenSize;
        this.cameraType = cameraType;
        this.chargerType = chargerType;
    }
//------------------Getters and Setters------------------
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

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }
//------------------Class Methods------------------

    /*Static methods do not rely on object information to run. They are given information to work with. Instance methods rely on information inside objects to run
    * Static methods -> Class.add(x,y);
      Instance methods => car.getNumberOfWheels();*/

    public void ringTone(){
        if (isSmartPhone) {
            System.out.println("ring ring ring");
        }
    }

    public static void protectionPlan(Phone phone){
        if(phone.getBrand().equals("apple")){
            System.out.println("You have a protection plan");
        }
    }

    public static String phoneBreakdown(Phone phone) {
        System.out.println("The " + phone.getBrand()+ " phone has a screen size of " + phone.getScreenSize() +
                " inches with a " + phone.getCameraType() + " camera and utilizes a " + phone.getChargerType());
        return null;
    }


}
