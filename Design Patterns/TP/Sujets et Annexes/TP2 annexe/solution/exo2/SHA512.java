import java.security.*;
import java.math.*;

public class SHA512 implements CrypteStrategy
{
  private MessageDigest m;

  public SHA512() throws Exception
  {
    m = MessageDigest.getInstance( "SHA-512" );
  }

  public String encode(String s)
  {
    m.update( s.getBytes(), 0, s.length() );
    return new String( m.digest() );
  }
}