import java.security.MessageDigestSpi;

class Main
{
	public static void main(String[] args)
	{
		Cryptage crypt = new Cryptage(new CryptageMD5());

		String cryptee = crypt.crypterChaine("Coucou");
		System.out.println(cryptee);

		crypt.setTypeCryptage(new CryptageSHA256());
		cryptee = crypt.crypterChaine("Coucou");
		System.out.println(cryptee);

		crypt.setTypeCryptage(new CryptageSHA512());
		cryptee = crypt.crypterChaine("Coucou");
		System.out.println(cryptee);
	}


}