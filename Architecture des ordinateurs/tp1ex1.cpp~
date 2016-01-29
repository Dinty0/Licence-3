/*
	TP1 : Architecture des ordinateurs
	Exercice 1.

	Enoncé : Écrire une fonction base_converter() prenant en entrée une chaîne 
			de caractères string C++ ou char[] C), une base de départ, une base 
			d’arrivée, et retournant une chaîne de caractères correspondant à la
 			chaîne initiale exprimée dans la base d’arrivée. On considérera que 
			les bases de départ et d’arrivée sont comprises entre 2 et 36 inclus.
*/

#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <fstream>
#include <string>
using namespace std;

unsigned int value_of_digit(char c)
{
	if (c>='0' && c<= '9')
	{
		return c-'0';
	}
	else if(c>='A' && c<= 'Z')
	{
		return 10 +c -'A';
	}
	exit(0);
}

string base_converter(string val, unsigned int entre, unsigned int sortie){

	string digit ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	if (sortie < 2 || sortie >36)
	{
		cout << "Entrez une base de sortie entre 2 et 36" << endl;
		exit(0);
	}

	int value = 0;
	int position = 1;

	for (int i=val.size(); i>0; i--)
	{
		value += value_of_digit( val[i-1] ) * position;
		position *= entre;
	}
	
	string result = "";
	while (value > 0)
	{
		result = digit[value%sortie] + result;
		value = value / sortie;
	}
	return result;
} 
	
int main()
{
	string nb = "0";
	int entre;
	int sortie;

	cout << "Ecrivez en MAJUSCULE, merci" << endl;
	
	cout << "Nombre = ";
	cin >> nb;
	cout << "Base en entrée = ";
	cin >> entre;
	cout << "Base en sortie = ";
	cin >> sortie;

	cout << "" << endl;
	cout << "Résultat = " << base_converter(nb, entre, sortie) << endl;

	return 0;
}
