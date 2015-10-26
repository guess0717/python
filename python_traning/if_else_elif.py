# # coding:utf-8
# 題目:一個數字範圍，可以被3整除的印出xx，被5整除的，印出xx，可以同時被5跟3整除的印出xx
# for i in range(1,101):
# 	#當i除3與i除5可以整除時，就印出Bingo
# 	# if i%3==0:
# 	# 	if i%5==0:
# 	# 		print i,'Bingo'
# 		#當i除3等於0，但i除以5無法整除時，就跳出迴圈印出buzz
# 		else:
# 			print i,'buzz'
# 	elif i%5==0:
# 		print i,'bing'

# 另一種寫法
for i in range(1,101):
	if i%3==0 and i%5==0:
		print i,'bingo'
	elif i%3==0:
		print i,'buzz'
	elif i%5==0:
		print i,'bing'
