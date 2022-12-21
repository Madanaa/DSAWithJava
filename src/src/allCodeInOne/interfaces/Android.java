package allCodeInOne.interfaces;

public class Android implements Phone{
    @Override
    public String processor() {
        return "845";
    }

    @Override
    public String ram() {
        return "4GB";
    }

    @Override
    public String rom() {
        return "64GB";
    }

    @Override
    public String model() {
        return "31A";
    }
}
