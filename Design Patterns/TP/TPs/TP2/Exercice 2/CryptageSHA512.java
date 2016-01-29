import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.lang.Exception;

class CryptageSHA512 implements TypeCryptage
{
	public String crypter(String aCrypter)
	{
		byte[] b = aCrypter.getBytes();
		try 
		{
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			md.update(b);
			String cryptee = new String(md.digest(), StandardCharsets.UTF_8);
			return cryptee;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return("Erreur SHA512\n");
		}
	}
}