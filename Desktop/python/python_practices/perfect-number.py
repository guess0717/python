
number = 50
totalfactor = 0
for i in range(1, number / 2+1):
    if number % i == 0:
            totalfactor += i
	            print str(i) + ' '

		    if totalfactor == number:
		        print "true"
