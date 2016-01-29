#include <string>
#include <iostream>
#include <fstream> 

using namespace std;

int main(){
	string mot;
	int cpt=0;
	ifstream f;
	f.open("germinal2.txt",ifstream::in);
	while(f.good()){
		f>>mot;
		cpt++;
	}
	cout<<cpt<<endl;
f.close();
return 0;
	
	
}
	
