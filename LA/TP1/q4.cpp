/*
	TP1 : Langage et automates
	
	Exercice 1.1 : Question 4)

	Rôle : Programme qui lit un flux de caractères (les caractères d’un fichier), 
			  qui sépare les caractères en mots et qui compte ces mots

	Auteurs : Killian GOMES / Emmanuel Ngamije

*/

#include <fstream>
#include <string>
#include <iostream>

using namespace std;

int main ()
{
	ifstream lec("nomfic.txt");
	int cptmot = 0;
	
	if (lec)
	{
		cout << "On entre dans le fichier" << endl;
		string mot;
		while(lec >> mot)
		{
			cptmot ++;
		}
	} 
	else
	{
		cout << "Problème de lecture" << endl;
	}

	cout << "Il y a : " << cptmot << " mots." << endl;

	lec.close();

	return 0;
}
