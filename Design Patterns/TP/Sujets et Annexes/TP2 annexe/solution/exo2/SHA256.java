import java.security.*;
import java.math.*;

public class SHA256 implements CrypteStrategy
{
  private MessageDigest m;

  public SHA256() throws Exception
  {
    m = MessageDigest.getInstance( "SHA-256" );
  }

  public String encode(String s)
  {
    m.update( s.getBytes(), 0, s.length() );
    return new String( m.digest() );
  }
}