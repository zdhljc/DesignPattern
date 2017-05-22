package adapter;

import adapter.classes.Adapter;
import adapter.classes.Target;

public class ClassClient
{
    public static void main( String[] args )
    {
        Target target = new Adapter();
        target.request();
    }
}
