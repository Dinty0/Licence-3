package tp4.ex3;
/*
import java.util.*;
import java.net.*;
import java.io.*;
*/

public class Client {

	public static void main(String[] args){
		
		Bourse bourse = new Bourse();
		Trader t = new Trader(bourse);
		
		for(int i = 0; i<5; ++i){
			try{
				bourse.setBourse();
			}catch (Exception e){
				
			}
			t.afficher();
			try {
				Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
