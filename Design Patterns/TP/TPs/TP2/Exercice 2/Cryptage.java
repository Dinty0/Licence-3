import java.security.MessageDigestSpi;

class Cryptage
{
	private TypeCryptage _typecryptage;

	public Cryptage(TypeCryptage typecryptage)
	{
		_typecryptage = typecryptage;
	}

	public TypeCryptage getTypeCryptage()
	{
		return _typecryptage;
	}

	public void setTypeCryptage(TypeCryptage typecryptage)
	{
		_typecryptage = typecryptage;
	}

	public String crypterChaine(String aCrypter)
	{
		return (_typecryptage.crypter(aCrypter));
	}
}