package adapter;

import adapter.instance.Adapter;
import adapter.instance.Target;

public class InstanceClient
{
    public static void main( String[] args )
    {
        Target target = new Adapter();
        target.request();
    }
}
