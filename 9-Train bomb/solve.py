n = int(input())
b = int(input())
if((n<=2) or (n<=3 and b==2)):
	print("DIE")
else:
	for i in range(1,n+1):
		if(i != b-1 and i != b and i != b+1):
			print(i,end=" ")
print()