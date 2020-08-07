# regularexpression

In this assignment, there is a fixed set of regular expressions but no built-in method or package is implemented. All the methods are written.
In Regular Expression (RE), '*' means occurrence of zero of more characters, '+' indicates happening of one or more characters, '?'  means only once or not at all occurrence, '[ ]' indicates happening of inclusive characters, '^' indicates that next characters will not be used in the pattern, '[a-d]{3}' indicates that valid string will be exactly of  length 3 inclusively using a, b, c, d.

The following table contains a fixed set of RE that will be used in this assignment.

Description	RE	Valid	Invalid
Zero or more	a(bc)*de	ade
abcbcde	abde
abcbde
One or more	a(bc)+de	abcde
abcbcde	ade
abc
Once or not at all	a(bc)?de	ade
abcde	abc
abcbcde
Character classes	[a-m]*	blackmail
imbecile	above
below
Negation of character classes	[^aeiou]	b
c	a
e
