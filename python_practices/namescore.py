# coding: utf-8
filled_dict = {"A": 1, "B": 2, "C": 3, "D": 4, "E": 5,"F": 6,"G": 7,"H": 8,"I": 9,"J":10,"K": 11,"L": 12}
List1=["CDEF","ABC","FIJK"]
List1=sorted(List1)
newlist=[]
newlist1=[]
#print List1
for i in List1:
	sum=0
	for char in i:
		x=filled_dict[char]
		sum=sum+x
	newlist.append(sum)
#print newlist
for a in range (len(newlist)):
	y=newlist[a]*(a+1)
	newlist1.append(y)
#print newlist1
sum=0
for g in newlist1:
	sum+=g
print sum
