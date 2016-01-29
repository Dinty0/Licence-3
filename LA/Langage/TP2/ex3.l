
%%
Yacc printf("{1}");
^From printf("{2}");
\32\+{3,10}\32 printf("{3}");
%%
main(){
	yylex();
}
