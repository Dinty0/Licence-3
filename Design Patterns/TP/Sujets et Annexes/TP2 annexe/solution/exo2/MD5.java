import java.security.*;
import java.math.*;

public class MD5 implements CrypteStrategy
{
  private MessageDigest m;

  public MD5() throws Exception
  {
    m = MessageDigest.getInstance( "MD5" );
  }

  public String encode(String s)
  {
    m.update( s.getBytes(), 0, s.length() );
    return new String( m.digest() );
  }
}