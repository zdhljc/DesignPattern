package adapter.instance;

public class Adapter extends Target
{
    private Adaptee myAdaptee = new Adaptee();

    @Override
    public void request()
    {
        myAdaptee.specificRequest();
    }
}
