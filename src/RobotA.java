public class RobotA extends Robot {


    public RobotA() {
        super("A");
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void sayHello() {
        System.out.println("Привет, модель " + getModel());
    }
}
