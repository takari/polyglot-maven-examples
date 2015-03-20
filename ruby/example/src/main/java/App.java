import org.bouncycastle.jce.provider.BouncyCastleProvider;

class App
{
    public static String bcInfo() {
	return new BouncyCastleProvider().getInfo();
    }
}
