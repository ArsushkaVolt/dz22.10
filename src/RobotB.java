public class RobotB extends Robot{
    public RobotB() {
        super("B");
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
