	.data

question:	.asciiz "Numbers ? " 
answer:		.asciiz "Résultat: "

	.text
	.globl __start

__start:
	jal main		# call main
	li $v0, 10		# end of programm
	syscall
	
main:	
	sub $sp, $sp, 24	# allocation of the space required for main
	sw $ra, 16($sp)		# stock of the adress of return
	
	li $v0, 4		# display of the question (4 for character chain)
	la $a0, question	# load of the question to display
	syscall			# display
		
	li $v0, 5		# input of the user (5 for integer inputs)
	syscall			
	
	move $a0, $v0		# load of the value chosen by the user in $a0
	
	li $v0, 5		# input of the user (5 for integer inputs)
	syscall			
	
	move $a1, $v0		# load of the value chosen by the user in $a0
	
	jal pgcd		# call pgcd
	move $t0, $v0		# copy the result of pgcd in $t0
						
	li $v0, 4		# display of a character chain
	la $a0, answer		# load of the character chain to display
	syscall			# display
	
	li $v0, 1		# display of an integer
	la $a0, ($t0)		# load of the integer to display
	syscall			# diplay
	
	li $v0, 10		# end of programm
	syscall
	
	lw $ra, 16($sp)		# load of the inital value of $ra in $ra
	add $sp, $sp, 24	# liberation of the space used by main
	jr $ra			# jump from $ra
pgcd:
	sub $sp, $sp, 24	# allocation of the space required for pgcd
	sw $ra, 16($sp)		# stock of the adress of return
	sw $a0, 24($sp)		# stock of the 1st argument of pgcd
	sw $a1, 28($sp)		# stock of the 2nd argument of pgcd
	
if1:	bnez $a1,else1		# if1 $a1 != 0, jump to else 1
then1:	la $v0, ($a0)			# load in $v0 the value of $a0
	b endif1			# jump to endif1
else1:				# else1
	rem $t0, $a0, $a1		# stock in $t0 the rest of the division of $a0 by $a1
	move $a0, $a1			# load in $a0 the initial value of $a1
	move $a1, $t0			# load in $a1 the value of $t0 
	jal pgcd			# call pgcd
endif1:				#endif
	
	lw $ra, 16($sp)		# load of the initial value of $ra in $ra
	lw $a0, 24($sp)		# load of the initial value of $a0 in $a0
	lw $a1, 28($sp)		# load of the initial value of $a0 in $a0
	add $sp, $sp, 24	# liberation of the space used by fibo
	jr $ra			# jump from $ra