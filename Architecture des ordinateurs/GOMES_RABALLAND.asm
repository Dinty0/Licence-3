	.data
	
str:	.asciiz "12345"
res1:	.asciiz "strlen(\"12345\") = " 
res2:	.asciiz "\n"
empty:	.asciiz "\0"

	.text
	.globl __start

__start:
	jal main		# call main
	li $v0, 10		# end of programm
	syscall
	
main:
	sub $sp, $sp, 24	# allocation of the space required for main
	sw $ra, 16($sp)		# stock of the adress of return
	sw $s0, 20($sp)
	
	la $a0, str		# load of the paramater of strlen
	jal strlen		# call of strlen
	move $s0, $v0		# getting the result in $t0
	
	li $v0, 4		# display of the question (4 for character chain)
	la $a0, res1		# load of the question to display
	syscall			# display
		
	li $v0, 1		# display of the result of strlen 
	move $a0, $s0
	syscall			
						
	li $v0, 4		# display of a character chain
	la $a0, res2		# load of the character chain to display
	syscall			# display

	li $v0, 10		# end of programm
	syscall
	
	lw $s0, 20($sp)
	lw $ra, 16($sp)		# load of the inital value of $ra in $ra
	add $sp, $sp, 24	# liberation of the space used by main
	jr $ra			# jump from $ra
	
strlen:
	sub $sp, $sp, 24	# allocation of the space required by strlen
	sw $ra, 16($sp)		# stock of the return adress
if:
	la $t0, empty		# load "\0" in $t0
	bne $a0, $t0, else	# if $a0 != "\0"
then:
	li $v0, 0		# return 0
	b endif
else:
	add $a0, $a0, 1		# else return strlen(s+1) +1
	jal strlen
	add $v0, $v0, 1
endif:

	lw $ra, 16($sp)		# load of the return adress
	add $sp, $sp, 24	# liberation of the space
	jr $ra			# jump