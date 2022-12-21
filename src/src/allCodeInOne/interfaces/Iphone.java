package allCodeInOne.interfaces;

public class Iphone implements Phone  {
    @Override
    public String processor() {
        return "All";
    }

    @Override
    public String ram() {
        return "12GB";
    }

    @Override
    public String rom() {
        return "128GB";
    }

    @Override
    public String model() {
        return "13Pro";
    }
}
