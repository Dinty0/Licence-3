%%
"Yacc"		ECHO; printf("(1)\n");
^"From"		ECHO; printf("(2)\n");
^\+{3,10}$	ECHO; printf("(3)\n");
[A-Za-z_][A-Za-z_0-9]*	ECHO; printf("(4)\n");
.|[\n]		;
%%
main(){
	yylex();
}