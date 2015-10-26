# encoding: utf-8
# 1~4可以組合多少組不重複的數字?
for a in range(1,5):
	for b in range(1,5):
		for c in range(1,5):
			if a!=b&a!=c&b!=c:
					print a,b,c