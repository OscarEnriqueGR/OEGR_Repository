A= int (input ("Primer lado del triángulo "))
B= int (input ("Segundo lado del triángulo "))
C= int (input ("Terncer lado del triángulo "))
if A == B and B == C:
    print ("Equilatero")
elif (A == B and A != C) or (A == C and A != B) or (B == C and B != A):
    print ("Isósceles")
else:
    print ("Escaleno")