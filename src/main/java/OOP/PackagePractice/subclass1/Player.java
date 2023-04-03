package OOP.PackagePractice.subclass1;

public class Player {
    private int x;

    public void myMethod(){
        myMethodPrivate();
    }

    private void myMethodPrivate(){
    }

    protected void myMethodProtected(){
    }
    void myMethodDefault(){
    }
}

/*
* Modifier   Class Package Subclass World
*
* Public      Y      Y        Y       Y
* Protected   Y      Y        Y       N
* Default     Y      Y        N       N
* Private     Y      N        N       N
*
* Private - Should only be accessible within the class
* Public - Should be accessible from anywhere
* Protected - Should be accessible within the class and its subclasses.
* */
