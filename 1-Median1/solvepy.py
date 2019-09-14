temp = input()
a,b,c = temp.split(" ")
a = int(a)
b = int(b)
c = int(c)

def median():
	if a < b and b <c:
		print(b)
	elif b<a and a <c:
		print(a)
	elif a<c and c<b:
		print(c)
	elif  b<c and c<a:
		print(c)
	elif c<a and a<b:
		print(b)
	elif c<b and b<a:
		print(b)

median()