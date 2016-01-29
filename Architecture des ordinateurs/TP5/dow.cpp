#include <iostream>

using namespace std;

int main()
{
	int jour,mois,annee;
	
	cout << "Jour ?" << endl;
	cin >> jour >> endl;

	cout << "Mois ?" << endl;
	cin >> mois >> endl;

	cout << "Année ?" << endl;
	cin >> annee >> endl;

	if (mois < 3)
	{
		annee = annee - 1;
	}

	int temp = annee;
	int temp2 = annee/4;

	temp = temp+temp2;
	temp2 = annee/100;
	temp = temp - temp2;
	temp2 = temp2/4;
	temp = temp + temp2;
	
	
	return 0;
}
