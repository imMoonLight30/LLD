public class Solid{
    /*
     * S- single responcibility to change (class should have one resion to change)
     * O- Open/Close principle (class should be open for extension but close for modification)
     * L- Liskov substitution principle (subclass should extend the capability of parant class, not narrow it down)
     * I- Interface segment principle (interface should be such that, client shouldn't inplement uncessary functions that they do not need)
     * D- Dependancy inversion principle (class should depends on interface rather than concrete class)
     */
    public void S(){
        //one class should have only one responcibility - which enable one resion to change
        //(easy to maintain),(easy to understand)
    }
    public void O(){
        //already tested or live class to modify mt kro, extend it and increase the functionality
    }
    public void L(){
        // parant - child  , then child can replace obj of parant without braking (example - bike -> Motorcycle, Bicycle)
        //capabillity should increase not narrow it down
    }
    public void I(){
        //shold not implement function that they do not need.
        //so , interface ko itne choote choote parts me baato ki , to client to unnessary function implement na krna pade
    }
    public void D(){
        //
    }
}